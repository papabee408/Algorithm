import java.io.*;
import java.util.*;

public class Q1427 {

	public static void main(String[] args) {	
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter= new BufferedWriter(new OutputStreamWriter(System.out));
		
 		try {
			int data = Integer.parseInt(bufferedReader.readLine());
			
			//data �� �ڸ��� ����
			
			//data�� ���ڸ� �� ���
			if(data < 10) {
				numbers.add(data);
			}
			//data �� �̻��� ���
			while(data >= 10) {
				numbers.add(data%10);
				data /= 10;

				if(data < 10) {
					numbers.add(data);
				}
			}
			
			//data �� �ڸ��� count
			int[] countArray = new int[10]; // ���ڸ������̴ϱ� ������ 0 ~ 9
			for(int i =0; i<numbers.size(); i++) {
				countArray[numbers.get(i)]++;
			}
			
			//data ������� print
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
