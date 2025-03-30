package Silver01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class FindDomain {
	
	static int[][] domain;
	static int m;
	static int n;
	static int[] nx = {-1,0,0,1};
	static int[] ny = {0,1,-1,0};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		String[] str = br.readLine().split(" ");
		m = Integer.parseInt(str[0]);
		n = Integer.parseInt(str[1]);
		int k = Integer.parseInt(str[2]);
		
		domain = new int[m][n];
		for(int i=0; i<m; i++) {
			Arrays.fill(domain[i], 0);
		}
		boolean[][] visited = new boolean[m][n];
		
		for(int i=0; i<k; i++) {
			String[] squ = br.readLine().split(" ");
			int x1 = Integer.parseInt(squ[0]);
			int y1 = Integer.parseInt(squ[1]);
			int x2 = Integer.parseInt(squ[2]);
			int y2 = Integer.parseInt(squ[3]);
			
			SquareDomain(x1,y1,x2,y2);
		}
		
		int count = 0;
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(domain[i][j]==0 && !visited[i][j]) {
					count++;
					int res = dfs(visited,i,j);
					list.add(res);
				}
			}
		}
		
		Collections.sort(list);
		for(int next : list) {
			sb.append(next+" ");
		}
		
		System.out.println(count+"\n"+sb);
	}
	
	static void SquareDomain(int x1, int y1, int x2, int y2) {
		for(int i=y1; i<y2; i++) {
			for(int j=x1; j<x2; j++) {
				domain[i][j] = 1;
			}
		}
	}
	
	static int dfs(boolean[][] visited, int x, int y) {
		Queue<int[]> queue = new LinkedList<int[]>();
		int count = 1;
		
		queue.add(new int[]{x,y});
		visited[x][y] = true;
		
		while(!queue.isEmpty()) {
			int[] current =  queue.poll();
			int cx = current[0];
			int cy = current[1];
			
			for(int i=0; i<4; i++) {
				int dx = cx + nx[i];
				int dy = cy + ny[i];
				
				if(dx>=0 && dx<m && dy>=0 && dy<n && domain[dx][dy]==0 && !visited[dx][dy]) {
					visited[dx][dy]=true;
					queue.add(new int[] {dx,dy});
					count+=1;
				}
			}
		}
		return count;
	}

}
