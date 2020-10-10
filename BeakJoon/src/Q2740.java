import java.io.*;
import java.util.StringTokenizer;

public class Q2740 {

	static int[][] firstData;
	static int[][] secondData;
	
	static int first_ver = 0;
	static int first_hor = 0; 
	static int second_ver = 0; 
	static int second_hor = 0; 
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//첫째 행렬 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		first_ver = Integer.parseInt(st.nextToken());
		first_hor = Integer.parseInt(st.nextToken());
		
		firstData = new int[first_ver][first_hor];
		
		for(int i = 0; i<first_ver; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j<first_hor; j++) {
				firstData[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		//둘째 행렬 입력
		st = new StringTokenizer(br.readLine());
		second_ver = Integer.parseInt(st.nextToken());
		second_hor = Integer.parseInt(st.nextToken());
		
		secondData = new int[second_ver][second_hor];
		
		for(int i = 0; i<second_ver; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j<second_hor; j++) {
				secondData[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		//카운트하기
		for(int i = 0; i<first_ver; i++) {
			for (int j = 0; j<second_hor; j++) {
				System.out.print(count(i, j) + " ");
			}
			System.out.println();
		}

	}

	private static int count(int _i, int _j) {
		
		int sum = 0;
		
		for(int i = 0; i<first_hor; i++) {
			sum += firstData[_i][i] * secondData[i][_j];
		}
		
		return sum;
	}

}
