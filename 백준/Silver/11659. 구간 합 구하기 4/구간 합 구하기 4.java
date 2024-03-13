import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(re.readLine());
		
		int suNo = Integer.parseInt(stringTokenizer.nextToken());
		int quizNo = Integer.parseInt(stringTokenizer.nextToken());
		
		long[] s = new long[suNo + 1];
		stringTokenizer = new StringTokenizer(re.readLine());
		
		for (int i = 1; i <= suNo; i++) {
			s[i] = s[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
		}
		
		for (int k = 0; k < quizNo; k++) {
			stringTokenizer = new StringTokenizer(re.readLine());
			int i = Integer.parseInt(stringTokenizer.nextToken());
			int j = Integer.parseInt(stringTokenizer.nextToken());
			
			System.out.println(s[j] - s[i-1]);
		}
		
	}

}