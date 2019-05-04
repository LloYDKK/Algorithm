package tk.A1000_A1024;
/**
  * @author Kuan Tian
  * 2018Äê6ÔÂ9ÈÕ
  */
public class A1015 {
	public static void solution() {
		int height=9;
		int[][] list=new int[height][height];
		list[0][0]= 1;
		for(int i=1;i<height;i++) {
			list[i][0]=1;
			list[i][i]=1;
			for(int x=1;x<height-1;x++) {
				list[i][x]=list[i-1][x]+list[i-1][x-1];
			}
		}
		for(int x=0;x<list.length;x++) {
			for (int k=0;k<list[x].length;k++) {
				if(list[x][k]!=0) System.out.printf("%-2d  ",list[x][k]);
			}
			System.out.println("");
		}
		
	}
}
