import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Q2580 {
	
	static int[][] sudoku;
	static List<int[]> emptySpots;
	static boolean isFirstFind = false;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sudoku = new int[10][];
		emptySpots = new ArrayList<>();
		
		//get sudoku & empty spots
		for(int i = 1 ; i <= 9; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			sudoku[i] = new int[10];
			
			for(int j = 1; j<= 9; j ++) {
				int number = Integer.parseInt(st.nextToken());
				sudoku[i][j] = number;
				
				if(number == 0) {
					emptySpots.add(new int[] {i,j});
				}
			}
		}
		
		//start dfs
		dfs(0);
	}
	
	private static void dfs(int index) {
		
		if(index == emptySpots.size()) {
			
			if(!isFirstFind) {
				isFirstFind = true;								
			}else {
				return;
			}
			StringBuilder sb = new StringBuilder();
			
			for(int i = 1 ; i <= 9; i++) {
				for(int j = 1; j<= 9; j ++) {
					sb.append(sudoku[i][j]);
					if(j != 9) {
						sb.append(" ");
					}
				}
				if(i != 9) {
					sb.append("\n");					
				}
			}
			
			System.out.print(sb.toString().trim());
			return;
		}
		
		
		
		for(int i = 1; i<= 9; i++) {
			sudoku[emptySpots.get(index)[0]][emptySpots.get(index)[1]] = i;
			if(isPossible(emptySpots.get(index)[0], emptySpots.get(index)[1], i)) {
				dfs(index+1);
			}
			sudoku[emptySpots.get(index)[0]][emptySpots.get(index)[1]] = 0;
		}
		
		
	}
	
	private static boolean isPossible(int row, int column, int candidateValue) {

		for(int k = 1; k<=9; k++) {
			//가로 줄 체크하기
			if(sudoku[row][k] == candidateValue && k != column) {
				return false;
			}
			
			//세로줄 체크하기
			if(sudoku[k][column] == candidateValue && k != row) {
				return false;
			}
		}
		
		//주변 9칸 체크하기
		int rowPlace = (row-1) / 3;
		int columnPlace = (column-1) / 3;
		
		for(int l = rowPlace*3+1; l <= rowPlace*3+3; l++) {
			for(int m = columnPlace*3+1; m<=columnPlace*3+3; m++) {
				if(sudoku[l][m] == candidateValue && l != row && m !=column) {
					return false;
				}
			}
		}
		
		return true;
	}

}
