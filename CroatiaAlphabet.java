package Silver05;

import java.util.ArrayList;
import java.util.Scanner;

public class CroatiaAlphabet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Character> cro = new ArrayList<>();
		
		String str = scan.next();
		
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			cro.add(str.charAt(i));
		}
		
		for(int i=0; i<cro.size(); i++) {
			if(i<=cro.size()-2 && cro.get(i)=='c') {
				if(cro.get(i+1)=='=' || cro.get(i+1)=='-') {
					count++;
					i++;
				}
				else count++;
			}
			else if(cro.get(i)=='d') {
				if(i<=cro.size()-2 && cro.get(i+1)=='-') {count++; i++;}
				else if(i<=cro.size()-2 && cro.get(i+1)=='z') {
					if(i<=cro.size()-3 && cro.get(i+2)=='=') {
						count++;
						i+=2;
					}
					else {count+=2; i++;}
				}
				else count++;
			}
			else if(i<=cro.size()-2 && (cro.get(i)=='l' || cro.get(i)=='n')) {
				if(cro.get(i+1)=='j') {count++; i++;}
				else count++;
			}
			else if(i<=cro.size()-2 && (cro.get(i)=='s' || cro.get(i)=='z')) {
				if(cro.get(i+1)=='=') {count++; i++;}
				else count++;
			}
			else count++;
		}
		System.out.println(count);
	}
	
}
