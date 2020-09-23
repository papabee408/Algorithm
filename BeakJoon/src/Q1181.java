import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Q1181 {

	public static void main(String[] args) {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> data = new ArrayList<String>();
		
		try {
			//list data 구축
			 int numberOfStrings = Integer.parseInt(br.readLine());
			 for(int i=0; i<numberOfStrings; i++) {
				 String datum = br.readLine();
				 if(!data.contains(datum)){
					 data.add(datum);					 
				 }
				 
			 }
			 
			 //comparator 구현
			 Comparator<String> comparator = new Comparator<String>() {
				
				@Override
				public int compare(String o1, String o2) {
					
					if(o1.length() == o2.length()) {
						
						int charNum = 0;
						int index = 0;
						
						while(charNum == 0) {
							charNum = (int)((char)(o1.charAt(index))) 
									- (int)((char)(o2.charAt(index)));
							
							index++;								
						}
						return charNum;
					}else {
						return o1.length() - o2.length();
					}
					
				}
			};
			
			// sort 진행
			Collections.sort(data, comparator);
			
			// 결과 print
			for(String datum : data) {
				System.out.println(datum);
			}
			
			
			 
			 
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
