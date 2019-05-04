package tk.A1025_A1049;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ21ÈÕ
  */
public class A1045 {
	public static void solution() {
		int i = StdIn.readInt();
		while(i>0) {
			i--;
			int x = StdIn.readInt();
			int z = StdIn.readInt();
			int[] arr = new int[x];
			int[][] swap = new int[z][2];
			for(int j=0;j<x;j++) arr[j]=StdIn.readInt();
			for(int j=0;j<z;j++) {
				for(int k=0;k<2;k++) swap[j][k]=StdIn.readInt();
			}
			for(int j=0;j<z;j++) {
				swap(arr,swap[j][0],swap[j][1]);
			}
			for(int j=0;j<x;j++) StdOut.println(arr[j]);
		}
	}
	
	public static void swap(int[] arr, int x , int y) {
		int tem = arr[x-1];
		arr[x-1] = arr[y-1];
		arr[y-1] = tem;
	}
}
