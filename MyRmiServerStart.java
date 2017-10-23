package myRmi;
import java.rmi.registry.*;
import java.rmi.Naming;
//import java.util.Integer

public class MyRmiServerStart { 
	public static void main(String[] args){
		MyRmiServer obj;
		try{
			System.out.println("Creating registry on port:" + args[0]);
			LocateRegistry.createRegistry(Integer.parseInt(args[0]));	
			obj = new MyRmiServer();	
			Naming.rebind("//localhost/MyRmiServer", obj);
		} catch (Exception e) {
			System.out.println("Exception occured:" + e.toString() );
		}
		System.out.println("//localhost/MyRmiServer Bound");
	}
}
