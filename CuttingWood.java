package Silver02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CuttingWood {
	static long m;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Long> list = new ArrayList<>();
        
        int n = scan.nextInt();
        m = scan.nextLong();
        
        for(int i = 0; i < n; i++) {
            long a = scan.nextLong();
            list.add(a);
        }
        
        Collections.sort(list);
        
        long min = 0;
        long max = list.get(list.size() - 1);
        
        long res = findOptimalSawHeight(list, min, max);
        System.out.println(res);
    }
    
    static long findOptimalSawHeight(ArrayList<Long> list, long min, long max) {
        long optimalSawHeight = 0;
        
        while (min <= max) {
            long mid = (min + max) / 2;
            long sum = calculateWoodSum(list, mid);

            if (sum >= m) {
                optimalSawHeight = mid;  
                min = mid + 1;  
            } else {
                max = mid - 1;  
            }
        }
        
        return optimalSawHeight;
    }
    
    static long calculateWoodSum(ArrayList<Long> list, long sawHeight) {
        long sum = 0;
        
        for (long length : list) {
            if (length > sawHeight) {
                sum += length - sawHeight;
            }
        }
        
        return sum;
    }
}
