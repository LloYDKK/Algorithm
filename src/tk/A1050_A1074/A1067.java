package tk.A1050_A1074;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ27ÈÕ
  */
public class A1067 {
	public static void solution() {
		int num1 = StdIn.readInt();
		int num2 = StdIn.readInt();
		int a = StdIn.readInt();
		int b = StdIn.readInt();
		int c = StdIn.readInt();
		int d = StdIn.readInt();
		int[] e = new int[num2-num1+1];
		for(int i=0;i<e.length;i++) {
			e[i] = Fib(num1+i);
		}
		for(int j=0;j<e.length;j++) {
			if(e[j]%a!=0 && e[j]%b!=0 && e[j]%c!=0 && e[j]%d!=0) {
				StdOut.print(j+1+" ");
			}
		}
		StdOut.println();
	}
	
	public static int Fib(int a) {
		if(a==1) return 1;
		if(a==2) return 1;
		else return Fib(a-1)+Fib(a-2);
	}
}
