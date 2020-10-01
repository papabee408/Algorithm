import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1912 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] data = new int[num];
		
		int[] dp = new int[num];
		int[] sum = new int[num];
		
		for(int i = 0; i<num; i++) {
			data[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[0] = data[0];
		sum[0] = data[0];

		int max = Integer.MIN_VALUE;
		
		if(num == 1) {
			System.out.print(data[0]);
			return;
		}
		
		
		for(int i = 1; i<num; i++) {
			
			if(sum[i-1] > 0) {
				sum[i] = sum[i-1] + data[i];
			}else {
				sum[i] = data[i];
			}

			dp[i] = Math.max(sum[i], dp[i-1]);
			
			if(dp[i] > max) {
				max = dp[i];
			}
		}
		
		System.out.print(max);
	}
}
