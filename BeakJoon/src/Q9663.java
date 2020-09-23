import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Q9663 {
	
	
	static int count = 0;
	static int chessboardSize;

	public static void main(String[] args) throws Exception{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		chessboardSize = Integer.parseInt(bufferedReader.readLine());
		
		
		for (int i=1; i<=chessboardSize; i++) {
			
			List<Integer> chessboard = new ArrayList<>(); // 한 index별 자리는 row를 의미, 값은 column의 위치
			chessboard.add(0);
			chessboard.add(i);
			
			dfs(chessboardSize, 2, chessboard);
		}
		
		System.out.print(count);
		
		
		
	}

	private static void dfs(int boardSize, int currentRow, List<Integer> board) {
		
		if(boardSize == currentRow-1) {
			count++;
			return;
		}
		
		for(int col=1; col<=chessboardSize; col++) {
				board.add(col);
				if(isPossible(board, currentRow)) {
					dfs(boardSize, currentRow+1, board);
				}
				board.remove(currentRow);
			}
	}
	
	private static boolean isPossible(List<Integer> board, int currentRow) {
		for(int i = 1; i< currentRow; i++) {
			
			//수직으로 같은 라인에 존재하니?
			if(board.get(i) == board.get(currentRow)) {
				return false;
			}
			
			//대각선으로 같은 라인에 존재하니?
			if(Math.abs(i-currentRow) == (Math.abs(board.get(i) - board.get(currentRow)))){
				return false;
			}
			
			//가로는 확인할 필요가 없음
		}
		return true;
	}
		
}


