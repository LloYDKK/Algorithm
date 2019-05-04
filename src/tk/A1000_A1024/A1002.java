package tk.A1000_A1024;
/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ8ÈÕ
  */
public class A1002 {
	public static void solution() {
		for(int i=0;i<64;i++) {
			String d =Integer.toBinaryString(i);
			String[] c=d.split("");
			int count=0;
			for(int x=0;x<c.length;x++) {
				if(c[x].equals("1")) count+=1;
			}
			if(count%2!=0) System.out.printf("%06d%n",Integer.valueOf(d));
		}
	}
}
