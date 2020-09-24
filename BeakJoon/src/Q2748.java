import java.io.*;

public class Q2748 {
	
	static long a = 0;
	static long b = 1;
	static long c = 0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long num = Integer.parseInt(br.readLine());
	    System.out.print(fibo(num));
	}
	
	private static long fibo(long num) {
		
		if(num == 1) {
			return 1;
		}else {
			for (int i = 1; i<num; i++) {
				c = a+b;
				a = b;
				b = c;
			}
			
			return c;
		}
		
		
		
		
		
	}

}

