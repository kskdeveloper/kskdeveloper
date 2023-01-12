import java.util.Scanner;

public class Main {  
  public static void main(String args[]) { 
    Scanner sc = new Scanner(System.in);
    
    //몇 줄 출력할 것인지
    int N = sc.nextInt();

    for(int i =1; i<=N; i++) {
    	//공백을 N-1 N-2 숫자가 커질수록 공백 작아져야 하니까	
    	for(int j =1; j<=N-i; j++) {
    		System.out.print(" ");
    	}
    	//별 뽑아내기
    	for(int s = 1; s<=i;s++) {
    		System.out.print("*");
    	}
    	
    	System.out.println();
    }
  } 
}