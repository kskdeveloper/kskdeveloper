import java.util.Scanner;

public class Main {  
  public static void main(String args[]) { 
    Scanner sc = new Scanner(System.in);
    
    //몇 줄 출력할 것인지
    int N = sc.nextInt();

    for(int i =1; i<=N; i++) {
    	for(int j =1; j<=i; j++) {
    		System.out.print("*");
    	}
    	System.out.println();
    }
  } 
}