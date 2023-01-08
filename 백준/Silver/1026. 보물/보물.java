import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {  
  public static void main(String args[]) { 
    Scanner sc = new Scanner(System.in);
    //배열 길이
    int N = sc.nextInt();
    
    //A 배열 담을 통
    int[] A = new int[N];
    //B 배열 담을 통(Collections.reverseOrder() 사용을 위해서 Integer사용)
    Integer[] B = new Integer[N];

    //배열에 숫자 담기
    for(int i = 0 ; i<N ; i++) {
    	A[i] = sc.nextInt();
    }
    
    //배열에 숫자 담기
    for(int i = 0 ; i<N ; i++) {
    	B[i] = sc.nextInt();
    }
    
    //A배열 오름차순 정렬
    Arrays.sort(A);
    
    //B배열 내림차순 정렬
    Arrays.sort(B, Collections.reverseOrder());
    
    
    //A*B 배열합 최솟값 구하기
    int result = 0;

    for(int i = 0 ; i<N ; i++) {
    	result = result + A[i]*B[i];
    }
    
    System.out.println(result);
  } 
}