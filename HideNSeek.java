package Silver01;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class HideNSeek {
	
	static int n;
	static int k;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Queue<int[]> queue = new LinkedList<int[]>();
		Set<Integer> visited = new HashSet<>();
		
		n = scan.nextInt();
		k = scan.nextInt();
		
		int res = bfs(queue,visited);
		System.out.println(res);
	}

	static int bfs(Queue<int[]> queue, Set<Integer> visited) {
		if(k<=n) {
			return n-k;
		}
		
		queue.add(new int[] {n,0});
		visited.add(n);
		
		while(!queue.isEmpty()) {
			int[] current = queue.poll();
			int num = current[0];
			int count = current[1];
			
			int[] next = {num-1,num+1,num*2};
			
			for(int a : next) {
				if(a==k) {
					return count+1;
				}
				if(a>=0 && !visited.contains(a) && a<=2*k) {
					visited.add(a);
					queue.add(new int[] {a,count+1});
				}
			}
		}
		return -1;
	}
	
}
