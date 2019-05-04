package tk.A1025_A1049;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ11ÈÕ
  */
public class A1029 {
	public static void solution() {
		int a = StdIn.readInt();
		int b = StdIn.readInt();
		int c = StdIn.readInt();
		int max;
		int min;
		max = Math.max(a, b);
		max = Math.max(max, c);
		min = Math.min(a, b);
		min = Math.min(min, c);
		StdOut.print(max+" "+min);
	}
}
