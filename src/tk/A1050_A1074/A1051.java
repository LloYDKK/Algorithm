package tk.A1050_A1074;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ22ÈÕ
  */
public class A1051 {
	public static void solution() {
		int a = StdIn.readInt();
		String[][] b = new String[a][];
		for(int i=0;i<a;i++) {
			String x = StdIn.readString();
			b[i]=x.split("");
		}
		String[] c = new String[b[0].length];
		String[] d = new String[a];
		for(int i=0;i<c.length;i++) {
			for(int j = 0; j < a ; j++) {
				d[j]=b[j][i];
			}
			c[i] = findmax(d);
		}
		for(int i=0;i<c.length;i++) StdOut.print(c[i]);
		StdOut.println();
	}
	
	public static String findmax(String[] arr) {
		Arrays.sort(arr);
		int max = 0;
		String a = "";
		for(int i=0;i<arr.length-1;i++) {
			int count=1;
			if(arr[i].equals(arr[i+1])) count++;
			if(count>max) {
				max=count;
				a = arr[i];
			}
		}
		return a;
	}
}
