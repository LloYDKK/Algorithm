package tk.A1050_A1074;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ23ÈÕ
  */
public class A1055 {
	public static void solution() {
		int a = StdIn.readInt();
		String b = StdIn.readString();
		String[] c =new String[a];
		for(int i=0;i<a;i++) {
			c[i]=StdIn.readString();
		}
		Arrays.sort(c);
		for(int i=0;i<a;i++) {
			if(c[i].equals(b)) {
				StdOut.println(c[i+1]);
				break;
			}
		}
	}
}
