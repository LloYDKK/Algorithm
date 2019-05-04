package tk.A1000_A1024;

import java.util.ArrayList;
import java.util.Collections;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ10ÈÕ
  */
public class A1021 {
	public static void solution() {
		int a = StdIn.readInt();
		ArrayList<Integer> A =new ArrayList<Integer>();
		for(int i=0;i<a;i++) {
			A.add(StdIn.readInt());
		}
		int b = StdIn.readInt();
		ArrayList<Integer> B =new ArrayList<Integer>();
		ArrayList<Integer> C =new ArrayList<Integer>();
		for(int i=0;i<b;i++) {
			int num = StdIn.readInt();
			if(A.contains(num)) C.add(num);
			else {
				A.add(num);
				B.add(num);
			}
		}
		Collections.sort(A);
		Collections.sort(B);
		Collections.sort(C);
		StdOut.println(C.toString());
		StdOut.println(A.toString());
		StdOut.println(B.toString());
	}
}
