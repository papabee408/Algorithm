import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Q10814 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String[]> list = new ArrayList<String[]>();
		
		try {
			int numOfMembers = Integer.parseInt(br.readLine());
			
			//data 구축
			for(int i = 0; i<numOfMembers; i++) {
				String[] memberData = br.readLine().split(" ");
				list.add(memberData);
			}
			
			//comparator 구현
			Comparator<String[]> comparator = new Comparator<String[]>() {
				
				@Override
				public int compare(String[] o1, String[] o2) {
					
					int o1Age = Integer.parseInt(o1[0]);
					int o2Age = Integer.parseInt(o2[0]);
					
					// 본래 java api에서 동일하면 그냥 냅두기 때문에 
					// 들어오는 순서를 data 입력시에 끝난다.
					
					return o1Age - o2Age; 
					
				
				}
			};
			
			//sort 실행
			Collections.sort(list, comparator);
			
			//결과 print
			for(String[] data : list) {
				System.out.println(data[0] + " " + data[1]);
			}
			
			
		} catch (Exception e) {

			e.printStackTrace();
		}


	}

}
