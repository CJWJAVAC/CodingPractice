package Silver01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class BlockNumber {
	
	static int[] cx = {0,1,0,-1};
	static int[] cy = {1,0,-1,0};
	static int n;
	static int BlockCount;
	static ArrayList<Integer> list;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		int[][] block = new int[n][n];
		boolean[][] visited = new boolean[n][n];
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0; j<n; j++) {
				block[i][j] = str.charAt(j)-'0';
			}
		}
		
		BlockCount=0;
		StringBuilder sb = new StringBuilder();
		list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(block[i][j]==1 && !visited[i][j]) {
					bfs(block,visited,i,j);
				}
			}
		}
		
		Collections.sort(list);
		sb.append(BlockCount+"\n");
		for(int next : list) {
			sb.append(next+"\n");
		}
		
		System.out.println(sb);
	}
	
	static void bfs(int[][] block, boolean[][] visited, int startX, int startY) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {startX, startY});
		visited[startX][startY] = true;
		int housecount=1;
		
		while(!queue.isEmpty()) {
			int[] current = queue.poll();
			int x = current[0];
			int y = current[1];
			
			for(int i=0; i<4; i++) {
				int nx = x + cx[i];
				int ny = y + cy[i];
				
				if(nx>=0 && nx<n && ny>=0 && ny<n && !visited[nx][ny] && block[nx][ny]==1) {
					queue.add(new int[] {nx,ny});
					visited[nx][ny]=true;
					housecount++;
				}
			}
		}
		
		BlockCount++;
		list.add(housecount);
		
	}
	
}
