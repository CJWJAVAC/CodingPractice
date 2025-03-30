package Silver02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CityOfDistance {
	
	static int n,m,k,x;
	static int[] distance;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		n = scan.nextInt();
		m = scan.nextInt();
		k = scan.nextInt();
		x = scan.nextInt();
		
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<>());
		}
		
		for(int i=0; i<m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			graph.get(a).add(b);
		}
		
		visited = new boolean[n+1];
		distance = new int[n+1];
		Arrays.fill(distance, 300000);
		distance[x] = 0;
		
		bfs(graph,x);
		
		boolean flag = false;
		for(int i=0; i<distance.length; i++) {
			if(distance[i]==k) {
				sb.append(i+"\n");
				flag = true;
			}
		}
		
		if(!flag) {
			sb.append("-1");
		}
		System.out.println(sb);
		
//		for(int n : distance) {
//			System.out.println(n+" ");
//		}
	}

	static void bfs(ArrayList<ArrayList<Integer>> graph, int start) {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(start);
		visited[start] = true;
		
		while(queue.size()!=0) {
			int current = queue.poll();
			
			for(int next : graph.get(current)) {
				if(!visited[next]) {
					visited[next] = true;
					distance[next] = distance[current]+1;
					queue.add(next);
				}
			}
		}
	}
	
}
