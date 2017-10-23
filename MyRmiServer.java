package myRmi;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class MyRmiServer extends UnicastRemoteObject implements MyRmiServerIntf{
	public MyRmiServer() throws RemoteException { super(0); }
	public String getMessage(String inMsg) { return "Server uvach:" + inMsg; }
	public String getMessage() { return "Server uvach: say what?"; }
}
