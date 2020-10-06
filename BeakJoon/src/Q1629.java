import java.util.*;

public class Q1629 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long num = scanner.nextInt();
		long times = scanner.nextInt();
		long divider = scanner.nextInt();
		scanner.close();
		
		
		long value = calculate(1, num, times, divider);
		System.out.print(value);
	}

	private static long calculate(long value, long num, long times, long divider) {
		
		long newNum;
		newNum = num % divider;
		
		while(times != 0) {
			
			if(times%2 == 1) {
				value *= newNum;
				value %= divider;
			}
			newNum = ((newNum%divider)*(newNum%divider))%divider;
			times /= 2; 
		}
		
		return value;
	}

}
