package Silver03;

import java.util.ArrayList;
import java.util.Scanner;

public class Resignation {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);

	        int n = scan.nextInt();
	        int[] t = new int[n + 1];
	        int[] p = new int[n + 1];

	        for (int i = 1; i <= n; i++) {
	            t[i] = scan.nextInt();
	            p[i] = scan.nextInt();
	        }

	        int result = maxProfit(n, t, p);

	        System.out.println(result);
	    }

	    private static int maxProfit(int n, int[] t, int[] p) {
	        int[] dp = new int[n + 2]; 

	        for (int i = 1; i <= n + 1; i++) {
	            for (int j = 1; j < i; j++) {
	                if (j + t[j] <= i) { 
	                    dp[i] = Math.max(dp[i], dp[j] + p[j]); 
	                }
	            }
	        }

	        int maxProfit = 0;
	        for (int i = 1; i <= n + 1; i++) {
	            maxProfit = Math.max(maxProfit, dp[i]);
	        }

	        return maxProfit;
	    }
	}
