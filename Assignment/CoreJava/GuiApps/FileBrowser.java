//package CoreJava.GuiApps;
//
//import  javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.io.*;
//
//public class FileBrowser extends JFrame{
//    Panel1 p1;
//    Panel2 p2;
//    Panel3 p3;
//    Panel4 p4;
//
//    public FileBrowser(){
//        //super("File Browser");
//
//        p2 = new Panel2();
//        p3 = new Panel3();
//        p4 = new Panel4();
//        p1 = new Panel1(p2,p3,p4);
//
//
//        add(p1,BorderLayout.NORTH);
//        add(p2,BorderLayout.WEST);
//        add(p3,BorderLayout.EAST);
//        add(p4,BorderLayout.SOUTH);
//        addWindowListener(new WindowAdapter(){
//            public void windowClosing(WindowEvent e){
//                System.exit(0);
//            }
//        });
//        setTitle("FileBrowser");
//        setSize(600,500);
//        setVisible(true);
//    }
//
//    public static void main(String[] args){
//        new FileBrowser1();
//    }
//}
//
//class Panel1 extends Panel{
//    JTextField t11;
//    JButton b11;
//    String fileName = null;
//    File f;
//    Panel2 p2;
//    Panel3 p3;
//    Panel4 p4;
//
//    public Panel1(Panel2 p2, Panel3 p3, Panel4 p4){
//        this.p2 = p2;
//        this.p3 = p3;
//        this.p4 = p4;
//
//        add(t11 = new JTextField(15));
//        add(b11 = new JButton("Click"));
//
//        b11.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                fileName = t11.getText();
//                f = new File(fileName);
//                p2.updateContent(fileName, f);
//                p3.updateContent(fileName, f);
//                p4.updateContent(fileName, f);
//
//            }
//        });
//    }
//    public File getFile(){
//        return f;
//    }
//    public String getFileName(){
//        return fileName;
//    }
//}
//
//class Panel2 extends Panel{
//    JTextArea t21;
//    public Panel2() {
//        add(t21 = new JTextArea(20, 25));
//    }
//    public void updateContent(String fileName, File f){
//        t21.setText("");
//        if (fileName!=null) {
//            if(f.isFile()) {
//                try {
//                    FileInputStream fis = new FileInputStream(f);
//                    DataInputStream dis = new DataInputStream(fis);
//                    String s = "";
//                    while ((s = dis.readLine()) != null) {
//                        t21.append(s + "\n");
//                    }
//                    dis.close();
//                } catch (Exception e){
//                    System.out.println(e);
//                }
//            }
//        }
//    }
//}
//
//class Panel3 extends Panel{
//    JTextArea t31;
//    public Panel3(){
//        add(t31 = new JTextArea(20,25));
//    }
//    public void updateContent(String fileName, File f) {
//        t31.setText("");
//        if (fileName!=null) {
//            if(f.isDirectory()){
//                String[] str = f.list();
//                for (String s : str){
//                    t31.append(s + "\n");
//                }
//            }
//        }
//    }
//}
//
//class Panel4 extends Panel{
//    JTextField t41;
//
//    public Panel4(){
//        add(t41 = new JTextField(15));
//    }
//
//    public void updateContent(String fileName, File file) {
//        if (fileName == null || file == null) {
//            t41.setText("Enter Valid Input");
//        } else if (!file.isFile() && !file.isDirectory()) {
//            t41.setText("Enter Valid Input");
//        } else {
//            t41.setText("");
//        }
//    }
//}
//
