package Silver03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class SumOfTwoNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> set = new HashSet<Integer>();
		
		int n = Integer.parseInt(br.readLine());
		
		String[] number = br.readLine().split(" ");
		
		int x = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		for(int i=0; i<n; i++) {
			int a = Integer.parseInt(number[i]);
			int b = x - a;
			
			if(set.contains(b)) {
				count++;
			}
			set.add(a);
		}
		System.out.println(count);
	}

}
