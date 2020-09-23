import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Q10814 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String[]> list = new ArrayList<String[]>();
		
		try {
			int numOfMembers = Integer.parseInt(br.readLine());
			
			//data ����
			for(int i = 0; i<numOfMembers; i++) {
				String[] memberData = br.readLine().split(" ");
				list.add(memberData);
			}
			
			//comparator ����
			Comparator<String[]> comparator = new Comparator<String[]>() {
				
				@Override
				public int compare(String[] o1, String[] o2) {
					
					int o1Age = Integer.parseInt(o1[0]);
					int o2Age = Integer.parseInt(o2[0]);
					
					// ���� java api���� �����ϸ� �׳� ���α� ������ 
					// ������ ������ data �Է½ÿ� ������.
					
					return o1Age - o2Age; 
					
				
				}
			};
			
			//sort ����
			Collections.sort(list, comparator);
			
			//��� print
			for(String[] data : list) {
				System.out.println(data[0] + " " + data[1]);
			}
			
			
		} catch (Exception e) {

			e.printStackTrace();
		}


	}

}
