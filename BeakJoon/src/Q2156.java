import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2156 {
	
	//핵심포인트는, n번째에 놓는 경우의 수가 3가지로 나누어진다는 것.
	//그래서 그 3가지 중 최선의 선택을 하면 된다는 것
	
	// " 3번연속은 안된다 " 는 조건에 의해
	// 1) n번째에 안 놓는다. >> dp[i-1] 과 동일       - 0번 연속
	// 2) n번째에 놓는다. && n-1번째에는 안 놓여져 있다.  - 1번 연속
	// 3) n번째에 놓는다. && n-1번째에도 놓여져 있다.    - 2번 연속
	
	// 이 경우 중 max를 고르면 된다. 이렇게 될 경우, 
	// n+1에서도 그 이전의 모든 케이스들을 고려해서, 최선의 픽을 하게 되어
	// 매번 최선의 픽을 할 수 있게 된다.

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int[] amounts = new int[num+1];
		int[] dp = new int[num+1];
		
		for(int i = 1; i<= num; i++) {
			amounts[i] = Integer.parseInt(br.readLine());
		}
		
		if(num == 1) {
			System.out.print(amounts[1]);
			return;
		}
		
		if(num == 2) {
			System.out.print(amounts[1] + amounts[2]);
			return;
		}
		
		dp[1] = amounts[1];
		dp[2] = amounts[1] + amounts[2];
		
		
		for(int i = 3; i<= num; i++) {
			dp[i] = Math.max(dp[i-1], Math.max(dp[i-2] + amounts[i], dp[i-3] + amounts[i-1] + amounts[i]));
		}
		
		System.out.print(dp[num]);
	}

}
