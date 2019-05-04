package tk.A1000_A1024;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ10ÈÕ
  */
public class A1018 {
	public static void solution() {
		int len = StdIn.readInt();
		int[] a = new int[len];
		for(int i=0;i<len;i++) {
			a[i] = StdIn.readInt();
		}
		int key =StdIn.readInt();
		for(int i=0;i<len;i++) {
			if(a[i]==key) {
				StdOut.println(i+1);
				break;
			}
		}
	}
}
