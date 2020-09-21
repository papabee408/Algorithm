import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10989 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] data = new int[10001];
		
		int number;
		try {
			number = Integer.parseInt(br.readLine());
			for(int i = 0; i<number; i++) {
				data[Integer.parseInt(br.readLine())]++;
			}
			
			for(int i = 0; i<10000; i++) {
				while(data[i] != 0) {
					bw.write(i + "\n");
					data[i]--;
				}
			}
			
			bw.flush();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
