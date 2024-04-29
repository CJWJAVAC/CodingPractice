package Bronze02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Workout {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N =Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int T =Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		int j=0;
		int beat=m;
		if((M-m)<T) {
			System.out.println(-1);
		}else {
		while(true) {
			if((beat+T)<=M) {
			beat+=T;
			N--;
			}else {
				beat-=R;
			}
			if(beat<m) {
				beat=m;
			}
			j++;
			if(N==0)
				break;
			}
		System.out.println(j);
		}
	}
	}

