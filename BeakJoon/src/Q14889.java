import java.util.*;
import java.io.*;

public class Q14889 {
	
	static int stoi(String s) { return Integer.parseInt(s); }
	
	static int N;
	static boolean[] team;
	static int[][] data;
    static int minScore = 987654321;
	
	public static void main(String[] args)  throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = stoi(br.readLine());
		team = new boolean[N+1];
		data = new int[N+1][N+1];
		
		for(int i = 1; i<N+1; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j<N+1; j++) {
				data[i][j] = stoi(st.nextToken());
			}
		}

		dfs(1, 0);
		System.out.print(minScore);
	}
	
	private static void dfs(int start, int count) {
		
		if(count == N/2) {
			minScore = Math.min(minScore, getDif());
			return;
		}
		
		for(int i = start; i<N+1; i++) {
			if(team[i] != true) {
				team[i] = true;
				dfs(i+1, count + 1);
				team[i] = false;
			}
			
		}
	}
	
	private static int getDif() {


		// 점수 계산하기
		int falseTeamScore = 0;
		int trueTeamScore = 0;
		
		for(int i=1; i<N+1; i++) {
            for(int j=1; j<N+1; j++) {
                // true 면 스타트팀
                if(team[i] && team[j])
                	trueTeamScore += data[i][j];
 
                // false 면 링크팀
                if(team[i] != true && team[j] != true)
                	falseTeamScore += data[i][j];
            }
        }
		
		//결과넣기
		return Math.abs(falseTeamScore - trueTeamScore);
	}

}
