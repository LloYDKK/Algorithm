package tk.A1025_A1049;

import java.util.ArrayList;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ21ÈÕ
  */
public class A1044 {
	public static void solution() {
		ArrayList<Integer> a =new ArrayList<Integer>();
		while(true) {
			int b = StdIn.readInt();
			if(b==0) break;
			else a.add(b);
		}
		for(int i =0;i<a.size();i++) {
			int c = a.get(i);
			int d = 0;
			for(int x=c;x>0;x--) d+=Fib(x);
			StdOut.println(d);
		}
	}
	
	public static int Fib(int a) {
		if(a==1) return 1;
		if(a==2) return 1;
		else return Fib(a-1)+Fib(a-2);
	}
}
