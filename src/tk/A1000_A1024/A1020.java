package tk.A1000_A1024;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ10ÈÕ
  */
public class A1020 {
	public static void solution() {
		int len = StdIn.readInt();
		int[] arr = new int[len];
		for(int i=0;i<len;i++) {
			arr[i] = StdIn.readInt();
		}
		sort(arr,len);
		for(int i=0;i<len;i++) {
			StdOut.print(arr[i]+" ");
		}
	}
	
	public static void sort(int[] arr,int len) {
		for(int i=1;i<len;i++) {
			int tem =arr[i];
			int x = i-1;
			for(;x>=0&&arr[x]>tem;x--) arr[x+1]=arr[x];
			arr[x+1]=tem;
		}
	}
}
