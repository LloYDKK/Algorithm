package tk.A1000_A1024;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ8ÈÕ
  */
public class A1004 {
	public static void solution() {
		StdOut.println("Insert n and m:");
		int n=StdIn.readInt();
		int m=StdIn.readInt();
		String[] list=new String[]{"A","B","C","D","E","F","G"};
		for(int i=0;i<n;i++) {
			int a=i;
			int count=0;
			if(i<14&&i>=7) a=i-7;
			if(i>=14) a=i-14;
			while(true) {
				while(a>0) {
					System.out.print(list[a]);
					a--;
					count++;
					if(count>m-1) break;
					}
				if(count>m-1) break;
				while(a<6) {
					System.out.print(list[a]);
					a++;
					count++;
					if(count>m-1) break;
					}
				if(count>m-1) break;
				}
			System.out.println("");
			}
		}
}
