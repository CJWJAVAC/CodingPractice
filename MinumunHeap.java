package Silver02;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MinumunHeap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		StringBuilder sb = new StringBuilder();
		
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			int x = scan.nextInt();
			if(x==0) {
				if(minHeap.isEmpty()) {
					sb.append(0+"\n");
					continue;
				}
				sb.append(minHeap.poll()+"\n");
			}else {
				minHeap.add(x);
			}
		}
		
		System.out.println(sb);
		
	}

}
