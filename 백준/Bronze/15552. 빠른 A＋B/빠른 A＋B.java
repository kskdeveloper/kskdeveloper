import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main { 
	public static void main(String args[]) throws IOException{ 
		//선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//테스트 케이스
		int N = Integer.parseInt(br.readLine());
		
		//BufferedReader 데이터는 Line 단위로 나뉜다 
		//공백 단위로 데이터를 가공하고자 할 때 StringTokenizer 사용
		//nextToken() 함수를 쓰면 readLine()을 통해 입력 받은 값을 
		//공백 단위로 구분하여 순서대로 호출할 수 있다.
		//String.split() 함수 사용하는 방법도 있다 
		//String s = bf.readLine();
		//int a = Integer.parseInt(s.split(" ")[0]);
		// int b = Integer.parseInt(s.split(" ")[1]);
		StringTokenizer st;
		
		for(int i =0; i<N; i++) {
			
			st = new StringTokenizer(br.readLine()," ");
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			//출력 bw.write() (bw에는 println기능 없어서 붙여줘야 한다)
			bw.write(A+B +"\n");
		}
		br.close();
		
		//BufferedWriter의 경우 버퍼를 잡아 놓았기 때문에 반드시 사용한 후에
		//flush()/ close()를 해주어야 한다.
		//버퍼를 비우고
		bw.flush();
		//닫아준다
		bw.close();
	}
}