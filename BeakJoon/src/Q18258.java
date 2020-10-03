import java.io.*;
import java.util.*;

public class Q18258 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		
		StringTokenizer st;
		
		
		int last = 0;
		
		for(int i = 0; i<num; i++) {
			st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			
			if(input.equals("push")) {
				int number = Integer.parseInt(st.nextToken());
				queue.add(number);
				last = number;
			}else if(input.equals("pop")) {
				if(queue.isEmpty()) {
					bw.append("-1\n");
					
				}else {
					bw.append(queue.poll()+"\n");
				}
			}else if(input.equals("size")) {
				bw.append(queue.size()+"\n");
			}else if(input.equals("empty")) {
				if(queue.isEmpty()) {
					bw.append("1\n");
				}else {
					bw.append("0\n");
				}
			}else if(input.equals("front")) {
				if(queue.isEmpty()) {
					bw.append("-1\n");
				}else {
					bw.append(queue.peek()+"\n");
				}
			}else if(input.equals("back")) {
				if(queue.isEmpty()) {
					bw.append("-1\n");
				}else {
					bw.append(last+"\n");
				}
			}
		}
		
		bw.flush();
		bw.close();
	}
}
