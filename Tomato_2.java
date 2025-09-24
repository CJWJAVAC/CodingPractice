package Gold05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Tomato_2 {
	
	static int m,n,h;
	static int[][][] tomato;
	static int[] dx = {1,0,-1,0,0,0};
	static int[] dy = {0,1,0,-1,0,0};
	static int[] dz = {0,0,0,0,-1,1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		m = Integer.parseInt(str[0]);
		n = Integer.parseInt(str[1]);
		h = Integer.parseInt(str[2]);
		
		tomato = new int[h][n][m];
		Queue<int[]> queue = new LinkedList<int[]>();
		
		for(int i=0; i<h; i++) {
			for(int j=0; j<n; j++) {
				String[] num = br.readLine().split(" ");
				for(int k=0; k<m; k++) {
					tomato[i][j][k] = Integer.parseInt(num[k]);
					if(tomato[i][j][k] == 1) {
						queue.add(new int[] {i,j,k,0});
					}
				}
			}
		}
				
		int day = bfs(queue);
		
//		for(int i=0; i<n; i++) {
//		for(int j=0; j<m; j++) {
//			System.out.print(tomato[i][j]+" ");
//		}
//		System.out.println();
//		}
		
		boolean flag = true;
		for(int i=0; i<h; i++) {
			for(int j=0; j<n; j++) {
				for(int k=0; k<m; k++) {
					if(tomato[i][j][k] == 0) {
						flag = false;
						break;
					}
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

	static int bfs(Queue<int[]> queue) {
		int maxday = 0;
		
		while(!queue.isEmpty()) {
			int[] current = queue.poll();
			int z = current[0];
			int x = current[1];
			int y = current[2];
			int day = current[3];
			maxday = Math.max(maxday, day);
			
			for(int i=0; i<6; i++) {
				int nz = z + dz[i];
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(nz < h && nz >=0 && nx < n && nx >=0 && ny < m && ny >=0) {
					if(tomato[nz][nx][ny] == 0) {
						tomato[nz][nx][ny] = 1;
						queue.add(new int[] {nz,nx,ny,day+1});
					}
				}
			}
		}
		return maxday;
	}
	
}
