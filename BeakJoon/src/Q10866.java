import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Q10866 {

		static Deque<Integer> deque;
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());

		deque = new LinkedList<>();
		
		for(int i = 0; i<number; i++) {
			checkInput(br.readLine());
		}
		
		
		

	}

	private static String checkInput(String readLine) {
		
		StringTokenizer st = new StringTokenizer(readLine);
		String data = st.nextToken();
		
		if(data.equals("push_back")) {
			deque.add(Integer.parseInt(st.nextToken()));
		}else if(data.equals("push_front")) {
			deque.push(Integer.parseInt(st.nextToken()));
		}else if(data.equals("front")) {
			if(deque.isEmpty()) {
				System.out.println(-1);
			}else {
				System.out.println(deque.peekFirst());
			}
		}else if(data.equals("back")) {
			if(deque.isEmpty()) {
				System.out.println(-1);
			}else {
				System.out.println(deque.peekLast());
			}
		}else if(data.equals("size")) {
			System.out.println(deque.size());
		}else if(data.equals("empty")) {
			if(deque.isEmpty()) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}else if(data.equals("pop_back")) {
			if(deque.isEmpty()) {
				System.out.println(-1);
			}else {
				System.out.println(deque.pollLast());
			}
		}else if(data.equals("pop_front")) {
			if(deque.isEmpty()) {
				System.out.println(-1);
			}else {
				System.out.println(deque.pollFirst());
			}
		}
		
		return "";
		
	}

}
