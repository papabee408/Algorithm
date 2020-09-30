import java.util.*;

public class Q2565 {
	static int n;
	
	static int dp[], cost[][];
	
	
	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		
		n=sc.nextInt();
		dp = new int[n+1];
		cost = new int[n+1][2]; // A, B ������ �迭
		
		
		for(int i=1;i<=n;i++) {
			for(int j=0;j<2;j++) {
				cost[i][j] = sc.nextInt();
			}
		}
		
		Arrays.sort(cost,new Comparator<int[]>() { //A�� �������� �������� ����

			@Override
			public int compare(int[] a, int[] b) {
				if(a[0]<b[0]) return -1;
				else if(a[0]>b[0]) return 1;
				return 0;
			}
			
		});
		
		dp[1] = 1;
		
		for(int i=2;i<=n;i++) { // LIS�� ���ϴ� ����
			dp[i] =1;
			for(int j=1;j<i;j++) {
				if(cost[i][1]>cost[j][1]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
			}
		}
		int max =Integer.MIN_VALUE; // �ִ��� ��ġ�� �� �ִ� �������� �ִ� ����
		for(int j=1;j<=n;j++) {
			if(dp[j]>max)
				max = dp[j];
		}
		
		System.out.println(n-max); // �ִ� ������ŭ ��ġ�ϸ� ���ÿ� �ּ� ������ �ڸ��� ���̹Ƿ� N-MAX�� ����
		
		
	}
	
}
	
	
	
	
	
	
	

//	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int numOfLines = Integer.parseInt(br.readLine());
//		List<int[]> lineData = new ArrayList<>();
//		
//		//get line data
//		for (int i = 0; i<numOfLines; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			int[] line = new int[3];
//			line[0] = Integer.parseInt(st.nextToken());
//			line[1] = Integer.parseInt(st.nextToken());
//			
//			lineData.add(line);
//		}
//		
//		//count num
//		int count = 0;
//		while(getTotalConnection(lineData) != 0) {
//			removeLine(lineData);
//			count++;
//		}
//		
//		System.out.print(count);					
//	}
//	
//	private static int getTotalConnection(List<int[]> data) {
//		
//		int total = 0;
//		for(int i = 0; i<data.size(); i++) {
//			for(int j = i; j<data.size(); j++) {
//				if((data.get(i)[0] > data.get(j)[0] && data.get(i)[1] < data.get(j)[1] ||
//						(data.get(i)[0] < data.get(j)[0] && data.get(i)[1] > data.get(j)[1]))) {
//					data.get(i)[2]++;
//					total++;
//				}
//			}
//		}
//		return total;
//	}
//	
//	private static void removeLine(List<int[]> data) {
//		
//		int maxIndex = -1;
//		int max = 0;
//		for(int i = 0; i<data.size(); i++) {
//			if(max < data.get(i)[2]) {
//				max = data.get(i)[2];
//				maxIndex = i;
//			}
//		}
//		
//		data.remove(maxIndex);
//	}


