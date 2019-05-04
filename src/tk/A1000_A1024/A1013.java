package tk.A1000_A1024;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ9ÈÕ
  */
public class A1013 {
	public static void solution() {
		String a=StdIn.readString();
		String[] b =a.split("");
		String[] list=new String[16];
		for(int i=0;i<10;i++) list[i]=String.valueOf(i);
		list[10]="A";
		list[11]="B";
		list[12]="C";
		list[13]="D";
		list[14]="E";
		list[15]="F";
		int[] abc=new int[b.length];
		for(int x=b.length-1;x>=0;x--) {
			for(int i=0;i<list.length;i++) {
				if(list[i].equals(b[x])) abc[x]=i;
			}
		}
		double num=0;
		for(int len=0;len<abc.length;len++) {
			num+=abc[len]*Math.pow(16, b.length-1-len);
		}
		StdOut.print((int)(num));
	}
}
