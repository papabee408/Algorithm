import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q12865 {
	
	static int numOfStuff;
	static int totalWeight;
	static int[][] data;
	static int[][] dp;

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		numOfStuff = Integer.parseInt(st.nextToken());
		totalWeight = Integer.parseInt(st.nextToken());
		
		data = new int[numOfStuff+1][2];
		dp = new int[numOfStuff+1][totalWeight+1];
		
		
		for (int i = 1; i<= numOfStuff; i++) {
			st = new StringTokenizer(br.readLine());
			data[i][0] = Integer.parseInt(st.nextToken()); // weight
			data[i][1] = Integer.parseInt(st.nextToken()); // value
		}

		//input이 1개일 경우 처리하기
		if(numOfStuff == 1) {
			if(data[0][0] > totalWeight) {
				System.out.print(0);
			}else {
				System.out.print(data[0][1]);
			}
			return;
		}

		//나머지 case 처리하기
		dfs(numOfStuff, totalWeight, 0);
		System.out.print(dp[numOfStuff][totalWeight]);
	}

	private static int dfs(int itemIndex, int totalWeight, int value) {
		
		if(itemIndex == 0 || totalWeight == 0) {
			dp[itemIndex][totalWeight] = value;
			return dp[itemIndex][totalWeight]; 
		}
		else if(data[itemIndex][0] > totalWeight) {
			return dp[itemIndex][totalWeight] = dfs(itemIndex-1, totalWeight, value);
		}
		else {
			return dp[itemIndex][totalWeight] = Math.max(dfs(itemIndex -1, totalWeight, value), dfs(itemIndex -1, totalWeight-data[itemIndex][0], value+data[itemIndex][1]));
		}
		
	}

}
