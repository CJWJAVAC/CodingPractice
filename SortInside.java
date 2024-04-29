package Silver05;

import java.util.*;

public class SortInside {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char [] arr = str.toCharArray();
		Arrays.sort(arr);
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
	}

}
