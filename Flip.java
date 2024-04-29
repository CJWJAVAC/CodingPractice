package Silver05;

import java.util.Scanner;

public class Flip {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		String str = scan.next();
		int countZ = 0;//0
		int countO = 0;//1
		if(str.charAt(0)=='0') countZ++;
		else countO++;
		for(int i=1; i<str.length(); i++) {
			if(str.charAt(i-1)==str.charAt(i)) {
				continue;
			}
			else if(str.charAt(i-1)=='0'&&str.charAt(i)=='1') {
				countO++;
			}
			else if(str.charAt(i-1)=='1'&&str.charAt(i)=='0') {
				countZ++;
			}
		}
		System.out.println((int)Math.min(countZ, countO));
	}

}
