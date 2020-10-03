import java.io.*;
import java.util.*;

public class Q1966 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		if(num == 0) {
			System.out.println(0);
			return;
		}
		
		for(int i = 0; i<num; i++) {
		
			String[] caseData = br.readLine().split(" ");
			int caseLength =  Integer.parseInt(caseData[0]);
			int caseIndex = Integer.parseInt(caseData[1]);
			
			Queue<Integer[]> queue = new LinkedList<>();
			int[] priorities = new int[caseLength];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j<caseLength; j++) {
				int number = Integer.parseInt(st.nextToken());
				Integer[] data = new Integer[2];
				data[0] = number;
				if(j == caseIndex) {
					data[1] = 1; 
				}else {
					data[1] = 0;
				}
				queue.add(data);
				priorities[j] = number;
			}
			
			Arrays.sort(priorities);
			
			checkCount(queue, priorities);
			
			
		}

	}

	private static void checkCount(Queue<Integer[]> queue, int[] priorities) {
		
		int count = 0;
		
		while(true) {
			
			if(isFirst(queue.peek()[0] , priorities, count)) {
				
				count++;
				
				if(queue.peek()[1] == 1) {
					System.out.println(count);
					return;
				}else {
					queue.poll();
				}
				

			}else {
				
				Integer[] data = queue.poll();
				queue.add(data);
				
			}
		}
		
	}

	private static boolean isFirst(int num, int[] priorities, int count) {
		
		for(int i = 0; i<priorities.length-count; i++) {
			if(num < priorities[i]) {
				return false;
			}
		}
		return true;
	}
	
}
