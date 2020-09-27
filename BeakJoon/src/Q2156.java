import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2156 {
	
	//�ٽ�����Ʈ��, n��°�� ���� ����� ���� 3������ ���������ٴ� ��.
	//�׷��� �� 3���� �� �ּ��� ������ �ϸ� �ȴٴ� ��
	
	// " 3�������� �ȵȴ� " �� ���ǿ� ����
	// 1) n��°�� �� ���´�. >> dp[i-1] �� ����       - 0�� ����
	// 2) n��°�� ���´�. && n-1��°���� �� ������ �ִ�.  - 1�� ����
	// 3) n��°�� ���´�. && n-1��°���� ������ �ִ�.    - 2�� ����
	
	// �� ��� �� max�� ���� �ȴ�. �̷��� �� ���, 
	// n+1������ �� ������ ��� ���̽����� ����ؼ�, �ּ��� ���� �ϰ� �Ǿ�
	// �Ź� �ּ��� ���� �� �� �ְ� �ȴ�.

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
