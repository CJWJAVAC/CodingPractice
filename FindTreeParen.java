package Silver02;

import java.util.ArrayList;
import java.util.Scanner;

public class FindTreeParen {
	
	static int n;
	static boolean[] visited;
	static int[] parent;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		n = scan.nextInt();
		
		for(int i=0; i<=n; i++) {
			list.add(new ArrayList<>());
		}
		
		for(int i=0; i<n-1; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			list.get(a).add(b);
			list.get(b).add(a);
		}
		
		parent = new int[n+1];
		visited = new boolean[n+1];
		
		findParen(list,1);
		
		for(int i=2; i<=n; i++) {
			sb.append(parent[i]+"\n");
		}
	
		System.out.println(sb);
	}

	static void findParen(ArrayList<ArrayList<Integer>> list, int now) {
		visited[now] = true;
		
		for(int next : list.get(now)) {
			if(!visited[next]) {
				parent[next] = now;
				findParen(list,next);
			}
		}
	}
	
}
