import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2630 {
	
	static int[][] data;
	static int white = 0;
	static int blue = 0;

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int size = Integer.parseInt(br.readLine());
		data = new int[size][size];
		
		for(int i = 0; i<size; i++) {
			String[] line = br.readLine().split(" ");
			for(int j = 0; j<size; j++) {
				data[i][j] = Integer.parseInt(line[j]); 
			}
		}
		
		checkData(0, 0, size);

		System.out.println(white);
		System.out.print(blue);
	}

	private static void checkData(int horStartIndex, int verStartIndex, int size) {
		
		if(checkIsAllSame(horStartIndex, verStartIndex, size)) {
			if(data[horStartIndex][verStartIndex] == 0) {
				white++;
				
			}else {
				blue++;
				
			}
			
			return;
		}
			checkData(horStartIndex, verStartIndex, size/2);
			checkData(horStartIndex, verStartIndex + size/2, size/2);
			checkData(horStartIndex + size/2, verStartIndex, size/2);
			checkData(horStartIndex + size/2, verStartIndex + size/2, size/2);
	}
	
	private static boolean checkIsAllSame(int verStartIndex, int horStartIndex, int size) {
		
		int firstData = 0;
		
		for(int i = verStartIndex; i<verStartIndex + size; i++) {
			for(int j = horStartIndex; j<horStartIndex + size; j++) {
			
				if(i == verStartIndex && j == horStartIndex) {
					firstData = data[i][j];
				}

				if(firstData != data[i][j]) {
					return false;
				}
			}
		}
		
		return true;
	}

}
