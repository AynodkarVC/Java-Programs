package AdvancedJava.RMI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;
import java.util.Enumeration;
import java.util.Vector;

public class RMIChatClient extends JFrame  implements ActionListener, ChatClientInterface {
    JTextArea jta;
    JList list;
    JTextField jtf;
    JButton jbtn;
    JScrollPane jsp1,jsp2;
    DefaultListModel model;
    ChatServerInterface csi;
    String myName;

    public RMIChatClient(String name){
        super("ChatClient "+ name);
        myName = name;

        setResizable(false);
        setSize(720,475);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        jta = new JTextArea();
        jsp1 = new JScrollPane(jta);
        jsp1.setBounds(5,5,500,400);
        add(jsp1);

        model = new DefaultListModel();

        list = new JList(model);
        jsp2 = new JScrollPane(list);
        jsp2.setBounds(510,5,200,25);
        add(jsp2);

        jtf = new JTextField();
        jtf.setBounds(5,410,200,25);
        add(jtf);

        jbtn = new JButton("Send");
        jbtn.setBounds(510,410,200,25);
        add(jbtn);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    csi.logout(myName);
                } catch (Exception e1) {
                    System.out.println(e1);
                }
            }
        });
        jtf.addActionListener(this);
        jbtn.addActionListener(this);
        jta.setEditable(false);
        setVisible(true);

        try{
            csi = (ChatServerInterface) Naming.lookup("rmi://localhost:1099/mikado");
            UnicastRemoteObject.exportObject(this);
            csi.login(myName, this);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void actionPerformed(ActionEvent e){
        String msg = jtf.getText();
        msg = myName + " : " + msg;
        try{
            csi.takeMsg(msg);
        }catch (Exception e1){
            System.out.println(e1);
        }
        jtf.setText("");
    }

    public void takeMsg(String msg){
        jta.append(msg + "\n");
    }

    public void takeClientList(Vector<String> clients){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                model.removeAllElements();
                Enumeration<String> en = clients.elements();
                while (en.hasMoreElements()){
                    String s = en.nextElement();
                    model.addElement(s);
                }
            }
        });
    }

    public static void main(String[] args){
        RMIChatClient app = new RMIChatClient(args[0]);
    }
}
