package tk.A1000_A1024;
/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ8ÈÕ
  */
public class A1003 {
	public static void solution() {
		String[] list=new String[]{"A","B","C","D","E","F","G"};
		for(int i=0;i<18;i++) {
			int a=i;
			int count=0;
			if(i<14&&i>=7) a=i-7;
			if(i>=14) a=i-14;
			while(true) {
				while(a>0) {
					System.out.print(list[a]);
					a--;
					count++;
					if(count>24) break;
					}
				if(count>24) break;
				while(a<6) {
					System.out.print(list[a]);
					a++;
					count++;
					if(count>24) break;
					}
				if(count>24) break;
				}
			System.out.println("");
			}
		}
}
