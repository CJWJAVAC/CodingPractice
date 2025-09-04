package Silver03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FashionKing {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			Map<String, Integer> map = new HashMap<String, Integer>();
			int m = scan.nextInt();
			
			for(int j=0; j<m; j++) {
				String cloth = scan.next();
				String type = scan.next();
				
				map.put(type, map.getOrDefault(type, 0)+1);
			}
			
			int result = 1;
			for(int count : map.values()) {
				result *= (count+1);
			}
			result = result-1;
			sb.append(result+"\n");
		}
		System.out.println(sb);
	}

}
