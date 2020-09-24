import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1003 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numOfCases = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < numOfCases; i++) {
			long num = Integer.parseInt(br.readLine());
			check(num);
		}
		
	}

	private static void check(long num) {
		
		long a = 0;
		long b = 1;
		long c = 0;
		
		if(num == 1) {
			System.out.println("0 1");
			return;
		}else if (num == 0) {
			System.out.println("1 0");
			return;
		}
		else {
			for (int i = 1; i < num; i ++) {
				c = a+b;
				a = b;
				b = c;		
			}
			
			
		}
		System.out.println(a+ " " +b);
	}

}
