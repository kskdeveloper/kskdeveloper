import java.util.Scanner;

public class Main {  
  public static void main(String args[]) { 
    Scanner sc = new Scanner(System.in);
    //문자열 받기
    String word = sc.nextLine();
    
    //문자열 앞 뒤 공백 제거
    word = word.trim();
      
    //공백으로 문자열 구분하여 배열에 담기
    String word_arr[] = word.split(" ");
    
    //공백으로 시작하고 끝날 수 있는 경우 배열 길이에서 -1 하니까 0출력
    if(word_arr.length==1 && word_arr[0].equals("")) {
    	System.out.println(0);
    }
    else {
    	//그 외에는 배열 길이만큼 출력되도록 실행
    	System.out.println(word_arr.length);
    }

  } 
}