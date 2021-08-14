import java.util.*;

public class Q2749 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long num = scanner.nextLong();
		scanner.close();
		
		long a = 0;
		long b = 1;
		long c = 0;
		
		for(int i = 2; i<num; i++) {
			c = a+b;
			a = b;
			b = c;
		}
		

		if(num == 1 ) {
			System.out.print(0);	
		}else if(num == 2) {
			System.out.print(1);
		}
		else {
			System.out.print((c)%1000000);
		}
		
	}

}
