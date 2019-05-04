package tk.A1050_A1074;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ23ÈÕ
  */
public class A1054 {
	public static void solution() {
		int a = StdIn.readInt();
		while(true) {
			a++;
			if(isPrime(a)) {
				StdOut.println(a);
				break;
			}
		}
	}
	
	public static boolean isPrime(int a) {
		int b = (int) Math.sqrt(a);
		for(int i=2;i<=b;i+=1) {
			if(a%i==0) return false;
		}
		return true;
	}
}
