package Silver01;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class AbsoluteValueHeap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		Comparator<Integer> custom = (a,b) -> {
			if(Math.abs(a) < Math.abs(b)) return -1;
			if(Math.abs(a) > Math.abs(b)) return 1;
			return Integer.compare(a, b);
		};
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(custom);
		
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			int x = scan.nextInt();
			int p = 0;
			switch(x) {
			case 0:
				if(queue.size()==0) {
					p = 0;
				}else {
					p = queue.poll();
				}
				sb.append(p+"\n");
				break;
				
			default:
				queue.add(x);
				break;
			}
		}
		
		System.out.println(sb);
	}

}
