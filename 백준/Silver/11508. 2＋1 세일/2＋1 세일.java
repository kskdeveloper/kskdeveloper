import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main { 
	public static void main(String args[]) { 
	  
		Scanner sc = new Scanner(System.in);
		//유제품 수
		int N = sc.nextInt();
		
		//유제품 가격
		Integer price [] = new Integer[N];
		for(int i =0; i<N; i++) {
			price[i]=sc.nextInt();
		}
		
		//내림차순
		Arrays.sort(price, Collections.reverseOrder());
		
		int result = 0;
		for(int i=0; i<price.length;i++) {
		
			//3의 배수만 빼고 나머지 더하기
			if((i+1)%3 != 0) {
				result = result +price[i];
			}
		}
		
		System.out.println(result);
	}
}