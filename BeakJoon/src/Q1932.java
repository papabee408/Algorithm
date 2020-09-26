import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1932 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int triangleSize = Integer.parseInt(br.readLine());
		long[][] cases = new long[ triangleSize][];
		
		
		//data setting
		for(int i = 0; i<triangleSize; i++) {
			cases[i] = new long[i+1];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j<=i; j++) {
				long addingNum = Integer.parseInt(st.nextToken());
				cases[i][j] = addingNum;
			}
		}
		
		
		
		for(int i = 1; i<triangleSize; i++) {
			for(int j = 0; j<=i; j++) {
				
				if(j == 0) {
					cases[i][j] += cases[i-1][j]; 
				}
				
				else if(j == i) {
					cases[i][j] += cases[i-1][j-1];
				}
				
				else {
					cases[i][j] += Math.max(cases[i-1][j-1], cases[i-1][j]);
			}
			}
		}
		
		long max = 0;
		for(int i = 0; i<cases.length; i++) {
			if(cases[triangleSize-1][i] > max) {
				max = cases[triangleSize-1][i]; 
			}
		}
		
		System.out.print(max);
		
		
	}

}
