import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1780 {
	
	static int[][] map;
	static int minus_one = 0;
	static int zero = 0;
	static int plus_one = 0;

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		map = new int[size][size];
		
		for(int i = 0; i<size; i++) {
			String[] line = br.readLine().split(" ");
			for(int j = 0; j<size; j++) {
				map[i][j] = Integer.parseInt(line[j]);
			}
		}
		
		checkMap(0,0, size);
		
		System.out.println(minus_one);
		System.out.println(zero);
		System.out.print(plus_one);
	}

	private static void checkMap(int verIndex, int horIndex, int size) {
		
		if(isSameValue(verIndex, horIndex, size)) {
			
			if(map[verIndex][horIndex] == -1) {
				minus_one++;
			}else if(map[verIndex][horIndex] == 0) {
				zero++;
			}else if(map[verIndex][horIndex] == 1) {
				plus_one++;
			}
			
		}else {
			checkMap(verIndex, horIndex, size/3);
			checkMap(verIndex + size/3, horIndex, size/3);
			checkMap(verIndex + size * 2/3, horIndex, size/3);
			
			checkMap(verIndex, horIndex + size/3, size/3);
			checkMap(verIndex + size/3, horIndex + size/3, size/3);
			checkMap(verIndex + size * 2/3, horIndex + size/3, size/3);
			
			checkMap(verIndex, horIndex + size* 2/3, size/3);
			checkMap(verIndex + size/3, horIndex + size* 2/3, size/3);
			checkMap(verIndex + size * 2/3, horIndex + size * 2/3, size/3);
		}
		
	}

	private static boolean isSameValue(int verIndex, int horIndex, int size) {

		int firstValue = 0;
		
		for(int i = verIndex; i<verIndex+size; i++) {
			for(int j = horIndex; j<horIndex+size; j++) {
				
				if(i == verIndex && j == horIndex) {
					firstValue = map[i][j];
				}
				
				if(firstValue != map[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

}
