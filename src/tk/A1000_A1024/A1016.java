package tk.A1000_A1024;

import edu.princeton.cs.algs4.StdIn;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ10ÈÕ
  */
public class A1016 {
	public static void solution() {
		double year = 1;
		int num = StdIn.readInt();
		double[] X = new double[num];
		double[] Y = new double[num];
		for(int i=0;i<num;i++) {
			X[i] = StdIn.readDouble();
			Y[i] = StdIn.readDouble();
			}
		int count=0;
		while(count<num) {
			if(year*100/Math.PI > X[count]*X[count]+Y[count]*Y[count]) {
				System.out.println(year);
				count++;
				
			}
			else year++;
		}
	}
}
