package tk.A1025_A1049;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ21ÈÕ
  */
public class A1042 {
	public static void solution() {
		double a_x1 = StdIn.readDouble();
		double a_y1 = StdIn.readDouble();
		double a_x2 = StdIn.readDouble();
		double a_y2 = StdIn.readDouble();
		double b_x1 = StdIn.readDouble();
		double b_y1 = StdIn.readDouble();
		double b_x2 = StdIn.readDouble();
		double b_y2 = StdIn.readDouble();
		
		double a_x = Math.max(a_x1, a_x2);
		double a_y = Math.max(a_y1, a_y2);
		double b_x = Math.min(b_x1, b_x2);
		double b_y = Math.min(b_y1, b_y2);
		
		if(a_x<b_x || a_y<b_y) StdOut.print("0.00");
		else {
			double x=a_x-b_x;
			double y=a_y-b_y;
			StdOut.println(x*y);
		}
		
	}
}
