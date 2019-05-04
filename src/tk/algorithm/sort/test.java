package tk.algorithm.sort;

/**
  * @author Kuan Tian
  * 2018Äê5ÔÂ1ÈÕ
  */
public class test {
	public static void main(String[] args) {
		int[] origin= new int[]{10,5,4,3,2,1};
		int[] expect= new int[] {1,2,3,4,5,10};
		//bubbleSort.bubSort(origin);
		//selectionSort.seleSort(origin);
		org.junit.Assert.assertArrayEquals(expect,insertionSort.inseSort(origin));
		
	}
}
