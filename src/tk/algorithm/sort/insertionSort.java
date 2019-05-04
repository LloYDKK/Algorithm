package tk.algorithm.sort;
/**
  * @author Kuan Tian
  * 2018Äê5ÔÂ1ÈÕ
  */
public class insertionSort {
	public static int[] inseSort(int[] arr) {
		for (int i=1;i<arr.length;i++) {
			int tem=arr[i];
			int x=i-1;
			for(; x >= 0 && arr[x]>tem; x--) arr[x+1]=arr[x];
			arr[x+1]=tem;
			}
		return arr;
		}
	}

