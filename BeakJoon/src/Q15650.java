import java.io.*;

public class Q15650 {
	
	static int rangeOfNum, lengthOfSeq;
	static int[] seq;
	static boolean[] nodeVisited;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		
		rangeOfNum = Integer.parseInt(input[0]);
		lengthOfSeq = Integer.parseInt(input[1]);
		
		seq = new int[lengthOfSeq];
		nodeVisited = new boolean[rangeOfNum];
		
		dfs(0);
	}
	
	private static void dfs(int count) {
		
		//È¸±Í½Ã base camp
		if(count == lengthOfSeq) {
			for(int num : seq) {
				System.out.print(num + " ");
			}
			
			System.out.println();
			return;
		}
		
		for(int i = 0; i < rangeOfNum; i++) {
			
			if(nodeVisited[i]) {
				continue;
			}
			
			if(count > 0 && seq[count-1] > i+1) {
				continue;
			}
			

			nodeVisited[i] = true;
			seq[count] = i+1;
			dfs(count + 1);
			nodeVisited[i] = false;
		}
	}
	

}
