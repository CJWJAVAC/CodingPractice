package Silver02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MakingColorPaper {
	
	static int zero = 0;
	static int one = 0;
	static int[][] nums;

	public static void main(String[] args) throws NumberFormatException, IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
       
       int n = Integer.parseInt(br.readLine());
       
       nums = new int[n][n];
       
       for(int i=0; i<n; i++) {
    	   st = new StringTokenizer(br.readLine()," ");
    	   for(int j=0; j<n; j++) {
    		   nums[i][j] = Integer.parseInt(st.nextToken());
    	   }
       }
       
       mergeSort(0,0,n);
       
       System.out.println(zero);
       System.out.println(one);
    }

   static void mergeSort(int row, int col, int size) {
	   if(check(row, col, size)) {
		   if(nums[row][col]==0) {
			   zero++;
		   }
		   else {
			   one++;
		   }
		   return;
	   }
	   
	   int middle = size/2;
	   mergeSort(row,col+middle,middle);
	   mergeSort(row,col,middle);
	   mergeSort(row+middle,col,middle);
	   mergeSort(row+middle,col+middle,middle);
   }
   
   static boolean check(int row, int col, int size) {
	   int num = nums[row][col];
	   
	   for(int i=row; i<row+size; i++) {
		   for(int j=col; j<col+size; j++) {
			   if(nums[i][j]!=num) {
				   return false;
			   }
		   }
	   }
	   return true;
   }
}
