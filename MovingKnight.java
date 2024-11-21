package Silver01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class MovingKnight {
	
	static int[] dx = {2,2,1,1,-1,-1,-2,-2};
	static int[] dy = {-1,1,-2,2,-2,2,-1,1};
	static StringBuilder sb = new StringBuilder(); 

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			int l = Integer.parseInt(br.readLine());
			
			String[] str1 = br.readLine().split(" ");
			int x1 = Integer.parseInt(str1[0]);
			int y1 = Integer.parseInt(str1[1]);
			
			String[] str2 = br.readLine().split(" ");
			int x2 = Integer.parseInt(str2[0]);
			int y2 = Integer.parseInt(str2[1]);
			
			sb.append(Knight(l, x1, y1, x2, y2)+"\n");
		}
		
		System.out.println(sb);
	}

	static int Knight(int l, int x1, int y1, int x2, int y2) {
		if(x1==x2 && y1==y2) {
			return 0;
		}
		
		boolean[][] visited = new boolean[l][l];
		Queue<int[]> queue = new LinkedList<int[]>();
		
		queue.add(new int[]{x1,y1,0});
		visited[x1][y1] = true;
		
		while(!queue.isEmpty()) {
			int[] current = queue.poll();
			int x = current[0];
			int y = current[1];
			int count = current[2];
			
			for(int i=0; i<8; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(nx>=0 && nx<l && ny>=0 && ny<l && !visited[nx][ny]) {
					if(nx==x2 && ny==y2) {
						return count+1;
					}
					queue.add(new int[] {nx,ny,count+1});
					visited[nx][ny] = true;
				}
			}
		}
		
		return -1;
	}
	
}
