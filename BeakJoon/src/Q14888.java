import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Q14888 {
	
	static int numOfNums;
	static int[] numbers;
	static int[] numOfOperators;
	static int[][] checker;
	static List<Integer> values;
	

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		numOfNums = Integer.parseInt(br.readLine());
		
		//자료구조 초기화
		numbers = new int[numOfNums];
		numOfOperators = new int[4];
		checker = new int[numOfNums-1][4];
		values = new ArrayList<>();
		
		//데이터 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i<numOfNums; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<4; i++) {
			numOfOperators[i] = Integer.parseInt(st.nextToken());
		}
		
		int totalValue = numbers[0];
	
		dfs(0, totalValue);
		
		
		int min = values.get(0);
		int max = values.get(0);
		for(int i = 0; i<values.size(); i++) {
					
			if(values.get(i) > max) {
				max = values.get(i);
			}
			
			if(values.get(i) < min) {
				min = values.get(i);
			}
		}
		
		System.out.println(max);
		System.out.print(min);
	}
	
	private static void dfs(int index, int totalValue) {
		
		if(index == numOfNums-1) {
			values.add(totalValue);
			return;
		}
		
		//각 자리에 operator 넣어보기
		for(int i = 0; i<4; i++) {
			if(numOfOperators[i] > 0 && checker[index][i] == 0) {
				checker[index][i] = 1;
				numOfOperators[i]--;
				
				int newTotalValue = countValue(totalValue, i, index);
				dfs(index + 1, newTotalValue );
				
				checker[index][i] = 0;
				numOfOperators[i]++;
			}
		}
	}

	private static int countValue(int value, int operator, int index) {

		switch (operator) {
			case 0: {
				value += numbers[index+1];
				break;
			}
			case 1: {
				value -= numbers[index+1];
				break;
			}
			case 2: {
				value *= numbers[index+1];
				break;
			}
			case 3: {
				if(value < 0) {
					value = -((-value)/numbers[index+1]);
				}else {
					value /= numbers[index+1];					
				}
				
				break;
			}
		
		}
		return value;
	}

}
