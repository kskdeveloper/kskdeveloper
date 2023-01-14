import java.util.Scanner;

public class Main {  
  public static void main(String args[]) { 
    Scanner sc = new Scanner(System.in);
    
    //테스트 케이스 개수
    int T = sc.nextInt();
    
    for(int i=0; i<T; i++) {
    	//반복횟수
    	int R = sc.nextInt();
    	//문자열 
    	String S = sc.next();
    	
    	for(int j =0; j<S.length(); j++) {
    		for(int k=0; k<R; k++) {
    			System.out.print(S.charAt(j));
    		}
    	}
    	System.out.println();
    }
  } 
}