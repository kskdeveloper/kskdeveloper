import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main { 
	public static void main(String args[]) { 
	  
		Scanner sc = new Scanner(System.in);
	
		//나무 몇그루 심을것인지
		int N = sc.nextInt();
		
		//나무 자라는데 걸리는 시간 받기
		Integer tree[] = new Integer[N];
		for(int i=0; i<N; i++) {
			tree[i] = sc.nextInt();
		}
		
		//내림차순
		Arrays.sort(tree, Collections.reverseOrder());
		
		int result = 0; //최소한의 시간
		int day = 2; //나무심는데 하루 이장한테 보여주는데 하루
		for(int i=0; i<N; i++) {
			//큰 값 고르기 
			result = Math.max(result, day+tree[i]);
			day++;
		}
		
		System.out.println(result);
	}
}