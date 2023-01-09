import java.util.Scanner;

public class Main {  
  public static void main(String args[]) { 
    Scanner sc = new Scanner(System.in);
    //전자레인지 요리시간(초)
    int T = sc.nextInt();
    
    //전자레인지 버튼 지정된 시간(초) 몇개 필요한지
    int A = 0;
    int B = 0;
    int C = 0;
    
    //만약 요리시간이 10초와 크거나 같다는 조건 하에
    while(T>=10) {
	    
	    if(T>=300) {
	    	T = T - 300;
	    	 A++;
	    }
	    else if(T>=60) {
	    	T = T - 60;
	    	B++;
	    }
	    else if(T>=10) {
	    	T = T - 10;
	    	C++;
	    }
    }
    //만약 T가 결론적으로 0이면 A,B,C 값을 그 외 -1 값 도출
    System.out.println(T == 0 ? A+ " " + B+ " " + C : -1);
  } 
}