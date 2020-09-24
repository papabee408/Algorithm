import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Q14889 {
	
	static int stoi(String s) { return Integer.parseInt(s); }
	
	static int N;
	static boolean[] team;
	static int[][] data;
	static int minScore = 999999;
	
	public static void main(String[] args)  throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = stoi(br.readLine());
		
		//�ʱ�ȭ
		team = new boolean[N];
		data = new int[N][N];
		
		//������ ����
		
		for(int i = 0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j<N; j++) {
				data[i][j] = stoi(st.nextToken());
			}
		}

		//�� ������ �� ���� ����
		dfs(0, 0);
		
		//
		System.out.print(minScore);
	}
	
	private static void dfs(int start, int count) {
		
		if(count == N/2) {
			minScore = Math.min(minScore, getDif());
			return;
		}
		
		for(int i = start; i<N; i++) {
			if(team[i] == false) {
				team[i] = true;
				dfs(start+1, count + 1);
			}
			team[i] = false;
		}
	}
	
	private static int getDif() {


		// ���� ����ϱ�
		int falseTeamScore = 0;
		int trueTeamScore = 0;
		
		for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                // true �� ��ŸƮ��
                if(team[i] && team[j])
                	trueTeamScore += data[i][j];
 
                // false �� ��ũ��
                if(team[i] != true && team[j] != true)
                	falseTeamScore += data[i][j];
            }
        }
		
		//����ֱ�
		return Math.abs(falseTeamScore - trueTeamScore);
	}

}
