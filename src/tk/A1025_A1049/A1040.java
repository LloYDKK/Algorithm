package tk.A1025_A1049;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ21ÈÕ
  */
public class A1040 {
	public static void solution() {
		int n,k,s;
		n=StdIn.readInt();
		k=0;
		s=0;
		while(s<n){
			k++;
			s+=k;
			}
		if(k%2==1) StdOut.printf("%d/%d\n",s-n+1,k+n-s);
		else StdOut.printf("%d/%d\n",k+n-s,s-n+1);
	}
}
