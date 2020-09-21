import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q2751{

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int length = Integer.parseInt(br.readLine());
			List<Integer> data = new ArrayList<Integer>();
			
			for(int i =0; i<length; i++) {
				data.add(Integer.parseInt(br.readLine()));
			}
			
			Collections.sort(data);
			
			for(int i =0; i<length; i++) {
				bw.write(data.get(i) + "\n");
			}
			
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
