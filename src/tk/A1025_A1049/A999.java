package tk.A1025_A1049;

import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ12ÈÕ
  */
public class A999 {
	public static void solution() {
		StdOut.print(add(15));
	}
	
	public static int add(int x) {
		if(x==1) return 1;
		if(x==2) return 2;
		if(x==3) return 4;
		else return add(x-1)+add(x-2)+add(x-3);
	}
}
