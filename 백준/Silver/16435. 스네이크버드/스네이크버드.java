import java.util.Arrays;
import java.util.Scanner;

public class Main { 
	public static void main(String args[]) { 
	  
		Scanner sc = new Scanner(System.in);
		//과일개수
		int N = sc.nextInt();
		//초기 길이
		int L = sc.nextInt();
		
		//먹이 높이
		int height [] = new int[N];
		for(int i =0; i<N; i++) {
			height[i]=sc.nextInt();
		}
		
		//오름차순
		Arrays.sort(height);
		
		int result = 0;
		for(int i=0; i<height.length;i++) {
			
			if(height[i]<=L) {
				result = L+1;
				L++;
			}
		}
		System.out.println(result);
	}
}