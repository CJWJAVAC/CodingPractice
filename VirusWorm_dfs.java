package Silver03;

import java.util.ArrayList;
import java.util.Scanner;

public class VirusWorm_dfs {
	
	static int count = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			int com1 = scan.nextInt();
			int com2 = scan.nextInt();
			
			graph.get(com1).add(com2);
			graph.get(com2).add(com1);
		}
		
		int result = computerCounts(graph, 1);
		
		System.out.println(result);
	}
	
	static int computerCounts(ArrayList<ArrayList<Integer>> graph, int node) {
		boolean[] visited = new boolean[graph.size()];
		return dfs(graph, node, visited)-1;
	}
	
	static int dfs(ArrayList<ArrayList<Integer>> graph, int node, boolean[] visited) {
		visited[node] = true;
		int conntected = 1;
		
		for(int next : graph.get(node)) {
			if(!visited[next]) {
				conntected+=dfs(graph,next,visited);
			}
		}
		
		return conntected;
	}

}
