package tk.A1025_A1049;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ11ÈÕ
  */
public class A1033 {
	public static void solution() {
		int n = StdIn.readInt();
		int[][] graph = new int[n][n];
		int x=0;
		int y=0;
		int count=1;
		int circle=0;
		while(count<n*n+1) {
			x=circle;
			y=circle;
			for(;x<n-circle;x++) {
				graph[y][x]=count;
				count++;
				}
			x--;
			y++;
			for(;y<n-circle;y++) {
				graph[y][x]=count;
				count++;
				}
			y--;
			x--;
			for(;x>circle;x--) {
				graph[y][x]=count;
				count++;
				}
		    for(;y>circle;y--) {
		    	graph[y][x]=count;
		    	count++;
		    	}
		    circle++;
		    }
		StdOut.println();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				StdOut.printf("%-4d",graph[i][j]);
			}
			StdOut.println();
		}
	}
}
