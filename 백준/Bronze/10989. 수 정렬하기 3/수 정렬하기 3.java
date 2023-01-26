import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main { 
	public static void main(String args[]) throws IOException{ 
		//스캐너를 사용했더니 시간이 초과되어 성능이 좋은 것으로 변경함
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//선언
		StringBuilder sb = new StringBuilder();
		
        //readLine() 리턴값이 string이기에 형변환
		//readLine() 사용 시 예외처리 꼭 해주어야 한다! throws IOException
		int N = Integer.parseInt(br.readLine());
		
		int num [] = new int[N];
		
		for(int i=0; i<num.length; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		//오름차순 정렬
		Arrays.sort(num);
		
		for(int i = 0; i<num.length;i++) {
			//문자열의 추가, 수정, 삭제가 빈번하게 발생할 때 사용(속도 빠름)
			sb.append(num[i]).append('\n');
		}
		System.out.println(sb);
	}
}