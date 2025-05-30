package Silver03;

import java.util.LinkedList;
import java.util.Scanner;

public class PrinterQueue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			
			int res = Printer(n,m,scan);
			sb.append(res+"\n");
		}
		
		System.out.println(sb);
	}
	
	static int Printer(int n, int m,Scanner scan) {
		LinkedList<int[]> queue = new LinkedList<>();
		
		for(int i=0; i<n; i++) {
			queue.offer(new int[] {i, scan.nextInt() });
		}
		
		int count = 0;
		
		while(!queue.isEmpty()) {
			int[] element = queue.poll();
			boolean Max = true;
			
			for(int j=0; j<queue.size(); j++) {
				if(element[1]<queue.get(j)[1]) {
					queue.offer(element);
					for(int k=0; k<j; k++) {
						queue.offer(queue.poll());
					}
					Max = false;
					break;
				}
			}
			
			if(Max==false) {
				continue;
			}
			
			count++;
			
			if(element[0]==m) {
				break;
			}
		}
		return count;
	}

}
