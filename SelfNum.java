package Silver05;

public class SelfNum {

	public static void main(String[] args) {
		
		boolean check[] = new boolean[10001];
		for(int i=1; i<10001; i++) {
			check[i]=true;
		}
		
		for(int i=1; i<10001; i++) {
			int n = check(i);
			if(n<10001) {
				check[n]=false;
			}
		}
		for(int i=1; i<10001; i++) {
			if(check[i]==true) System.out.println(i);
		}
	}
	
	static int check(int a) {
		int sum = a;
		while(a!=0) {
			sum+=a%10;
			a/=10;
		}
		return sum;
	}
	
}
