package Silver01;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class EfficientHacking {
	
	static int n;
	static int[] cntArr;
	static boolean[] visited;
	static ArrayList<Integer>[] list;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		list = new ArrayList[n+1];
		
		for(int i=0; i<=n; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for(int i=0; i<m; i++) {
			String[] str2 = br.readLine().split(" ");
			int a = Integer.parseInt(str2[0]);
			int b = Integer.parseInt(str2[1]);
			
			list[a].add(b);
		}
		
		cntArr = new int[n+1];
		
		for(int i=1; i<=n; i++) {
			visited = new boolean[n+1];
			bfs(i);
		}
		
//		for(int i=1; i<=n; i++) {
//			System.out.println(count[i][0]+" "+count[i][1]);
//		}
		
		StringBuilder sb = new StringBuilder();
		int max = 0;
		
		for(int i=1; i<=n; i++) {
			max = Math.max(max, cntArr[i]);
		}
		
		for(int i=1; i<=n; i++) {
			if(cntArr[i] == max) {
				sb.append(i+" ");
			}
		}
		System.out.println(sb);
	}

	static void bfs(int start){
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		visited[start] = true;
				
		while(!queue.isEmpty()) {
			int current = queue.poll();
			
			for(int next : list[current]) {
				if(!visited[next]) {
					queue.add(next);
					visited[next] = true;
					cntArr[next]++;
				}
			}
		}
	}
	
}
