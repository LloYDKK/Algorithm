package tk.A1000_A1024;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdIn;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ8ÈÕ
  */
public class A1009 {
	public static void solution() {
		int len=StdIn.readInt();
		int[] list=new int[len];
		int sum=0;
		for(int i=0;i<len;i++) {
			list[i]=StdIn.readInt();
			sum+=list[i]*list[i];
		}
		Arrays.sort(list);
		System.out.println(list[len-2]);
		System.out.println(list[1]);
		System.out.println(sum);	
	}
}
