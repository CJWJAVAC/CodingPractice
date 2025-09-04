package Silver05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingNum {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		ArrayList num = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
			num.add(scan.nextInt());
		}
		Collections.sort(num);
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<num.size(); i++) {
			sb.append(num.get(i)).append("\n");
		}
		
		System.out.println(sb);
		
	}

}
