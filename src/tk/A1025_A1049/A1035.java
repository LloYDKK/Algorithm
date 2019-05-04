package tk.A1025_A1049;

import java.util.ArrayList;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ11ÈÕ
  */
public class A1035 {
	public static void solution() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		while(true) {
			int i = StdIn.readInt();
			if(i==0) break;
			else a.add(i);
		}
		for(int i=0;i<a.size();i++) {
			int x = a.get(i);
			int count = 0;
			for(int j=1;j<=x;j++) {
				if(isPrime(j)) count+=j;
			}
			StdOut.println(count);
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
