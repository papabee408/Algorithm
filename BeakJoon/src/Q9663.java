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
			
			List<Integer> chessboard = new ArrayList<>(); // �� index�� �ڸ��� row�� �ǹ�, ���� column�� ��ġ
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
			
			//�������� ���� ���ο� �����ϴ�?
			if(board.get(i) == board.get(currentRow)) {
				return false;
			}
			
			//�밢������ ���� ���ο� �����ϴ�?
			if(Math.abs(i-currentRow) == (Math.abs(board.get(i) - board.get(currentRow)))){
				return false;
			}
			
			//���δ� Ȯ���� �ʿ䰡 ����
		}
		return true;
	}
		
}


