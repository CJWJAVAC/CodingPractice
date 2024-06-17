package Silver02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS_and_BFS {
    public static void main(String[] args) {
       ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
       Scanner scan = new Scanner(System.in);
       
       int n = scan.nextInt();
       int m = scan.nextInt();
       int v = scan.nextInt();
       
       for(int i=0; i<=n; i++) {
    	   graph.add(new ArrayList<Integer>());
       }
       
       for(int i=0; i<m; i++) {
    	   int a = scan.nextInt();
    	   int b = scan.nextInt();
    	   graph.get(a).add(b);
    	   graph.get(b).add(a);
       }
       
       for(int i=1; i<=n; i++) {
    	   Collections.sort(graph.get(i));
       }
       
       boolean visited[] = new boolean[n+1];
       
       dfs(graph,visited,v);
       System.out.println();
       Arrays.fill(visited, false);
       
       bfs(graph,visited,v);
    }
    
    static void dfs(ArrayList<ArrayList<Integer>> graph, boolean visited[], int start) {
    	visited[start] = true;
    	System.out.print(start+" ");
    	
    	for(int next : graph.get(start)) {
    		if(!visited[next]) {
    			dfs(graph,visited,next);
    		}
    	}
    }
    
    static void bfs(ArrayList<ArrayList<Integer>> graph, boolean visited[], int start) {
    	Queue<Integer> queue = new LinkedList<Integer>();
    	visited[start] = true;
    	queue.add(start);
    	
    	while(queue.size()!=0) {
    		int current = queue.poll();
    		System.out.print(current+" ");
    		
    		for(int next : graph.get(current)) {
    			if(!visited[next]) {
    				visited[next] = true;
    				queue.offer(next);
    			}
    		}
    	}
    }
}
