package tk.A1025_A1049;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ10ÈÕ
  */
public class A1025 {
	public static void solution() {
		String a =StdIn.readString();
		String b =StdIn.readString();
		if(a.length()!=b.length()) StdOut.print(1);
		else if(a.equals(b)) StdOut.print(2);
		else if(a.toLowerCase().equals(b.toLowerCase())) StdOut.print(3);
		else StdOut.print(4);
	}
}
