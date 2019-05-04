package tk.A1025_A1049;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ21ÈÕ
  */
public class A1041 {
	public static void solution() {
		int n = StdIn.readInt();
		int power = StdIn.readInt();
		int[][] arr = new int[n][n];
		int[][] arr2 = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int x=0;x<n;x++) arr[i][x]=StdIn.readInt();
		}
		while(power>1) {
			power-=1;
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					for(int k=0;k<n;k++) arr2[i][j]+=arr[i][k]*arr[k][j];
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int x=0;x<n;x++) StdOut.print(arr2[i][x]+" ");
			StdOut.println();
		}
	}
}
