package tk.A1000_A1024;

import edu.princeton.cs.algs4.StdIn;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ9ÈÕ
  */
public class A1011 {
	public static void solution() {
		int hex = StdIn.readInt();
		int c=0;
		while(true) {
			double hexx =Math.pow(16,c);
			if (hex<hexx) break;
			c++;
		}
		int[] abc= new int[c];
		for(int i=0;i<c;i++) {
			double hexx =Math.pow(16,c-i);
			abc[i]=(int)(hex/hexx);
			hex=(int) (hex%hexx);
			
		}
		String[] list=new String[16];
		for(int i=0;i<10;i++) list[i]=String.valueOf(i);
		list[10]="A";
		list[11]="B";
		list[12]="C";
		list[13]="D";
		list[14]="E";
		list[15]="F";
		for(int i=1;i<abc.length;i++) {
			System.out.print(list[abc[i]]);
		}
		System.out.print(list[hex%16]);
	}
}
