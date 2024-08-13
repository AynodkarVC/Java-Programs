package AdvancedJava.RMI;
import javax.swing.event.CaretListener;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Vector;

public interface RMIChatServer extends UnicastRemoteObject implements ChatServerInterface {
    String identity = "mikado";
    Vector<ClientInfo> v;

    public RMIChatServer() throws RemoteException{
        v= new Vector<ClientInfo>();
        try {
            LocateRegistry.createRegistry(1099);
            Naming.rebind(identity.this);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void login(String name, ChatClientInterface ref ){
        ClientInfo ci = new ClientInfo(name,ref);
        v.add(ci);
        brodcastMsg(name + "has logged in");
        broadcastList();
    }

    public void takeMsg(String msg){
        broadcastMsg(msg);
    }

    class ClientInfo{
        String name;
        ChatClientInterface ref;

        public ClientInfo(String name; ChatClientInterface ref){
            
        }
    }
}
