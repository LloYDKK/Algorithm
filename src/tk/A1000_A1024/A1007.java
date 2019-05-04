package tk.A1000_A1024;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ8ÈÕ
  */
public class A1007{
	public static void solution() {
		StdOut.print("Insert a number:");
		int x=StdIn.readInt();
		for(int i=10000;i<100000;i++) {
				if(i/10000==i%10&&i%10000/1000==i%100/10) {
					if(i/10000+i%10000/1000+i%1000/100+i%100/10+i%10==x) StdOut.println(i);
			}
		}
	}
}
