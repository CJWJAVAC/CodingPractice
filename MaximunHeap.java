package Silver02;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaximunHeap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		
		int n = scan.nextInt();
		for(int i=0; i<n; i++) {
			int x = scan.nextInt();
			if(x==0) {
				if(queue.isEmpty()) {
					sb.append(0+"\n");
				}else {
					sb.append(queue.poll()+"\n");
				}
			}
			else {
				queue.add(x);
			}
		}
		
		System.out.println(sb);
	}

}
