import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q15652 {
	
	private static int numRange, lengthOfSeq;
	private static int[] seq;
	private static BufferedWriter bw;

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		numRange = Integer.parseInt(st.nextToken());
		lengthOfSeq = Integer.parseInt(st.nextToken());
		seq = new int[lengthOfSeq];

		dfs(0);
		
		bw.flush();
	}

	private static void dfs(int count) throws Exception{

		if(count == lengthOfSeq) {
			for(int num : seq) {
				bw.write(num + " ");
			}
			
			bw.write("\n");
			return;
		}
		
		for(int i = count == 0? 1: seq[count-1]; i<= numRange; i++) {
				seq[count] = i;
				dfs(count + 1);						
		}
		
	}
	

}
