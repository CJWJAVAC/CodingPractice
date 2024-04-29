package Silver04;

import java.util.Arrays;
import java.util.Scanner;

public class FindingNum {
	
	public static boolean binarySearch(int[] nums, int target) {
        int lower = 0;
        int upper = nums.length - 1;
        
        while (lower <= upper) {
            int mid = lower + (upper - lower) / 2;
            
            if (nums[mid] == target) {
                return true; 
            } else if (nums[mid] < target) {
                lower = mid + 1;
            } else {
                upper = mid - 1;
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int nums[] = new int[n];

        for(int i=0; i<n; i++) {
            nums[i] = scan.nextInt();
        }
        
        Arrays.sort(nums); 

        int m = scan.nextInt();

        int other[] = new int[m];

        for(int i=0; i<m; i++) {
            other[i] = scan.nextInt();
        }
        
        for (int i = 0; i < m; i++) {
            if (binarySearch(nums, other[i])) {
                System.out.println(1); 
            } else {
                System.out.println(0); 
            }
        }

    }

}
