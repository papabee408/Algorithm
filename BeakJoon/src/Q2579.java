import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2579 {
	
	
	//dp�� ������ ������ ������� �����Ͽ� ����� �ߺ��� ���̴� ��.
	//���� �̷� �������� ������  ���� �ְ�(�ּڰ�) + @ �� ��찡 ����,
	//������ max ���� dp�� Ȱ���Ͽ� ��Ȱ���ϸ� �Ǵ� �κ��̴�.
	//���⼭ �ٽ��� ���ǵ��� �󸶳� �� ó���ߴ°��̱⵵ �ѵ�,
	
	// *�����Ϸ�*
	/*  �Ϲ������� n�ܰ��� �ְ��� �����ϴ� ��� 2����
	 *  1) n-1����� max + n����� ��
	 *  2) n-2����� max + n����� �� 
	 *  
	 *  �׷��� ���⼭ ������ �ִ°�, 1) n-1����� max + n����� �� �κ��̴�.
	 *  n-1����� max�� n-2��� ���� ��� �Դٸ�, ���� 3�� ����̵ǹǷ� �� �ȴ�.
	 *	���� �� ����� ���� �����Ѵ�.
	 *
	 *  �׷���, n-1����� max�� n-2���� �°��� n-3���� �°��� ���������� �Ǵµ�
	 *  n-2�� �Ǹ� ���� 3���� ���� �ǹǷ� �н� ���� ���������
	 *  
	 *  n�ܰ��� �ְ��� �����ϴ� ��� 2������ �ᱹ
	 *  n-1����� max + n����� �� or n-3����� max + n-1����� �� + n����� ���� �ϳ��� ���� �ȴ�.
	 *  
	 *  ���� �� ������ 4��° ��ܺ��� �ش��Ѵ�.
	 * 
	 */
	
	
	static int[] stairPoints;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numOfStairs = Integer.parseInt(br.readLine());
		
		stairPoints = new int[numOfStairs];
		int[] cache = new int[numOfStairs];
		
		//points input
		for(int i = 0; i<numOfStairs; i++) {
			stairPoints[i] = Integer.parseInt(br.readLine());
		}
		
		if(numOfStairs == 1) {
			System.out.print(stairPoints[0]);
			return;
		}
		
		if(numOfStairs == 2) {
			System.out.print(stairPoints[0] + stairPoints[1]);
			return;
		}
		
		cache[0] = stairPoints[0];
		cache[1] = stairPoints[0] + stairPoints[1];
		cache[2] = Math.max(stairPoints[0] + stairPoints[2] , stairPoints[1] + stairPoints[2]);
		
		
		if(numOfStairs >= 4) {
			for(int i = 3 ; i<numOfStairs; i++) {
				cache[i] = Math.max(cache[i-3] + stairPoints[i-1] + stairPoints[i], cache[i-2] + stairPoints[i]);
			}	
		}
	

		//print result
		System.out.print(cache[numOfStairs-1]);
		
		
	}
	
	

}
