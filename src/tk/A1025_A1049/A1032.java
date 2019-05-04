package tk.A1025_A1049;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ11ÈÕ
  */
public class A1032 {
	public static void solution() {
		String[] alp = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		String[] list = new String[alp.length];
		list[0]=alp[0];
		for(int i=1;i<list.length;i++) {
			list[i]=alp[i]+list[i-1]+alp[i];
		}
		int a = StdIn.readInt(); 
		for(int i=0;i<a;i++) {
			StdOut.println(list[i]);
		}
	}
}
