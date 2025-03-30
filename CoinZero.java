package Silver04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CoinZero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			list.add(scan.nextInt());
		}
		
		int count = 0;
		
		for(int i=list.size()-1; i>-1; i--) {
			if(list.get(i)<=k) {
				while(k>=list.get(i)) {
				k-=list.get(i);
				count++;
				}
			}
		}
		System.out.println(count);
	}

}
