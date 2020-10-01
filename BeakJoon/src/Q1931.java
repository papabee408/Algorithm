import java.io.*;
import java.util.*;


public class Q1931 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//prepare
		int num = Integer.parseInt(br.readLine());
		int[][] data = new int[num][2];
		StringTokenizer st;
		for(int i = 0; i<num; i++) {
			st = new StringTokenizer(br.readLine());
			data[i][0] = Integer.parseInt(st.nextToken());
			data[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(data, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				
				if(o1[1] - o2[1] == 0) {
					return (o1[0] - o2[0]);
				}else {
					return (o1[1] - o2[1]);		
				}

			}
		});
		
		//count
		
		int count = 0;
		int endHour = 0;
		
		for(int i = 0; i<num; i++) {
			
			if(endHour <= data[i][0]) {
				count++;
				endHour = data[i][1];
			}
		}
		
		for(int i = 0; i<num; i++) {
			
			System.out.println(data[i][0] + " " + data[i][1]);
		}

		System.out.print(count);
	}

}
