package tk.A1025_A1049;

import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ11ÈÕ
  */
public class A1031 {
	public static void solution() {
		String[] alp = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O"};
		String[] list = new String[15];
		list[0]=alp[0];
		for(int i=1;i<15;i++) {
			list[i]=alp[i]+list[i-1]+alp[i];
		}
		for(int i=0;i<15;i++) {
			StdOut.println(list[i]);
		}
	}
}
