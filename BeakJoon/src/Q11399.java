import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11399 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numOfLine = Integer.parseInt(br.readLine());
		int[] timeData = new int[numOfLine];
		int sum = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i<numOfLine; i++) {
			timeData[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(timeData);
		
		for(int i = 0; i<numOfLine; i++) {
			sum += timeData[i] * (numOfLine - i);
		}
		
		System.out.print(sum);
	}

}
