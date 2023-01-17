import java.util.Scanner;

public class Main { 
	public static void main(String args[]) { 
	  
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 개수
		int N = sc.nextInt();
		
		//OX값 받기
		String arr[]  = new String[N];
		for(int i =0; i<N; i++) {
			
			arr[i] = sc.next();
		}
		
		//총점 구하기
		for(int i=0; i<arr.length;i++) {
			
			//O 개수 카운트
			int cnt =0;
			//cnt점수 합산
			int sum =0;
			
			for(int j=0; j<arr[i].length();j++) {
				
				if(arr[i].charAt(j) == 'O') {
					cnt++;
				}
				else {
					cnt = 0;
				}
				//합계
				sum += cnt;
			}
			
			System.out.println(sum);
		}
	}
}