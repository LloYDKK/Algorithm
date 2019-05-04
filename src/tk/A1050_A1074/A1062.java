package tk.A1050_A1074;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ22ÈÕ
  */
public class A1062 {
	public static void solution() {
		int v1 = StdIn.readInt();
		int v2 = StdIn.readInt();
		int t = StdIn.readInt();
		int s = StdIn.readInt();
		int l = StdIn.readInt();
		int t1 = 0;
		int t2 = 0;
		int count=0;
		while(true) {
			if(t1>=l && t2>=l) {
				StdOut.println("D");
				StdOut.println(count);
				StdOut.println();
				break;
			}
			if(t1>=l && t2<l) {
				StdOut.println("R");
				StdOut.println(count);
				StdOut.println();
				break;
			}
			if(t2>=l && t1<l) {
				StdOut.println("T");
				StdOut.println(count);
				StdOut.println();
				break;
			}
			count++;
			t1 += v1;
			t2 += v2;
			if(t1<l && t2<l) {
				if(t1-t2>=t) {
					t2+=s*t2;
					count+=s;
				}
			}
		}
		
	}
}
