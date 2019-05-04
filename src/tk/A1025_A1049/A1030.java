package tk.A1025_A1049;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ11ÈÕ
  */
public class A1030 {
	public static void solution() {
		int len = StdIn.readInt();
		A1030_team[] teams = new A1030_team[len];
		for(int i=0;i<len;i++) {
			String a = StdIn.readString();
			int b = StdIn.readInt();
			int c = StdIn.readInt();
			int d = StdIn.readInt();
			teams[i] = new A1030_team(a,b,c,d);
		}
		Arrays.sort(teams);
		for(int i=0;i<len;i++) {
			StdOut.println(teams[i].teamName);
		}
	}
}
