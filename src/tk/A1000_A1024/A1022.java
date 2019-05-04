package tk.A1000_A1024;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ10ÈÕ
  */
public class A1022 {
	public static void solution() {
		int time = StdIn.readInt();
		int hour = time/3600;
		int min = time%3600/60;
		int sec = time%60;
		StdOut.printf("%d:%d:%d", hour, min ,sec);
	}
}
