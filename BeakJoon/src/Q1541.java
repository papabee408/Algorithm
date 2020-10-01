import java.util.Scanner;

public class Q1541 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String data = scanner.next();
		
		
		boolean isMinus = false;
		
		int startIndex = 0;
		
		int minusSum = 0;
		int plusSum = 0;
		
		for(int i = 0; i<data.length(); i++) {
			
			if(data.charAt(0) == '-') {
				isMinus = true;
				startIndex = 1;
				continue;
			}else if(data.charAt(0) == '+') {
				isMinus = false;
				startIndex = 0;
			}
			
			if(data.charAt(i) == '-' || data.charAt(i) =='+' || i == data.length()-1) {
				
				if(isMinus) {
					
					if(i != data.length()-1 ) {
						minusSum += Integer.parseInt(data.substring(startIndex, i));	
					}else {
						minusSum += Integer.parseInt(data.substring(startIndex));
					}
					
				}
				else{
					if(i != data.length()-1 ) {
						plusSum += Integer.parseInt(data.substring(startIndex, i));	
					}else {
						plusSum += Integer.parseInt(data.substring(startIndex));
					}
					
				}
				
				startIndex = i+1;
				if(data.charAt(i) == '-') {
					isMinus = true;
				}else {
					if(isMinus) {
						isMinus = true;
					}else {
						isMinus = false;						
					}
					
				}
			}
		}
		
		System.out.println(plusSum-minusSum);
		
	}
}

