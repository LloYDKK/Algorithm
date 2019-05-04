package tk.algorithm.sort;
/**
  * @author Kuan Tian
  * 2018Äê5ÔÂ1ÈÕ
  */
public class selectionSort {
	public static int[] seleSort(int[] arr) {
		for(int x=0;x<arr.length;x++) {
			int min=1000000;
			int tem=0;
			int index=0;
			for(int i=x;i<arr.length;i++) {
				if(arr[i]<min) {
					min=arr[i];
					index=i;
					}
				}
			tem=arr[x];
			arr[x]=arr[index];
			arr[index]=tem;
			}
		return arr;
		}
}
