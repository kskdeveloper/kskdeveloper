import java.util.Scanner;

public class Main {  
  public static void main(String args[]) { 
    Scanner sc = new Scanner(System.in);
    
    //9개 숫자 담을 배열 통 만들기
    int num[] = new int[9];
    
    //최대값과 인덱스 구하기
    int max = 0;
    int index = 0;
    
    for(int i = 0 ; i<num.length; i++) {
	    //9개의 숫자 입력 받기
	    num[i] = sc.nextInt();
        
	    //배열 순번대로 최대값과 비교하기
		if(num[i] > max) {
			max = num[i];
			index = i;
		}
    }
    System.out.println(max);
    System.out.println(index+1);

  } 
}