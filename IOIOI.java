package Silver01;

import java.util.*;

public class IOIOI {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		String str = scan.next();
		
		int count = 0;
		int pattern = 0;
		
		for(int i=1; i<m-1; i++) {
			if(str.charAt(i-1)=='I' && str.charAt(i)=='O' && str.charAt(i+1)=='I') {
				pattern++;
				if(pattern>=n) {
					count++;
				}
				i++;
			}else {
				pattern=0;
			}
		}
		System.out.println(count);
	}

}
