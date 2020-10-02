import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Q4949 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		Stack<Character> stack = new Stack<>();
		
		while(!input.equals(".")) {
			
			boolean isResultShown = false;
			
			for(int i = 0; i<input.length(); i++) {
				if(input.charAt(i) == '(') {
					stack.push('(');
				}else if (input.charAt(i) == '[') {
					stack.push('[');
				}else if (input.charAt(i) == ')') {
					
					char popedItem;
					
					if(stack.isEmpty()) {
						popedItem = ' ';
					}else {
						popedItem = stack.pop();
					}
					
					if(popedItem != '(') {
						System.out.println("no");
						stack.clear();
						isResultShown = true;
						break;
					}
				}else if (input.charAt(i) == ']') {
					
					char popedItem;
					
					if(stack.isEmpty()) {
						popedItem = ' ';
					}else {
						popedItem = stack.pop();
					}
					
					if(popedItem != '[') {
						System.out.println("no");
						stack.clear();
						isResultShown = true;
						break;
					}
				}
			}
			
			if(!isResultShown && stack.isEmpty()) {
				System.out.println("yes");
			}else if (!isResultShown && !stack.isEmpty()) {
				System.out.println("no");
			}
			stack.clear();
			input = br.readLine();
		}
		

	}

}
