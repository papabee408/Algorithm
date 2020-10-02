import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q9012 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i<num; i++) {
			String data = br.readLine();
			boolean resultShown = false;
			
			for(int j = 0; j<data.length(); j++) {
				
				if(data.charAt(j) == '(') {
					stack.push(0);
				}else {
					if(!stack.isEmpty()) {
						stack.pop();
					}else {
						System.out.println("NO");
						stack.clear();
						resultShown = true;
						break;
					}
				}
			}
			
			if(stack.isEmpty() && !resultShown) {
				System.out.println("YES");
			}
			
			else if(!stack.isEmpty() && !resultShown) {
				System.out.println("NO");
			}
			
			stack.clear();
		}
	}

}
