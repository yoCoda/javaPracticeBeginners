import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.io.*;

class MyStringCompare implements Comparator<String>{
	public int compare(String a, String b){
		return a.compareTo(b);
	}
}

public class MyStringSort {

	public static void main(String [] arg){
		/// input with aaa nbbb    vvv cc    aa  a format
		Set<String> l= new TreeSet<String>(new MyStringCompare());
		for(String s : arg) {
			l.add(s);
		}
		for(String s: l)
		{
			System.out.println(s);
		}
		System.out.println("Using Arrays: sort:");
		Arrays.sort(arg, new MyStringCompare());
		for(String s: arg) {
			System.out.println(s);
		}
		try{
		FileOutputStream ouf= new FileOutputStream("junk.txt");
		PrintStream pouf = new PrintStream(ouf);
		for(String s: arg) {
			pouf.println(s);
		}
		}catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}
