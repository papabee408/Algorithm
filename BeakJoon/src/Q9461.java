import java.io.*;

public class Q9461 {
	
	static long[] cache;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    int cases = Integer.parseInt(br.readLine());
	    
	    cache = new long[101];
	    cache[1] = 1;
	    cache[2] = 1;
	    cache[3] = 1;
	    cache[4] = 2;
	    cache[5] = 2;
	    
	    for (int i = 6; i<101; i++) {
	    	cache[i] = cache[i-1] + cache[i-5]; 
	    }

	    for (int i = 0; i<cases; i++) {
	    	int num = Integer.parseInt(br.readLine());
	    	bw.append(cache[num]+"\n");
	    }

	    bw.flush();
	    bw.close();
	}



}
