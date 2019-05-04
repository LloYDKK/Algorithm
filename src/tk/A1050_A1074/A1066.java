package tk.A1050_A1074;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ27ÈÕ
  */
public class A1066 {
	public static void solution() {
		int a = StdIn.readInt();
		int b = StdIn.readInt();
		Integer[] arr = new Integer[b];
		Integer[] arr2 = new Integer [b];
		for(int i=0;i<b;i++) {
			arr[i] = StdIn.readInt();
			arr2[i] = StdIn.readInt();
		}
		Arrays.sort(arr);
		Arrays.sort(arr2);
		int i = 0;
		int j = 0;
		int count = 0;
		while(i<b && j<b) {
			if(arr[i]==arr2[j]) {
				i++;
				j++;
			}
			else if(arr[i]<arr2[j]) {
				i++;
				count++;
			}
			else {
				j++;
				count++;
			}
		}
		count = count + b + b - i - j;
		if(count%2==0 && count<=a) StdOut.println(count/2);
		else StdOut.println(count/2+1);
	}
}
