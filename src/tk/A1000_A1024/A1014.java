package tk.A1000_A1024;

import edu.princeton.cs.algs4.StdIn;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ9ÈÕ
  */
public class A1014 {
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
		String[] list1 = new String[8];
		for(int i=0;i<8;i++) {
			list1[i]=String.valueOf(i);
		}
		int m=(int)num;
		int[] aa=new int[10];
		int x=0;
		while(m>0) {
			aa[x]=m%8;
			m=m/8;
			x++;
		}
		for(int ab=x-1;ab>=0;ab--) System.out.print(list1[aa[ab]]);
	}
}
