package tk.A1000_A1024;

import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018��6��10��
  */
public class A1019 {
	public static void solution() {
		String[] a = {"A","B","C","D"};
		for(int i=0;i<4;i++) {
			for(int x=0;x<4;x++){
				for(int y=0;y<4;y++){
					for(int z=0;z<4;z++){
						StdOut.println(a[i]+a[x]+a[y]+a[z]);
					}
				}
			}
		}
	}
}
