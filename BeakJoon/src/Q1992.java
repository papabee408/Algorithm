import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1992 {

	static int[][] map; 
	static StringBuilder sb;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		map = new int[size][size];
		
		for(int i = 0; i<size; i++) {
			String line = br.readLine();
			for(int j = 0; j<size; j++) {
				map[i][j] = Integer.parseInt(String.valueOf(line.charAt(j)));
			}
		}
		
		sb = new StringBuilder();
		checkMap(0, 0, size);
		
		System.out.print(sb);
	}

	private static void checkMap(int verIndex, int horIndex, int size) {

		
		
		if(isCompressible(verIndex, horIndex, size)) {
			if(map[verIndex][horIndex] == 0) {
				sb.append("0");
			}else {
				sb.append("1");
			}
		}else {
			sb.append("(");
			checkMap(verIndex, horIndex, size/2);
			checkMap(verIndex, horIndex + size/2, size/2);
			checkMap(verIndex + size/2, horIndex, size/2);
			checkMap(verIndex + size/2, horIndex + size/2, size/2);
			sb.append(")");
		}
		
	}

	private static boolean isCompressible(int verIndex, int horIndex, int size) {
		
		int firstData = -1;
		
		for(int i = verIndex; i<verIndex+size; i++) {
			for(int j = horIndex; j<horIndex+size; j++) {
				
				if(i==verIndex && j==horIndex) {
					firstData = map[i][j];
					continue;
				}
				
				if(firstData != map[i][j]) {
					return false;
				}
			}
		}
		
		return true;
	}

}
