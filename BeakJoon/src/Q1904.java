import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1904 {
	

	public static void main(String[] args) throws Exception{
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine());
			
			long a = 0;
			long b = 1;
			long c = 0;
			
			for (int i = 0; i < num; i++) {
				c = (a+b)%15746;
				a = b;
				b = c;
			}
			
			System.out.print(c);
		}
	
}

/*
 * 	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		long a = 0;
		long b = 1;
		long c = 0;
		
		for (int i = 0; i < num; i++) {
			c = a+b;
			a = b;
			b = c;
		}
		
		System.out.print(c%15746);
	}
	*/
