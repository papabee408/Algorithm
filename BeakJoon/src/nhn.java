import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class nhn {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] data = new int[n][n];
		
		
		for(int i = 0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j<n; j++) {
				data[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		

	}

}
