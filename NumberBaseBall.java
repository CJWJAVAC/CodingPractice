package Silver02;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberBaseBall {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		
		int count = 0;
		
		int n = scan.nextInt();
				
		for(int i = 123; i<=987; i++) {
			int a = i/100;
			int b = (i%100)/10;
			int c = i%10;
			
			if((a!=b) && (b!=c) && (c!=a)) {
				String num = i+"";
				list.add(num);
			}
		}
				
		for(int i=0; i<n; i++) {
			String num = scan.next();
			int strike = scan.nextInt();
			int ball = scan.nextInt();
			
			ArrayList<String> result = new ArrayList<String>();
			
			for(String j : list) {
				if(Strike(num,j,strike) && Ball(num,j,ball)) {
					result.add(j);
				}
			}
			list = result;
		}
		System.out.println(list.size());
	}

	static boolean Strike(String num, String rule, int st) {
		int count = 0;
		for(int i=0; i<3; i++) {
			if(num.charAt(i) == rule.charAt(i)){
	            count++;
	        }
		}
		return count == st;
	}
	
	static boolean Ball(String num, String rule, int st) {
		int count = 0;
		for(int i=0; i<3; i++) {
			if((num.charAt(i) != rule.charAt(i)) && (num.contains(String.valueOf(rule.charAt(i))))) {
				count++;
			}
		}
		return count == st;
	}
}
