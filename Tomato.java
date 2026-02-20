package Gold05;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Tomato {
	
	static int n, m, day;
	static int [] dx = {1,0,-1,0};
	static int [] dy = {0,1,0,-1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		m = Integer.parseInt(str[0]);
		n = Integer.parseInt(str[1]);
		
		int[][] box = new int[n][m];
		
		for(int i=0; i<n; i++) {
			String[] str2 = br.readLine().split(" ");
			for(int j=0; j<m; j++) {
				box[i][j] = Integer.parseInt(str2[j]);
			}
		}
		
		bfs(box,new boolean[n][m],n,m);
		
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<m; j++) {
//				System.out.print(box[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		boolean flag = true;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(box[i][j] == 0) {
					flag = false;
					break;
				}
			}
			if(!flag) break;
		}
		
		if(flag) {
			System.out.println(day);
		}else {
			System.out.println("-1");
		}
	}

	static void bfs(int[][] box, boolean[][] visited, int n, int m) {
		Queue<int[]> queue = new LinkedList<>();
		List<int[]> list = getTomato(box);
		
		for(int[] num : list) {
			queue.add(num);
		}
		
		while(!queue.isEmpty()) {
			int[] current = queue.poll();
			int x = current[0];
			int y = current[1];
			day = current[2];
			visited[x][y] = true;
			
			for(int i=0; i<4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(nx < n && nx >= 0 && ny < m && ny >=0 && box[nx][ny]==0 && !visited[nx][ny]) {
					day = current[2]+1;
					box[nx][ny] = 1;
					queue.add(new int[] {nx,ny,day});
				}
			}
		}
	}
	
	static List<int[]> getTomato(int[][] box) {
		List<int[]> list = new ArrayList<int[]>();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(box[i][j]==1) {
					list.add(new int[] {i,j,0});
				}
			}
		}
		return list;
	}
}
