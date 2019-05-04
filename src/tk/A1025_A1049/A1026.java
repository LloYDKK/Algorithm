package tk.A1025_A1049;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ10ÈÕ
  */
public class A1026 {
	public static void solution() {
		String[] str = StdIn.readString().split("");
		Arrays.sort(str);
		int i = 1;
		int count = 1;
		while (i < str.length) {
			if (str[i-1].equals(str[i])) count++;
			else {
				StdOut.println(str[i-1] + " " + count);
				count = 1;
			}
			i++;
		}
		System.out.println(str[i-1] + " " + count);
	}
}
