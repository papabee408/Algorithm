import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Q11651 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		 try {
			
			int numberOfDots = Integer.parseInt(br.readLine());
			List<int[]> data = new ArrayList<int[]>();
			
			//data 넣어두기
			for(int i = 0; i<numberOfDots; i++) {
				String[] intputDot = br.readLine().split(" ");
				int[] intputDotToInt = new int[] {Integer.parseInt(intputDot[0]), Integer.parseInt(intputDot[1])};
				data.add(intputDotToInt);
			};
			
			//comparator 구현하기
			Comparator<int[]> comparator = new Comparator<int[]>() {
				
				@Override
				public int compare(int[] o1, int[] o2) {
					if(o1[1] == o2[1]) {
						return o1[0] - o2[0];	
					}
					else {
						return o1[1] - o2[1];
					}
				}
			};
			
			Collections.sort(data, comparator);
			
			for(int[] dot : data) {
				System.out.println(dot[0] + " " + dot[1]);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		

	}

}