package Bronze01;

import java.util.Scanner;

public class EasyQuest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int arr[] = new int[1002];
		int count=1;
		for(int i=1; i<1001; i++) {
			for(int j=0; j<i; j++) {
				if(count==1001) 
					break;
			arr[count] = i;
			count++;
			}
		}
		int result = 0;
		for(int i=a; i<=b; i++) {
			result+=arr[i];
		}
		System.out.println(result);
	}

}
