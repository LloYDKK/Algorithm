package tk.A1025_A1049;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ22ÈÕ
  */
public class A1046 {
	public static void solution() {
		String math = StdIn.readLine();
		int sum = 0;
		if(math.indexOf("-")==-1) {
			String[] a= math.split("\\+");
			for(int i=0; i<a.length;i++) {
				Integer tem = new Integer(a[i]);
				sum+=tem;
			}
		}
		else {
			String[] a= math.split("\\+");
			for(int i=0;i<a.length;i++) {
				if(a[i].indexOf("-")!=-1) {
					String [] b = a[i].split("\\-");
					Integer tem1 = new Integer(b[0]);
					Integer tem2 = new Integer(b[1]);
					int tem3 = tem1-tem2;
					sum+=tem3;
				}
				else {
					Integer tem = new Integer(a[i]);
					sum+=tem;
				}
			}
		}
		StdOut.println(sum);
	}
}
