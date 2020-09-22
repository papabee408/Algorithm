import java.io.*;
import java.util.*;

public class Q1427 {

	public static void main(String[] args) {	
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter= new BufferedWriter(new OutputStreamWriter(System.out));
		
 		try {
			int data = Integer.parseInt(bufferedReader.readLine());
			
			//data 각 자리수 추출
			
			//data가 한자리 수 경우
			if(data < 10) {
				numbers.add(data);
			}
			//data 그 이상일 경우
			while(data >= 10) {
				numbers.add(data%10);
				data /= 10;

				if(data < 10) {
					numbers.add(data);
				}
			}
			
			//data 각 자리수 count
			int[] countArray = new int[10]; // 한자리수들이니까 범위가 0 ~ 9
			for(int i =0; i<numbers.size(); i++) {
				countArray[numbers.get(i)]++;
			}
			
			//data 순서대로 print
			for(int i = 9; i >= 0; i--) {
				for(int k = 0; k<countArray[i]; k++) {
					bufferedWriter.write(Integer.toString(i));
				}
			}
			
			bufferedWriter.flush();
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
 		
 		
	}

}
