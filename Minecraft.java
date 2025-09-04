package Silver02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Minecraft {
	
	static int n;
	static int m;
	static int max;
	static int min;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer n = Integer.parseInt(st.nextToken());
        Integer m = Integer.parseInt(st.nextToken());
        Integer b = Integer.parseInt(st.nextToken());
		
		int[][] ground = new int[n][m];
		
		max = 0;
		min = 256;
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				ground[i][j] = Integer.parseInt(st.nextToken());
				if(max<ground[i][j]) {
					max = ground[i][j];
				}
				if(min>ground[i][j]) {
					min = ground[i][j];
				}
			}
		}
		
		int time = 0;		
		int res = Integer.MAX_VALUE;
		int res_height = 0;
		
		for(int i=min; i<=max; i++) {
			int buildBlock=0;
			int removeBlock = 0;
			int height = i;
			int restBlock = b;
			
			for(int k=0; k<n; k++) {
				for(int l=0; l<m; l++) {
					if(ground[k][l]<height) {
						buildBlock += height-ground[k][l];
						restBlock -= height-ground[k][l];
					}else if(ground[k][l]>height) {
						removeBlock += ground[k][l] - height;
						restBlock+= ground[k][l] - height;
					}
				}
			}
			
			if(restBlock<0) {
				continue;
			}
			
			time = buildBlock + 2*removeBlock;
			if(res>=time && res_height<=height) {
				res = time;
				res_height = height;
			}
		}
		System.out.println(res+" "+res_height);
	}
	
}
