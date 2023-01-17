import java.util.Arrays;
import java.util.Scanner;

public class Main { 
	public static void main(String args[]) { 
	  
		Scanner sc = new Scanner(System.in);
		
		//받을 정수 개수
		int N = sc.nextInt();
		
		//정수값 받기
		int num[] = new int[N];
		for(int i =0; i<N; i++) {
			num[i] = sc.nextInt();
		}
		
		//오름차순 정렬
		Arrays.sort(num);
		
		System.out.print(num[0] + " ");
		System.out.print(num[N-1]);
	}
}