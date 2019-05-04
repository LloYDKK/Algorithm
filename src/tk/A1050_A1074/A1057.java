package tk.A1050_A1074;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ23ÈÕ
  */
public class A1057 {
	public static void solution() {
		int a =StdIn.readInt();
		char b = 'A';
		String ab = "";
		for(int i=1;i<=a;i++) {
			ab=ab+b+ab;
			b=(char) (b+1);
		}
		StdOut.println(ab);
	}
}
