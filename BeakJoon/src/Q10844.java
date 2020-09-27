import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10844 {

	public static void main(String[] args) throws Exception{
		
		int mod = 1000000000;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		long[][] data = new long[num+1][10];
		
		for(int i = 1; i<10; i++) {
			data[1][i] = 1;
		}
		
		for(int i = 2; i<=num; i++) {
			for(int j=0; j<10; j++) {
				if(j == 0) {
					data[i][j] += data[i-1][j+1];  
				}
				
				else if(j == 9) {
					data[i][j] += data[i-1][j-1];
				}
				
				else {
					data[i][j] += data[i-1][j-1] + data[i-1][j+1];
				}
				data[i][j] %= mod;
			}
		}
		
		long sum = 0;
		for (int i = 0; i<10; i++) {
			sum += data[num][i];
		}
		System.out.print(sum%mod);
		

	}

}
