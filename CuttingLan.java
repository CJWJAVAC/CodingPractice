package Silver02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CuttingLan {
	
	static int n;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		int k = scan.nextInt();
		n = scan.nextInt();
		
		for(int i=0; i<k; i++) {
			int a = scan.nextInt();
			list.add(a);
		}
		
		Collections.sort(list);
		
		long min = 1;
		long max = list.get(list.size()-1);
		
		long lan = lanHeight(list,min,max);
		
		System.out.println(lan);
		
	}
	
	static long lanHeight(ArrayList<Integer> list, long min, long max) {
		long resLan = 0;
		
		if(list.size()==1) {
			return max/n;
		}
		
		while(min<=max) {
			long mid = (min+max)/2;
			long sum = calculateLan(list,mid);
			
			if(sum >= n) {
				resLan = mid;
				min = mid +1;
			}else {
				max = mid-1;
			}
		}
		return resLan;
	}
	
	static long calculateLan(ArrayList<Integer> list, long mid) {
		long sum = 0;
		for(long lan : list) {
			sum += (lan/mid);
		}
		return sum;
	}
}
