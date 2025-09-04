package Silver02;

import java.util.Scanner;

public class FieldOfChamoe {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int k = scan.nextInt();
		int[] arr = new int[6];
		
		int max_width = 0;
		int max_height = 0;
		int maxPosition_w=0;
		int maxPosition_h=0;
		for(int i=0; i<6; i++) {
			int direction = scan.nextInt();
			arr[i] = scan.nextInt();
			
			if((direction == 1 || direction == 2) && max_width<arr[i]) {
				max_width = arr[i];
				maxPosition_w = i;
			}
			else if((direction == 3 || direction == 4) && max_height<arr[i]) {
				max_height = arr[i];
				maxPosition_h = i;
			}
		}
		
		int allField = max_width * max_height;
		
		int right, left;
		if((maxPosition_w + 1) == 6) {
			right = 0;
		}else {
			right = maxPosition_w + 1;
		}
		
		if((maxPosition_w - 1) == -1) {
			left = 5;
		}else {
			left = maxPosition_w - 1;
		}
		
		int minWidth = Math.abs(arr[right] - arr[left]);
		
		if((maxPosition_h + 1) == 6) {
			right = 0;
		}else {
			right = maxPosition_h + 1;
		}
		
		if((maxPosition_h - 1) == -1) {
			left = 5;
		}else {
			left = maxPosition_h - 1;
		}
		
		int minHeight = Math.abs(arr[right] - arr[left]);
		
		int result = allField - minWidth * minHeight;
		
		System.out.println(result * k);
		
	}

}
