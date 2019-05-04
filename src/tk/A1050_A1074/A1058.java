package tk.A1050_A1074;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ23ÈÕ
  */
public class A1058 {
	public static void solution() {
		int a = StdIn.readInt();
		int[][] num = new int[a][a];
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				num[i][j]=StdIn.readInt();
			}
		}
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				if(num[i][j]==1 && num[j][i]==1 && i !=j) {
					StdOut.print(i+1+" ");
				}
			}
		}
		StdOut.println();
	}
}
