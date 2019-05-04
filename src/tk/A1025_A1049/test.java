package tk.A1025_A1049;

import java.lang.reflect.Method;
import java.util.Scanner;

import edu.princeton.cs.algs4.StdOut;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ10ÈÕ
  */
	public class test {
		@SuppressWarnings({ "resource", "rawtypes", "unchecked" })
		public static void main(String[] args) throws Exception{
			Scanner keyboard = new Scanner(System.in);
			String className = keyboard.nextLine();
			className = "tk.A1025_A1049.A" + className;
			Class ownerClass = Class.forName(className);
			Method method =ownerClass.getMethod("solution");
			long startTime = System.currentTimeMillis();
			method.invoke(null);
			long endTime = System.currentTimeMillis();
			StdOut.println((endTime-startTime)+" ms");
		}
	}

