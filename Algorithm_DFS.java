package Silver02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Algorithm_DFS {
	
	static int level = 1;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		StringBuilder sb = new StringBuilder();
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int r = scan.nextInt();
		
		boolean[] visited = new boolean[n+1];
		int[] count = new int[n+1];
		
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for(int i=0; i<m; i++) {
			int u = scan.nextInt();
			int v = scan.nextInt();
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		
		dfs(graph,visited,count,r);
		
		for(int i=1; i<=n; i++) {
			sb.append(count[i]+"\n");
		}
		System.out.println(sb);
	}
	
	static void dfs(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int[] count, int start) {
		visited[start] = true;
		count[start] = level;
		
		ArrayList<Integer> current = graph.get(start);
		Collections.sort(current);
		for(int i : current) {
			if(!visited[i]) {
				level++;
				dfs(graph,visited,count,i);
			}
		}
	}
}
