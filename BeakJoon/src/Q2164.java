import java.util.*;

public class Q2164 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		//data setting
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 1; i<= num; i++) {
			queue.add(i);
		}
		
		//operation
		while(queue.size() != 1) {
			//�� ���� ������
			queue.poll();
			//�� ���� ī��� �� �Ʒ���
			int number = queue.poll();
			queue.add(number);
		}
		
		//print last card
		System.out.print(queue.peek());
		
		scanner.close();

	}

}
