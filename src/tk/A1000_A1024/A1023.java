package tk.A1000_A1024;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ10ÈÕ
  */
public class A1023 {
	public static void solution() {
		int num =StdIn.readInt();
		StdOut.print(method(num));
	}
	
	public static int method(int area) {
		if(area==1) return 1;
		if(area==2) return 2;
		else return method(area-1)+method(area-2);
	}
}
