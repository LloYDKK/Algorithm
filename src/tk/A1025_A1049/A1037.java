package tk.A1025_A1049;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ12ÈÕ
  */
public class A1037 {
	public static void solution() {
		int steps = StdIn.readInt();
		StdOut.println(method(steps));
	}
	
	public static int method(int i) {
		if(i==1) return 1;
		if(i==2) return 2;
		if(i==3) return 4;
		else return method(i-1)+method(i-2)+method(i-3);
	}
}
