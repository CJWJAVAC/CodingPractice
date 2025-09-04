package Silver03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class VirusWorm_bfs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		
		int comNum = scan.nextInt();
		for(int i=0; i<=comNum; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		int comPair = scan.nextInt();
		
		for(int i=0; i<comPair; i++) {
			int com1 = scan.nextInt();
			int com2 = scan.nextInt();
			
			graph.get(com1).add(com2);
			graph.get(com2).add(com1);
		}
		
		boolean[] visited = new boolean[graph.size()];
		
		int result = bfs(graph, 1, visited);
		System.out.println(result);
	}

	static int bfs(ArrayList<ArrayList<Integer>> graph, int start, boolean[] visited) {
		visited[start] = true;
		int connected = 0;
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(start);
		
		while(!queue.isEmpty()) {
			int node = queue.poll();
			connected++;
			
			for(int next : graph.get(node)) {
				if(!visited[next]) {
					visited[next] = true;
					queue.offer(next);
				}
			}
		}
		return connected-1;
	}
	
}
