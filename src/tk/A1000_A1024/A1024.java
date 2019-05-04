package tk.A1000_A1024;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ10ÈÕ
  */
public class A1024 {
	public static void solution() {
		int num =StdIn.readInt();
		StdOut.print(method(num));
		
	}
	public static int not_1(int area) {
		if(area==1) return 0;
		if(area==2) return 1;
		if(area==3) return 2;
		else return method(area-2)+method(area-3);
	}
	public static int is_1(int area) {
		if(area==1) return 1;
		if(area==2) return 0;
		if(area==3) return 1;
		else return not_1(area-1);
	}
	
	public static int method(int area) {
		return is_1(area)+not_1(area);
	}
}
