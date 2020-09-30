import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q9251 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String firstWord = br.readLine();
		String secondWord = br.readLine();
		
		
		//set dataTable
		int[][] table = new int[firstWord.length()+1][secondWord.length()+1];
		int max = 0;
			
		for (int i = 1; i<firstWord.length()+1; i ++) {
			for (int j = 1; j<secondWord.length()+1; j ++) {
				
				if(firstWord.charAt(i-1) == secondWord.charAt(j-1)) {
					table[i][j] = table[i-1][j-1]+1;
					if(max < table[i][j]) {
						max = table[i][j];
					}
				}
				else {
					table[i][j] = Math.max(table[i-1][j], table[i][j-1]);
				}
				
				
			}
			
		}
		
		System.out.println(max);

	}

}
