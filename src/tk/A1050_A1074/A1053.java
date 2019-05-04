package tk.A1050_A1074;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ23ÈÕ
  */
public class A1053 {
	public static void solution() {
		String num = StdIn.readString();
		String[] nums = num.split("");
		int a = nums.length-1;
		while(a>=0) {
			int ten = 0;
			Integer b = new Integer(nums[a]);
			b=b+1+ten;
			if(b==10) {
				nums[a]="0";
				a=a-1;
				if(a==-1) {
					String[] nums_2 = new String[nums.length+1];
					System.arraycopy(nums, 0, nums_2, 1, nums.length);
					nums_2[0]="1";
					nums=nums_2;
				}
				ten=1;
			}
			else {
				nums[a]= b.toString();
				break;
			}
		}
		for(int i=0;i<nums.length;i++) {
			StdOut.print(nums[i]);
		}
		StdOut.println();
	}
}
