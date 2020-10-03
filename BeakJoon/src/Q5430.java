import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Q5430 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<num; i++) {
			
			String func = br.readLine();
			int dataSize = Integer.parseInt(br.readLine());
			String rawData = br.readLine();
			String[] data = new String[dataSize];
			Deque<String> deque = new LinkedList<String>();
			boolean isReverse = false;
			boolean isError = false;
			
			if(rawData.length() > 2) {
				data = rawData.substring(1, rawData.length()-1).split(",");
			}else {
				//empty¿”
			}
			
			for(int j = 0; j<dataSize; j++) {
				deque.add(data[j]);
			}
			
			for(int j = 0; j<func.length(); j++) {
				if(func.charAt(j) == 'R') {
					isReverse = !isReverse;
				}else if(func.charAt(j) == 'D') {
					if(isReverse && !deque.isEmpty()) {
						deque.pollLast();
					}else if(!isReverse && !deque.isEmpty()){
						deque.pollFirst();
					}else if(deque.isEmpty()) {
						System.out.println("error");
						isError = true;
						break;
					}
				}
			}
			
			if(isError) {
				continue;
			}
			
			StringBuilder sb = new StringBuilder();
			sb.append("[");
			
			
			int size = deque.size();
			
			if(isReverse) {
				for(int k = 0; k<size; k++) {
					
					if(deque.size() > 1) {
						sb.append(deque.pollLast()+",");
					}else {
						sb.append(deque.pollLast());
					}
					
				}
			}else {
				for(int k = 0; k<size; k++) {
					
					if(deque.size() > 1) {
						sb.append(deque.pollFirst()+",");
					}else {
						sb.append(deque.pollFirst());
					}
			
				}
			}
			
			sb.append("]");
			System.out.println(sb);
			
			
			

		}

	}

}
