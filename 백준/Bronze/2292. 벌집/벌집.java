import java.util.Scanner;

public class Main { 
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		//숫자 입력 받기
		int N = sc.nextInt();
		
		int result = 1; //최솟값
		int num =2; // 숫자범위 
		//만약 N이 1이면
		if(N == 1) {
			System.out.println(result);
		}
		//그 외
		else {
			while(N >= num) {
				//다음 수 범위
				num = num + (6*result);
				result++;
			}
			System.out.println(result);
		}
		
	}
}