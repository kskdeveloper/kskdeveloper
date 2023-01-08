import java.util.Scanner;
import java.util.Arrays;

public class Main {  
  public static void main(String args[]) { 
    Scanner sc = new Scanner(System.in);
    //사람 수
    int N = sc.nextInt();
    
    //대기시간 담을 배열
    int[] P = new int[N];

    //대기 시간 담기
    for(int i = 0 ; i<N ; i++) {
    	P[i] = sc.nextInt();	
    }
    
    //배열 오름차순 정렬
    Arrays.sort(P);
    
    //대기시간 최소값 구하기
    int result = 0; //총합
    int sum = 0; //더할 값
    for(int i = 0 ; i<N ; i++) {
    	sum = sum + P[i];	
    	result = result + sum; 
    }
    
    System.out.println(result);
  } 
}