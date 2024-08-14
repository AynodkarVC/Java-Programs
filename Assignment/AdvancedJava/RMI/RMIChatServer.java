package AdvancedJava.RMI;
import javax.swing.event.CaretListener;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Enumeration;
import java.util.Vector;
import java.util.concurrent.ExecutionException;

public class RMIChatServer extends UnicastRemoteObject implements ChatServerInterface {
    String identity = "mikado";
    Vector<ClientInfo> v;

    public RMIChatServer() throws RemoteException{
        v= new Vector<ClientInfo>();
        try {
            LocateRegistry.createRegistry(1099);
            Naming.rebind(identity,this);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void login(String name, ChatClientInterface ref ){
        ClientInfo ci = new ClientInfo(name,ref);
        v.add(ci);
        broadcastMsg(name + "has logged in");
        broadcastList();
    }

    public void takeMsg(String msg){
        broadcastMsg(msg);
    }

    class ClientInfo{
        String name;
        ChatClientInterface ref;

        public ClientInfo(String name, ChatClientInterface ref){
            this.name=name;
            this.ref=ref;
        }
        public boolean equals(Object o){
            if ( o instanceof ClientInfo){
                return ((ClientInfo)o).name.equals(name);
            }else {
                return false;
            }
        }
    }

    public void logout(String name){
        v.remove(new ClientInfo(name,null));
        broadcastMsg(name + "has logged out");
        broadcastList();
    }

    public void broadcastMsg(String msg){
        Enumeration<ClientInfo> en = v.elements();
        while(en.hasMoreElements()){
            ClientInfo ci =en.nextElement();
            try{
                ci.ref.takeMsg(msg);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public void broadcastList(){
        Vector<String> v2 = new Vector<String>();
        Enumeration<ClientInfo> en = v.elements();
        while(en.hasMoreElements()){
            ClientInfo ci = en.nextElement();
            v2.add(ci.name);
        }
        Enumeration<ClientInfo> en1 = v.elements();
        while(en1.hasMoreElements()){
            ClientInfo ci = en1.nextElement();
            try{
                ci.ref.takeClientList(v2);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String args[]){
        try{
            new RMIChatServer();
            System.out.println("Running...... ");
            System.out.println("Opening new terminal .....");


            // command to open  2 new terminal
            String command = "cmd /c start cmd /K \"cd " + System.getProperty("user.dir") + "\"";
            Runtime.getRuntime().exec(command);
            Runtime.getRuntime().exec(command);

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
