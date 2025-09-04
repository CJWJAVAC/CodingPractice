package Silver02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Wedding {

	static int count = 0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		for(int i=0; i<=n; i++) {
			list.add(new ArrayList<Integer>());
		}
		
		for(int i=0; i<m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			list.get(a).add(b);
			list.get(b).add(a);
		}
		
		boolean[] visited = new boolean[n+1];
		
		bfs(list,visited,1);
		System.out.println(count);
	}
	
	static void bfs(ArrayList<ArrayList<Integer>> list, boolean[] visited, int start) {
		visited[start] = true;
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.add(new int[] {start,0});
		
		while(!queue.isEmpty()) {
			int[] current = queue.poll();
			int num = current[0];
			int level = current[1];
			
			if(level >= 2) continue;
			
			for(int n : list.get(num)) {
				if(!visited[n]) {
					visited[n] = true;
					count++;
					queue.add(new int[] {n, level+1});
				}
			}
		}
		
	}
}
