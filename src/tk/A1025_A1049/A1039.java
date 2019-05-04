package tk.A1025_A1049;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ21ÈÕ
  */
public class A1039 {
	public static void solution() {
		int len = StdIn.readInt();
		int[] nums = new int[len];
		int[] arr = new int[len-1];
		for(int i=0;i<len;i++) {
			nums[i]=StdIn.readInt();
		}
		for(int i=0;i<len-1;i++) {
			int d = nums[i+1]-nums[i];
			arr[i]=Math.abs(d);
		}
		Arrays.sort(arr);
		for(int i=0;i<len-1;i++) {
			if(arr[i]!=i+1) {
				StdOut.print("I'm unhappy!!");
				return;
			} 
		}
		StdOut.print("I'm happy!!");
	}
}
