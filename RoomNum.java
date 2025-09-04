package Silver05;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RoomNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		String numStr = number+"";
		int [] dup = new int[10];
		
		for(int i=0; i<numStr.length(); i++) {
			int digit = numStr.charAt(i)-'0';
			dup[digit]++;
		}
		
		int sn = dup[6]+dup[9];
		sn = sn/2 + sn%2;
		dup[6] = sn;
		dup[9] = 0;
		Arrays.sort(dup);
		System.out.println(dup[9]);
	}

}
