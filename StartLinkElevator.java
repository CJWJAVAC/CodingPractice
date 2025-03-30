package Silver01;

import java.util.*;

public class StartLinkElevator {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int f = scan.nextInt();
		int s = scan.nextInt();
		int g = scan.nextInt();
		int u = scan.nextInt();
		int d = scan.nextInt();
		
		int res = bfs(f,s,g,u,d);
		if(res!=-1) {
			System.out.println(res);
		}else {
			System.out.println("use the stairs");
		}
	}

	static int bfs(int f, int s, int g, int u, int d) {
		Queue<int[]> queue = new LinkedList<int[]>();
		boolean[] visited = new boolean[f+1];
		boolean flag = false;
		
		queue.add(new int[] {s,0});
		int min = 0;
		
		while(!queue.isEmpty()) {
			int[] current = queue.poll();
			
			int next = current[0];
			int count = current[1];
			
			if(next>f || next<1 || visited[next]) {
				continue;
			}
			
			visited[next] = true;
			
			if(next==g) {
				flag = true;
				min = count;
				break;
			}
			
			queue.add(new int[] {next+u,count+1});
			queue.add(new int[] {next-d,count+1});
		}
		
		if(flag) {
			return min;
		}
		else {
			return -1;
		}
	}
	
}
