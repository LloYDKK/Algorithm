package tk.A1000_A1024;

import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ8ÈÕ
  */
public class A1005 {
	public static void solution() {
		for(int i=100;i<1000;i++) {
			int m=i/100;
			int n=(i%100)/10;
			int z=i%10;
			if(m*m*m+n*n*n+z*z*z==i) StdOut.println(i);
			
		}
	}
}
