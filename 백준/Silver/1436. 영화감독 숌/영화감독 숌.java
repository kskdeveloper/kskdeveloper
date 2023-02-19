import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[]args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());

		int num = 666; //기준 숫자
		int count = 1; //1 = 666 2 = 1666 이런식
		
		//N과 count값이 같을 때까지 
		while(count != N) {
			num++;
			
			//int num을 String으로 변환, "666"문자열 포함 되어 있다면
			if(String.valueOf(num).contains("666")) {
				count++;
			}
		}
		System.out.println(num);
	}
}