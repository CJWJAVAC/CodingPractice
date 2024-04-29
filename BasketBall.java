package Bronze02;

import java.util.Scanner;

public class BasketBall {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int arr[] = new int[27]; 
		int alarm=0;
		for(int i=0; i<n; i++) {
			String name = scan.next();
			arr[name.charAt(0)-'a']++;
		}
		for(int i=0; i<27; i++) {
			if(arr[i]>=5) {
				System.out.print((char)(i+'a'));
				alarm=1;
			}
		}
		if(alarm==0)
			System.out.print("PREDAJA");
	}

}
