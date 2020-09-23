import java.io.*;

public class Q15649 {
	
	static int rangeOfNumber, sizeOfSeq; 
	static int[] nums;
	static boolean[] nodeVisited; 

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputData = br.readLine().split(" ");
		
		rangeOfNumber = Integer.parseInt(inputData[0]);
		sizeOfSeq = Integer.parseInt(inputData[1]);
		
		nodeVisited = new boolean[rangeOfNumber];
		nums = new int[sizeOfSeq];
		
		dfc(0);

	}
	
	private static void dfc(int count) {
		
		//»∏±Õ¿« base camp
		if(count == sizeOfSeq) {
			for(int num : nums) {
				System.out.print(num + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i<rangeOfNumber; i++) {
			if(nodeVisited[i]) {
				continue;
			}
			nodeVisited[i] = true;
			nums[count] = i+1;
			dfc(count + 1);
			nodeVisited[i] = false;
		}
	}

}
