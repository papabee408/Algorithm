import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q10828 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		Stack<String> stack = new Stack<String>();
		
		StringTokenizer st; 
		
		for(int i = 0; i<num ; i++) {
			st = new StringTokenizer(br.readLine());
			
			String func = st.nextToken();
			
			if(func.equals("push")) {
				stack.push(st.nextToken());
			}
			
			else if(func.equals("pop")) {
				try {
					System.out.println(stack.pop());	
				}catch(Exception e) {
					System.out.println(-1);
				}
			}
			
			
			else if(func.equals("size")) {				
				System.out.println(stack.size());
			}
			
			
			else if(func.equals("empty")) {
				boolean isEmpty = stack.empty();
				if(isEmpty) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}
			
			
			else if(func.equals("top")) {
				try {
					System.out.println(stack.lastElement());	
				}catch(Exception e) {
					System.out.println(-1);
				}
			}
		}
	}

}
