package tk.A1025_A1049;

import java.util.ArrayList;
import java.util.Collections;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ11ÈÕ
  */
public class A1036 {
	public static void solution() {
		int start = StdIn.readInt();
		int end = StdIn.readInt();
		int[] arr = new int[end-start+1];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+start;
		}
		for(int i=0;i<arr.length;i++) {
			prime(arr[i]);
		}
	}
	
	public static void prime(int i) {
		if(isPrime(i)) StdOut.println(i+"="+i);
		else {
			StdOut.print(i+"=");
			ArrayList<Integer> arr = new ArrayList<Integer>();
			while(i>1 && !isPrime(i)) {
			for(int x=i;x>1;x--) {
					if(i%x==0 && isPrime(x)) {
						i=i/x;
						arr.add(x);
						}
					}
			}
			if(isPrime(i)) arr.add(i);
			Collections.sort(arr);
			for(int x=0;x<arr.size();x++) {
				if(x==arr.size()-1)StdOut.print(arr.get(x));
				else StdOut.print(arr.get(x)+"*");
				}
			StdOut.println();
			}
		}
	
	
	public static boolean isPrime(int a) {
		if(a<2) return false;
		for(int i=2;i<a;i++) {
			if(a%i==0) return false;
		}
		return true;
	}
}
