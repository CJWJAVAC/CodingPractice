package Bronze01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandProm {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str [] = new String[n];
		for(int i=0; i<n; i++) {
			str[i]=br.readLine();
		}
		for(int i=0; i<str[0].length(); i++) {
			boolean tf = true;
			for(int j=0; j<n; j++) {
				if(str[0].charAt(i)!=str[j].charAt(i)) {
					tf=false;
					break;
				}
			}
			if(tf==true) {
				System.out.print(str[0].charAt(i));
			}
			else {
				System.out.print('?');
			}
		}
	}

}
