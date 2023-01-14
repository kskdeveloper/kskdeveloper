import java.util.Scanner;

public class Main {  
  public static void main(String args[]) { 
    Scanner sc = new Scanner(System.in);
    
    //숫자의 갯수
    int N = sc.nextInt();

    //더 할 값 받기
    String nums = sc.next();
    
    //charAt 사용해서 하나씩 뽑아서 더하기
    int sum = 0;
    for(int i =0; i<N; i++) {
    	sum += nums.charAt(i) - '0';
    
    }
    
    System.out.println(sum);
    
  } 
}