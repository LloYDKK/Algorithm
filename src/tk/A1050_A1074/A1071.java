package tk.A1050_A1074;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ27ÈÕ
  */
public class A1071 {
	public static void solution() {
		int a = StdIn.readInt();
		int b = StdIn.readInt();
		int[] arr1 = new int[a];
		int[] arr2 = new int[a];
		for(int i=0;i<a;i++) {
			arr1[i] = StdIn.readInt();
			arr2[i] = StdIn.readInt();
		}
		int[] arr3 = arr2;
		Arrays.sort(arr3);
		b=(int) (b*1.5);
		int score = arr3[a-b];
		int count = 0;
		StdOut.println();
		for(int i=0;i<a;i++) {
			if(arr2[i]>=score) {
				StdOut.println(arr1[i]+" "+arr2[i]);
				count++;
			}
		}
		StdOut.println(score+" "+count);
	}
}
