package testDriver;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import tk.algorithm.search.binarySearch;
import edu.princeton.cs.algs4.StdDraw;


/**
  * @author Kuan Tian
  * 2018Äê5ÔÂ1ÈÕ
  */
public class testDriver {
	public static void main(String[] args){
		//test1();
		//test2();
		A1100();
		}
	
	public static void test1() {
		int[] arr = new int[10];
		for (int i=0;i<10;i++){
			StdOut.printf("Please input the %dth number %n",i+1);
			arr[i]=StdIn.readInt();
			}
		StdOut.println("Please input the number you want to search for.");
		int key=StdIn.readInt();
		Arrays.sort(arr);
		StdOut.printf("The number is in the %dth place of the array.",binarySearch.binarySe(arr,key,0,arr.length-1)+1);
	}
	
	@SuppressWarnings("deprecation")
	public static void test2() {
		StdDraw.setPenColor(StdDraw.RED);
		int N=50;
		Double[] a=new Double[N];
		for(int i=0;i<N;i++) a[i]=StdRandom.random();
		Arrays.sort(a);
		for (int i=0;i<N;i++) {
			double x=1.0*i/N;
			double y=a[i]/2.0;
			double rw=0.5/N;
			double rh=a[i]/2.0;
			StdDraw.filledRectangle(x, y, rw, rh);
		}
	}
	
	public static void A1100() {
		String[] num=StdIn.readLine().split(" ");
		int a=Integer.parseInt(num[0]);
		int b=Integer.parseInt(num[1]);
		int c = Math.min(a,b);
		int d = Math.max(a,b);
		if(c<10) StdOut.printf("%d%n* %d%n----%n%3d",d,c,d*c);
		else {
			int e=c%10;
			int f=c/10;
			StdOut.printf("%d%n* %d%n----%n%d%n%d%n----%n%3d",d,c,d*e,d*f,d*c);
		}
	}
	
}
