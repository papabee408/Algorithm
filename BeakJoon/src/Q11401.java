import java.util.HashMap;
import java.util.Scanner;

public class Q11401 {
	
	static HashMap<long[], Long> map;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		map = new HashMap<long[], Long>();
		
		long n = scanner.nextInt();
		long k = scanner.nextInt();
		
		scanner.close();
		
		System.out.print(func(n, k)%1000000007);

	}

	private static long func(long n, long k) {
		
		if(n == k) {
			return 1;
		}else if(k == 1) {
			return n;
		}else if(n - k == 1) {
			return n;
		}
		else {
			long[] key = new long[] {n, k};
			
			if(!map.containsKey(key)) {
				map.put(key, func(n-1, k) + func(n-1, k-1));
			}
			
			return map.get(key);
		}
		
	}

}
