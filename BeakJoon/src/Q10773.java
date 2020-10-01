import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q10773 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numOfCases = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		
		int sum = 0;
		
		for(int i = 0; i<numOfCases; i++) {
			
			int input = Integer.parseInt(br.readLine());
			
			if(input == 0) {
				input = stack.pop();
				sum -= input;
			}else {
				stack.push(input);
				sum += input;
			}
		}
		
		System.out.print(sum);
	}

}
