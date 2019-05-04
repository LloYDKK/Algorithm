package tk.A1025_A1049;

import java.util.ArrayList;
import java.util.Arrays;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ10ÈÕ
  */
public class A1027 {
	public static void solution() {
		String a = StdIn.readString();
		int size = StdIn.readInt();
		String[] b = new String[size];
		for(int i=0;i<size;i++) b[i]=StdIn.readString();
		for(int i=0;i<size;i++) {
			if(sim(a,b[i]) || a.equals(b[i]) ) {
				StdOut.print(b[i]);
				return;
			}
		}
		StdOut.print("NOANSWER");
	}
	
	public static boolean sim(String a, String b) {
		String[] str1 = a.split("");
		String[] str2 = b.split("");
		if(str1.length>=str2.length) {
			if(str1.length-str2.length>1) return false;
			else return check(str1,str2);
			}
		else return sim(b,a);
	}
	
	public static boolean check(String[] a, String[] b) {
		ArrayList<String> str1=new ArrayList<String>(Arrays.asList(a));
		for(int i=0;i<b.length;i++){
			if(str1.contains(b[i])) str1.remove(b[i]);
				} 
		if(str1.size()==1) return true;
		return false;
		
	}
}
