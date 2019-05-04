package tk.newcoder;

import java.util.ArrayList;
import java.util.Stack;

/**
  * @author Kuan Tian
  * 2019-03-12
  */

public class Solution {
    public static boolean Find(int target, int [][] array) {
        int j=array.length-1;
        int k=array[0].length-1;
        int line=0;
        
        while(array[line][k]<target) {
        	line++;
        	if(line>array.length-1) return false;
        }
        while(array[j][0]>target) {
        	j--;
        	if(j<0) return false;
        }
        if(j<line) return false;
        
        for(int m=line;m<=j;m++){
            if(binary(array[m],target)) return true;
        }
        return false;
    }
    
    public static boolean binary(int[]arr,int tar){
        int i = 0;
        int j = arr.length-1;
        
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]==tar) return true;
            if(arr[mid]>tar) j=mid-1;
            else i=mid+1;
        }
        return false;
    }
    
    public static String replaceSpace(StringBuffer str) {
        StringBuffer b = new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ') b.append("%20");
            else b.append(str.charAt(i));
        }
        return b.toString();
    }
    
    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();
    
    public static void push(int node) {
        stack1.push(node);
    }
    
    public static int minNumberInRotateArray(int [] array) {
        if(array.length==0) return 0;
        int i = 0;
        int j = array.length-1;
        while(i<j){
            if(array[i]<=array[j]) return array[i];
            if(array[j]<array[j-1]) return array[j];
            i++;
            j--;
        }
        return array[i];
    }
    
    public static int pop() {
        if (stack2.empty()) {
            if(stack1.empty()) return 0;
            else {
                while(!stack1.empty()) stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    
    public static int JumpFloorII(int target) {
        if(target==0) return 0;
        else if(target==1) return 1;
        else {
            int num = 0;
            for(int i=0;i<target;i++) num+=JumpFloorII(i);
            return num+1;
        }
    }
    
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(matrix==null) return list;
        int wide = matrix[0].length;
        int height = matrix.length;
       if(wide==1) {
        	for(int i=0;i<height;i++) {
        		list.add(matrix[i][0]);
        	}
        }
        else if(height==1) {
        	for(int i=0;i<wide;i++) {
        		list.add(matrix[0][i]);
        	}
        }
        else {
        int x=0;
        int y=0;
        int count=1;
        int circle=0;
        while(count<wide*height) {
            x=circle;
            y=circle;
            for(;x<wide-circle;x++) {
                list.add(matrix[y][x]);
                count++;
                if(count>wide*height) break;
            }
            x--;
            y++;
            for(;y<height-circle;y++) {
                list.add(matrix[y][x]);
                count++;
                if(count>wide*height) break;
            }
            y--;
            x--;
            for(;x>circle;x--) {
                list.add(matrix[y][x]);
                count++;
                if(count>wide*height) break;
            }
            for(;y>circle;y--) {
                list.add(matrix[y][x]);
                count++;
                if(count>wide*height) break;
            }
            circle++;
        }
        }
        
        return list;
    }
    
    public static void main(String[] args) {
    	int [][] matrix = {{1},{6},{11}};
    	System.out.println(printMatrix(matrix) );
    }
}
