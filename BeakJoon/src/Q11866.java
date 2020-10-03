import java.util.*;

public class Q11866 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		scanner.close();
		
		ArrayList<Integer> circle = new ArrayList<>();
		for(int i = 1; i<=n; i++) {
			circle.add(i);
		}
		
		int addCount = 0;
		int index = 0;
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		while(circle.size() != 0) {
			
			if(index < circle.size() && addCount < k-1) {
				addCount++;
				index++;
			}
			
			if(index == circle.size()) {
				index = 0;
			}
			
			if(addCount == k-1) {
				if(circle.size() > 1) {
					sb.append(circle.get(index) + ", ");
				}else {
					sb.append(circle.get(index));
				}
				
				circle.remove(index);
				addCount = 0;
			}
			
			if(index == circle.size()) {
				index = 0;
			}
		}
		sb.append(">");
		System.out.print(sb);
		
		

	}

}
