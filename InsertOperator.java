package Silver01;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertOperator {
	
	static Integer MAX = -1000000000;
	static Integer MIN = 1000000000;
	static int n;
	static int[] res = new int[2];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		int[] num = new int[n];
		
		for(int i=0; i<n; i++) {
			num[i] = scan.nextInt();
		}
		
		ArrayList<String> list = new ArrayList<>();
		for(int i=0; i<4; i++) {
			int o = scan.nextInt();
			if(i==0) {
				for(int j=0; j<o; j++) {
					list.add("+");
				}
			}
			if(i==1) {
				for(int j=0; j<o; j++) {
					list.add("-");
				}
			}
			if(i==2) {
				for(int j=0; j<o; j++) {
					list.add("*");
				}
			}
			if(i==3) {
				for(int j=0; j<o; j++) {
					list.add("/");
				}
			}
		}
		
		boolean[] OpVisited = new boolean[n-1];
		permute(num,list,new ArrayList<String>(), OpVisited);
		
		System.out.println(res[0]+"\n"+res[1]);
		
	}

	static void permute(int[] num, ArrayList<String> list, ArrayList<String> current, boolean[] OpVisited) {
		if(current.size()==2*n-1) {
			int result = Calculation(current);
			if(result<=MIN) {
				res[1] = result;
				MIN = result;
			}
			if(result>=MAX) {
				res[0] = result;
				MAX = result;
			}
		}
		
		int index = current.size()/2;
		
		if(current.size()%2==0) {
			current.add(num[index]+"");
			permute(num,list,current,OpVisited);
			current.remove(current.size()-1);
		}else {
			for(int i=0; i<list.size(); i++) {
				if(OpVisited[i]) continue;
				
				OpVisited[i] = true;
				current.add(list.get(i));
				
				permute(num,list,current,OpVisited);
				current.remove(current.size()-1);
				OpVisited[i] = false;
			}
		}
	}
	
	
	static int Calculation(ArrayList<String> current) {
		int result = Integer.parseInt(current.get(0));
		for(int i=1; i<current.size(); i+=2) {
			String operator = current.get(i);
			int next = Integer.parseInt(current.get(i+1));
			
			switch(operator) {
			case "+":
				result+=next;
				break;
			case "-":
				result-=next;
				break;
			case "*":
				result*=next;
				break;
			case "/":
				result/=next;
				break;
			}
			
		}
		return result;
	}
}
