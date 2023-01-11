import java.util.Scanner;

public class Main {  
  public static void main(String args[]) { 
    Scanner sc = new Scanner(System.in);
    //케이스 개수 받기
    int T = sc.nextInt();
    
    //거스름돈 C를 T만큼 실행하도록 for문 구성
    for(int i =0; i<T; i++) {
    	int C = sc.nextInt();
    	
        //금액별 count 내역 담을 인수 생성 (다시 리셋되어야 하기 때문에)
        int Q = 0;
        int D = 0;
        int N = 0;
        int P = 0;
    	
        //거스름돈이 0보다 크다는 전제 하에
    	while(C > 0) {
    		//25가 들어갈 내역 계산
    		Q = Q + (C/25);
    		C = C - (Q*25);
    		
    		//10이 들어갈 내역 계산
    		D = D+ (C/10);
    		C = C - (D*10);
    		
    		//5가 들어갈 내역 계산
    		N = N + (C/5);
    		C = C - (N*5);
    		
    		//1이 들어갈 내역 계산
    		P = P + (C/1);
    		C = C - (P*1);

    	    //케이스 개수 출력
    	    System.out.println(Q + " " + D + " " + N + " " + P);
    	}
    }
  } 
}