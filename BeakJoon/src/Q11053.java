import java.io.*;
import java.util.*;

public class Q11053 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numSize = Integer.parseInt(br.readLine());
		int[] nums = new int[numSize+1];
		int[] dp = new int[numSize+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i<=numSize; i++) {
			
			nums[i] = Integer.parseInt(st.nextToken());
			
			dp[i] = 1;
			for(int j = 1; j<i; j++) {
				if(nums[i] > nums[j] && dp[i] <= dp[j]) {
					dp[i] += 1;
				}
			}
		}
		
		int max = 0;
		for(int i = 1; i<= numSize; i++) {
			if(max < dp[i]) {
				max = dp[i];
			}
		}
		
		System.out.print(max);
	}

}
