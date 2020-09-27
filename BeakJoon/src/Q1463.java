import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1463 {

	static int[] cache;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		cache = new int[num+1];
		


		
		System.out.print(getCount(num));
		

	}
	
	
	private static int getCount(int num) {
				
		if(num == 1) {
			return 0;
		}
		
		if(cache[num] > 0) {
			return cache[num];
		}
		
		cache[num]=getCount(num-1) + 1;
			
		if(num % 3 == 0) {
			cache[num] = Math.min(getCount(num/3) + 1, cache[num]);
			}
			
		else if (num % 2 == 0) {
			cache[num] = Math.min(getCount(num/2) + 1, cache[num]);
			}
			
		else {
			cache[num] = getCount(num-1) + 1;
			}
					
		return cache[num];
	
	}

}
