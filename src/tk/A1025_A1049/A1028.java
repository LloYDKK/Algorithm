package tk.A1025_A1049;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ11ÈÕ
  */
public class A1028 {
	public static void solution() {
		int x = StdIn.readInt();
		int y = StdIn.readInt();
		int z = StdIn.readInt();
		int a = x;
		int b = y;
		int t = 0;
		while(b!=0) {
			t = b;
			b = a%b;
			a = t;
		}
		switch(z) {
			case 1: StdOut.print(x+y);break;
			case 2: StdOut.print(x-y);break;
			case 3: StdOut.print(x*y);break;
			case 4: StdOut.print(x/y);break;
			case 5: StdOut.print(x%y);break;
			case 6: StdOut.print(a);break;
			case 7: StdOut.print(x*y/a);break;
			default: break;
			}
	}
}
