package Silver04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			list.add(scan.nextInt());
		}
		
		Collections.sort(list);
		int time = 0;
		int result=0;
		
		for(int i=0; i<list.size(); i++) {
			time+=list.get(i);
			result+=time;
		}
		System.out.println(result);
	}

}
