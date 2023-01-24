import java.util.Scanner;

public class Main { 
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
	    
		//문자열 뒤집기 메소드 사용
		String a = sc.next();
		String b = sc.next();
		
		StringBuffer num1 = new StringBuffer(a);
		StringBuffer num2 = new StringBuffer(b);
		
		int A = Integer.parseInt(num1.reverse().toString());
		int B = Integer.parseInt(num2.reverse().toString());
		
		System.out.println(A > B ? A : B);
	
	} 
}