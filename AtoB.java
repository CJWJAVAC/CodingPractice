package Silver02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtoB {
	
	static long a, b;
	static int res;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		a = scan.nextLong();
		b = scan.nextLong();
		res = 1;
		
		bfs();
		
		System.out.println(res);
		
		}
	
	static void bfs() {
		Queue<Long> queue = new LinkedList<>();
		queue.add(a);
		
		while(queue.size()!=0) {
			int size = queue.size();
			
			for(int i=0; i<size; i++) {
				long k = queue.poll();
				if(k==b) {
					return;
				}
				
				if(k*2<=b) {
					queue.add(k*2);
				}
				if(k*10+1<=b) {
					queue.add(k*10+1);
				}
			}
			res++;
		}
		res = -1;
	}
	
	}

	
	

