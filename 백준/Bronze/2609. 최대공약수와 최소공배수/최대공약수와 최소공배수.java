
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main { 
	public static void main(String args[]) throws IOException { 
		//유클리드 호제법 
		//R = a % b (a와 b 나눈 나머지)
		//R과 a, R과b의 최대공약수(GCD)는 같음
		//GCD(581, 322) = GCD(322, 259) = GCD(259, 63) =  GCD(63, 7) = GCD(7, 0) = 7
		//큰 수 A를 작은수 B로 나누었을때 나누어 떨어진다면 최대공약수는 B가 된다.
		//1)  입력 받은 두 수 중 큰 수를 A, 작은수를 B로 정한다.
		//2)  A 를 B 로 나눈값의 나머지를 R로 지칭한다.
		//3)  R 이 0이라면 A는 B로 나누어 지기 때문에 최대 공약수는 B가 된다.
		//4)  만약 R이 0이 아니라면 A값은 B로, B 값은 R로 변경한뒤 3번 과정을 반복한다. 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//공백단위로 데이터 가공하겠다
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int result = getGCD(Math.max(A,B),Math.min(A, B));
		
		//최대공약수
		System.out.println(result);

		//1) 두 수의 최대 공약수를 유클리드 호제법을 통하여 구한다.
		//2) 두 수 A, B를 곱한뒤 최대 공약수로 나눈 값을 최소 공배수로 출력한다.
		System.out.println((A*B)/result);
		
	}
	
	//최대공약수
	public static int getGCD(int A, int B) {
//		while(B!=0) {
//			//두 숫자의 나머지
//			int R = A % B;
//			
//			//4)  만약 R이 0이 아니라면 A값은 B로, B 값은 R로 변경한뒤 3번 과정을 반복한다. 
//			A=B;
//			B=R;
//		}
//		return A;
		
		if ( A%B == 0 ) {
	    	return B;
	    } 
		else {
	    	return getGCD(B, A%B);
	    }
	}
}