package tk.A1050_A1074;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ22ÈÕ
  */
public class A1050 {
	public static void solution() {
		String a = StdIn.readLine();
		String[] b = a.split("");
		Arrays.sort(b);
		double count = 0;
		int i = 0;
		int j = b.length-1;
		while(i<j) {
			if (b[i].equals("C") || b[i].equals("G")) count+=1;
			if (b[j].equals("G") || b[j].equals("C")) count+=1;
			i++;
			j--;
		}
		StdOut.printf("%.0f%n",count/b.length*100);
	}
}
