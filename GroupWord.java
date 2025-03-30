package Silver05;

import java.util.Scanner;

public class GroupWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count=n;
		for(int i=0; i<n; i++) {
			String str = scan.next();
			boolean [] arr = new boolean[26];
			for(int j=0; j<str.length()-1; j++) {
				if(str.charAt(j)!=str.charAt(j+1)) { //현재 글자와 다음 글자가 다르면서  다음 글자가 이전에 나온 글자인 경우
					if(arr[str.charAt(j+1)-97]==true) {
						count--;
						break;
					}
				}			
				arr[str.charAt(j)-97]=true;
			}
		}
		System.out.println(count);
	}

}
