import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main { 
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		//이항계수 nCk = n! / (k!(n-k)!)
		System.out.println(factorial(N) / (factorial(N - K) * factorial(K)));
	}
		
	public static int factorial(int X) {
		//만약  N과 K가 같거나, K가 0이면 0! (0팩토리얼) = 1 
		if(X <= 1) {
			return 1;
		} else {
			return X * factorial(X-1);
		}
	}
}