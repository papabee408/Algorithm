import java.util.*;

public class Q1021 {

	static Deque<Integer> deque;
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();
		deque = new LinkedList<>();
		for(int i = 1; i<=size; i++) {
			deque.add(i);
		}
		
		int num = scanner.nextInt();
		int count = 0;
		
		for(int i = 1; i<=num; i++) {
			int checkNum = scanner.nextInt();
			
			Deque<Integer> deque_left = new LinkedList<>(deque);
			Deque<Integer> deque_right = new LinkedList<>(deque);
			
			int leftCount = moveLeft(checkNum, deque_left);
			int rightCount = moveRight(checkNum, deque_right);

			if(leftCount < rightCount) {
				count += moveLeft(checkNum, deque);
				
			}else {
				
				count += moveRight(checkNum, deque);
				
			}
		}
		
		System.out.print(count);
		scanner.close();
	}
	
	public static int moveLeft(Integer wantedNum,  Deque<Integer> queue) {
		
		Integer num = -1;
		int count = 0;
		
		while(true) {
			Integer firstNumber = queue.peek();
			num = firstNumber;
			
			if(num.equals(wantedNum)) {
				num = queue.pollFirst();
				return count;
			}else {
				count ++;
				num = queue.pollFirst();
				queue.add(num);
			}
		}
		
		
	}
	
	public static int moveRight(Integer wantedNum, Deque<Integer> queue) {
		
		Integer num = -1;
		int count = 0;

		while(true) {
			Integer firstNumber = queue.peek();
			num = firstNumber;
			
			if(num.equals(wantedNum)) {
				num = queue.pollFirst();
				return count;
			}else {
				count ++;
				num = queue.pollLast();
				queue.push(num);
			}
		}
		
		
	}

}
