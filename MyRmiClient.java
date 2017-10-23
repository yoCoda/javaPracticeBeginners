package myRmi;
import java.rmi.Remote;
import java.rmi.Naming;
import java.rmi.RemoteException;
//import java.lang.StringBuffer;
//import java.lang.StringBuffer;
//import java.lang.StringBuffer;
//import java.lang.StringBuffer;
//import java.lang.StringBuffer;

public class MyRmiClient{
	public static void main(String[] args) throws Exception{
		MyRmiServerIntf obj = (MyRmiServerIntf)Naming.lookup("//localhost/MyRmiServer");
		StringBuffer allIn = new StringBuffer(); 
		for(int i = 0; i < args.length; i++ ) allIn.append(args[i] + " " );
		String s=new String(allIn);
		System.out.println(obj.getMessage(allIn.toString()));
	}
}
