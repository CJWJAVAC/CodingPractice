package Silver03;

import java.util.Scanner;

public class Gas_Station {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] distances = new int[n - 1];
        int[] prices = new int[n];
        for (int i = 0; i < n - 1; i++) {
            distances[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            prices[i] = scan.nextInt();
        }

        long res = Gas(distances, prices);

        System.out.println(res);

	}
	 private static long Gas(int[] distances, int[] prices) {
	        long sum = 0;
	        int minPrice = prices[0];

	        for (int i = 0; i < distances.length; i++) {
	        	sum+=(long)distances[i]*minPrice;
	            minPrice = Math.min(minPrice, prices[i+1]);
	        }
	        return sum;
	    }
}
