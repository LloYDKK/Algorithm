package tk.A1000_A1024;

import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ8ÈÕ
  */
public class A1006 {
	public static void solution() {
		for(int i=1000;i<10000;i++) {
			if(i/1000==i%10&&i%1000/100==i%100/10) StdOut.println(i);
		}
	}
}
