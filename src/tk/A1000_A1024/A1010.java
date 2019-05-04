package tk.A1000_A1024;

import edu.princeton.cs.algs4.StdIn;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ8ÈÕ
  */
public class A1010 {
	public static void solution() {
		int hex = StdIn.readInt();
		int a=hex/16;
		int b=hex%16;
		String[] list=new String[16];
		for(int i=0;i<10;i++) list[i]=String.valueOf(i);
		list[10]="A";
		list[11]="B";
		list[12]="C";
		list[13]="D";
		list[14]="E";
		list[15]="F";
		System.out.println(list[a]+list[b]);
	}
}
