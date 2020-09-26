import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1149 {
	
	static int cases;
	static BufferedReader br;
	static int[][] priceData;

	public static void main(String[] args) throws Exception{
		br = new BufferedReader(new InputStreamReader(System.in));
		cases = Integer.parseInt(br.readLine());
		
		priceData = new int[cases][4];
		
		//data 다 받아놓기
		for(int i = 0; i<cases; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			priceData[i][1] = Integer.parseInt(st.nextToken());
			priceData[i][2] = Integer.parseInt(st.nextToken());
			priceData[i][3] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 1; i<cases; i++) {
			priceData[i][1] += Math.min(priceData[i-1][2], priceData[i-1][3]);
			priceData[i][2] += Math.min(priceData[i-1][1], priceData[i-1][3]);
			priceData[i][3] += Math.min(priceData[i-1][1], priceData[i-1][2]);
		}
		
		System.out.print(Math.min(priceData[cases-1][1], Math.min(priceData[cases-1][2], priceData[cases-1][3])));
	}
	
}
