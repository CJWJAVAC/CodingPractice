package Silver05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DivideWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		ArrayList<String> sarr = new ArrayList<>();
		for(int i=0; i<str.length()-2; i++) {
			
			for(int j=i+1; j<str.length()-1; j++) {
				
				for(int k=j+1; k<str.length(); k++) {
					String arr = str.substring(0, i+1);
					StringBuffer sb = new StringBuffer(arr);
					arr = sb.reverse().toString();
					String brr = str.substring(i+1, j+1);
					StringBuffer sb1 = new StringBuffer(brr);
					brr = sb1.reverse().toString();
					String crr = str.substring(j+1);
					StringBuffer sb2 = new StringBuffer(crr);
					crr = sb2.reverse().toString();
					StringBuffer sb3 = new StringBuffer();
					sb3.append(arr).append(brr).append(crr);
					String concat = sb3.toString();
					sarr.add(concat);
				}
			}
		}
		
		Collections.sort(sarr);
		System.out.println(sarr.get(0));
	}

}
