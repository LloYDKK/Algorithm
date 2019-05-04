package tk.A1025_A1049;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ22ÈÕ
  */
public class A1047 {
	public static void solution() {
		int n = StdIn.readInt();
		int m = StdIn.readInt();
		int[][] arr = new int[n][m];
		int min = 100;
		int[] supmarket = new int[m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j] = StdIn.readInt();
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(arr[j][i]<=min && arr[j][i]!=0) {
					min = arr[j][i];
					supmarket[i] = j+1;
				}
			}
			if(min==0) supmarket[i]=0;
			min=100;
		}
		for(int i=0;i<m;i++) StdOut.print(supmarket[i]+" ");
	}
}
