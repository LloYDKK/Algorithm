package tk.A1000_A1024;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ8ÈÕ
  */
public class test {
	@SuppressWarnings({ "resource", "rawtypes", "unchecked" })
	public static void main(String[] args) throws Exception{
		Scanner keyboard = new Scanner(System.in);
		String className = keyboard.nextLine();
		className = "tk.A1000_A1024.A" + className;
		Class ownerClass = Class.forName(className);
		Method method =ownerClass.getMethod("solution");
		method.invoke(null);
	}
}
