/**
  * @author Kuan Tian
  * 2018Äê5ÔÂ1ÈÕ
  */

package tk.algorithm.search;

public class binarySearch {
	
	public static int binarySe(int[]arr,int key, int lo, int hi){
		int mid=(lo+hi)/2;
		if (lo>hi) return -1;
		else if (key>arr[mid]) return binarySe(arr,key,mid+1,hi);
		else if (key<arr[mid]) return binarySe(arr,key,lo,mid-1);
		else return mid;
		}

	// public static int binarySearch(int[] arr, int key){
			// int low=0;
			// int high=arr.length-1;
			// while(low<=high){
				// int mid=(low+high)/2;
				// if (arr[mid]==key) return mid;
				// else if (arr[mid]>key) high=mid-1;
				// else if (arr[mid]<key) low=mid+1;
			// }
			// return -1;
			// }
	}
