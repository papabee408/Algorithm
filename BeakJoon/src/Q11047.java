import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q11047 {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		
		//data setting
		int numOfCoins = scanner.nextInt();
		int money = scanner.nextInt();
		
		
		int[] coins = new int[numOfCoins];
		for(int i = 0 ; i< numOfCoins; i++) {
			coins[i] = scanner.nextInt();
		}
		
		int count = 0;
		
		//count
		
		for(int i = numOfCoins-1 ; i>=0 ; i--) {
			while(coins[i] <= money && money != 0) {
				money -= coins[i];
				count++;
			}
		}
		
		System.out.print(count);
		
		
		
	}

}
