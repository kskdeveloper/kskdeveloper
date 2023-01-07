import java.util.Scanner;
public class Main {  
	  public static void main(String args[]) { 
	    Scanner sc = new Scanner(System.in);

	    //동전 종류
	    int N = sc.nextInt();
	    //동전 합 
	    int K = sc.nextInt();

	    //동전 종류가 담길 배열
	    int[] coin = new int[N];

	    //N개 만큼 코인 담기
	    for(int i = 0; i < N; i++){
	      coin[i] = sc.nextInt();  
	    }
	    
	    //몇개의 코인이 필요한지
	    int count = 0;

	    //최소한 코인 갯수 찾기(큰 수부터 내려오면서 찾기)
	    for(int i = N-1; i >=0; i--){
	      if(K >= coin[i]){
	        // K를 구하기 위해 coin이 몇개 필요한지 구하기
	        count += (K / coin[i]);
	        // 위의 값을 구한 나머지 값
	        K = (K % coin[i]);
	      }
	    
	    }
	    System.out.print(count);
	  } 
}