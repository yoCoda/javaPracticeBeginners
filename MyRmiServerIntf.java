package myRmi;
import java.rmi.Remote;
import java.rmi.RemoteException;

interface MyRmiServerIntf extends Remote {
	public String getMessage(String junk) throws RemoteException;
	public String getMessage() throws RemoteException;
}
