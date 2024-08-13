package AdvancedJava.RMI;
import java.rmi.*;
import java.util.Vector;

public interface ChatClientInterface {
    public void takeMsg(String msg) throws RemoteException;
    public void takeClientList(Vector<String> clients) throws RemoteException;
}
