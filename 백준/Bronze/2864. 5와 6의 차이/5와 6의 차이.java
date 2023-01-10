import java.util.Scanner;

public class Main {  
  public static void main(String args[]) { 
    Scanner sc = new Scanner(System.in);
  
    //두 정수를 문자열로 받기
    String A = sc.nextLine();
    
    //A를 공백 기준으로 배열에 담기
	String arr[] = A.split(" ");
	
	//최소값 구하기 문자열 치환함수 replace 사용
	//(문자열을 숫자로 바꾸어서 6은 5로 바꿔주기)
	int min = Integer.parseInt(arr[0].replace("6", "5")) + Integer.parseInt(arr[1].replace("6", "5"));
	//최대값 구하기 (문자열을 숫자로 바꾸어서 5를 6으로 바꿔주기)
	int max = Integer.parseInt(arr[0].replace("5", "6")) + Integer.parseInt(arr[1].replace("5", "6"));
	
	//출력하기
	System.out.print(min + " " + max);

  } 
}