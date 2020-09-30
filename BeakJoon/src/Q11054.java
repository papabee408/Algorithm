import java.io.*;
import java.util.*;



public class Q11054 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dataSize = Integer.parseInt(br.readLine());
		int[] data = new int[dataSize+1];
		int[][] dp = new int[2][dataSize+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//set data
		for (int i = 1 ; i<=dataSize; i++ ) {
			data[i] = Integer.parseInt(st.nextToken());
		}
		
		// from Left LIS
		for (int i = 1 ; i<=dataSize; i++ ) {
			dp[0][i] = 1;
			for (int j = 1 ; j<i; j++ ) {
				if(data[j] < data[i] && dp[0][i] <= dp[0][j]) {
					dp[0][i]++;
				}
			}
		}
		
		// from Right LIS
		for (int i = dataSize ; i>=1; i--) {
			dp[1][i] = 1;
			for (int j = dataSize ; j>=i; j--) {
				if(data[j] < data[i] && dp[1][i] <= dp[1][j]) {
					dp[1][i]++;
				}
			}
		}
		
		//sum dp
		for (int i = 1 ; i<=dataSize; i++ ) {
			dp[0][i] += dp[1][i];
		}
		
		//print result
		int max = 0;
		for (int i = 1 ; i<=dataSize; i++ ) {
			if (dp[0][i] > max) {
				max = dp[0][i];
			}
		}
		
		System.out.print(max-1);

	}

}
