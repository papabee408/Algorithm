
import java.util.*;

public class Q1874 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int number = 0;
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i< num; i++) {
			int input = scanner.nextInt();
			boolean done = false;
			while(!done) {
				
				if(stack.lastElement() < input) {
					sb.append("+\n");
					number ++;
					stack.push(number);
				}
				
				if(!stack.isEmpty() && stack.lastElement() == input){
					sb.append("-\n");
					stack.pop();
					done = true;
				}
				
				if(!stack.isEmpty() && stack.lastElement() > input){
					System.out.print("NO");
					return;
				}
			}
		}
		
		System.out.print(sb.toString().trim());
		
	}

}
