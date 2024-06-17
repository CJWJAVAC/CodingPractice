package Silver02;

import java.util.ArrayList;
import java.util.Scanner;

public class ConnectedComponent {
	
	static boolean[] visited;
	static int result;

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		visited = new boolean[n+1];
		
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<>());
		}
		
		for(int i=0; i<m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			graph.get(a).add(b);
			graph.get(b).add(a);
		}
		result = 0;
		
		for(int i=1; i<=n; i++) {
			if(!visited[i]) {
				result++;
				dfs(graph,i);
			}
		}
		
		System.out.println(result);
	}
	
	static void dfs(ArrayList<ArrayList<Integer>> graph, int start) {
		visited[start] = true;
		
		for(int next : graph.get(start)) {
			if(!visited[next]) {
				dfs(graph,next);
			}
		}
	}

}
