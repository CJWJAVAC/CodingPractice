package Silver03;

import java.util.Scanner;

public class Fibonacci {
	
	static int zero;
	static int one;
	static int zerone;
		
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        int t = scan.nextInt();
        
        for(int i=0; i<t; i++) {
        	StringBuilder sb = new StringBuilder();
            int n = scan.nextInt();
            fib(n);
            sb.append(zero).append(' ').append(one);
            System.out.println(sb);
        }
        
    }
    
    static void fib(int n) {
    	zero = 1;
    	one = 0;
    	zerone=1;
    	for(int i=0; i<n; i++) {
    		zero = one;
    		one = zerone;
    		zerone = zero + one;
    	}
    }
    
}
