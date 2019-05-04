package tk.A1025_A1049;

import java.util.ArrayList;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ11ÈÕ
  */
public class A1034 {
	public static void solution() {
		int start = StdIn.readInt();
		int end = StdIn.readInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=start;i<=end;i++) {
			if(isPrime(i)) a.add(i);
		}
		for(int i=1;i<a.size();i++) {
			if(a.get(i)-a.get(i-1)==2) StdOut.println(a.get(i-1)+" "+a.get(i));
		}
	}
	
	public static boolean isPrime(int a) {
		if(a<2) return false;
		for(int i=2;i<a;i++) {
			if(a%i==0) return false;
		}
		return true;
	}
}
