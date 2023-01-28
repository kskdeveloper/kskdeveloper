
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main { 
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());//낮
		int B = Integer.parseInt(st.nextToken());//밤
		int V = Integer.parseInt(st.nextToken());//높이
		
		//1일차 낮 = A
		//1일차 밤 = A - B
		//2일차 낮 = A - B + A
		//2일차 밤 = A - B + A - B
		//3일차 낮 = A - B + A - B + A
		//3일차 밤 = A - B + A - B + A - B
		//4일차 낮 = A - B + A - B + A - B + A
		//4일차 밤 = A - B + A - B + A - B + A - B
		
		//여기서 낮만 도출해보겠습니다.
		//1일차 낮 = A
		//2일차 낮 = A - B + A
		//3일차 낮 = A - B + A - B + A
		//4일차 낮 = A - B + A - B + A - B + A
		//X일차 낮 = (A - B) * (X - 1) + A  -> V = AX - A - BX + B + A
		//V = X * (A-B) + B
		//V - B = X * (A-B)
		//X = (V - B) / (A - B)
		
        //ceil 올림 함수 사용하기
		int day = (int) Math.ceil((double)(V-B)/(A-B));
	
		System.out.println(day);
	}
}