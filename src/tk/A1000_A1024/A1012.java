package tk.A1000_A1024;

import edu.princeton.cs.algs4.StdIn;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ9ÈÕ
  */
public class A1012 {
	public static void solution() {
		String[] list = new String[36];
		for(int i=0;i<10;i++) {
			list[i]=String.valueOf(i);
		}
		for(int i=65;i<91;i++) {
			char b=(char)i;
			list[i-55]=b+"";
		}
		int m=StdIn.readInt();
		int n=StdIn.readInt();
		int[] a=new int[10];
		int x=0;
		while(m>0) {
			a[x]=m%n;
			m=m/n;
			x++;
		}
		for(int ab=x-1;ab>=0;ab--) System.out.print(list[a[ab]]);
	}
}
