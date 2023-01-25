import java.util.Scanner;

public class Main { 
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			String str = sc.next();
			
			if(str.equals("0")) {
				break;
			}
			
			//문자열 뒤집기 
			StringBuffer sb = new StringBuffer(str);
			String reverse_str = sb.reverse().toString();
			
			if(str.equals(reverse_str)) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
	}
}