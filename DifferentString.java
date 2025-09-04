package Silver03;

import java.util.HashSet;
import java.util.Scanner;

public class DifferentString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashSet<String> set = new HashSet<String>();
		
		String s = scan.next();
		
		long count = 0;
		
		for(int i=0; i<s.length(); i++) {
			for(int j=0; j<=s.length()-1-i; j++) {
				String str = s.substring(j, j+i+1);
				if(!set.contains(str)) {
					set.add(str);
					count++;
					continue;
				}
			}
		}
		
		System.out.println(count);
	}

}
