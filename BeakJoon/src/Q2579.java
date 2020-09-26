import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2579 {
	
	
	//dp의 본질은 기존의 결과값을 저장하여 계산의 중복을 줄이는 것.
	//보통 이런 유형들의 문제는  이전 최고값(최솟값) + @ 인 경우가 많고,
	//이전의 max 값은 dp를 활용하여 재활용하면 되는 부분이다.
	//여기서 핵심은 조건들을 얼마나 잘 처리했는가이기도 한데,
	
	// *스포일러*
	/*  일반적으로 n단계의 최고값을 도달하는 방법 2가지
	 *  1) n-1계단의 max + n계단의 값
	 *  2) n-2계단의 max + n계단의 값 
	 *  
	 *  그런데 여기서 문제가 있는게, 1) n-1계단의 max + n계단의 값 부분이다.
	 *  n-1계단의 max가 n-2계단 값을 찍고 왔다면, 연속 3개 계단이되므로 안 된다.
	 *	따라서 그 경우의 수를 배제한다.
	 *
	 *  그러면, n-1계단의 max는 n-2에서 온경우와 n-3에서 온경우로 나누어지게 되는데
	 *  n-2가 되면 연속 3개의 값이 되므로 패스 따라서 결과적으로
	 *  
	 *  n단계의 최고값을 도달하는 방법 2가지는 결국
	 *  n-1계단의 max + n계단의 값 or n-3계단의 max + n-1계단의 값 + n계단의 값중 하나를 고르면 된다.
	 *  
	 *  물론 이 조건은 4번째 계단부터 해당한다.
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
