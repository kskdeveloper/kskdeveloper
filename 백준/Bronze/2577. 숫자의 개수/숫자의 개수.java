import java.util.Scanner;

public class Main {  
  public static void main(String args[]) { 
    Scanner sc = new Scanner(System.in);
    
    //자연수 받기
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    
    //세 수 곱하기
    int num = A*B*C;
    
    //숫자를 문자로 변환 Integer.toString()
    String multi =  Integer.toString(num); 
   
    
    for(int i= 0; i<10; i++) {
    	
    	//0~9까지 숫자 카운트
    	int count =0;
	    
    	for(int j= 0; j<multi.length(); j++) {
	    	//charAt(index)사용하여 문자열에서 하나씩 뽑아오기
    		//String형의 문자를 CharAt 함수를 이용해서 반환 후 int형로 변환하여 계산식에 사용 시
    		// - '0' 또는 -48 을 연산해야 한다. 
    		//char형으로 반환 받기 때문에 int로 변환 시 아스키코드값(49)이 변환되기 때문
    		//CharAt(int index)로 추출한 숫자형 문자는 char형이므로 int형으로 변환 시 아스키코드로 변환된다.
    		//따라서 '0'(48)을 빼주어야 의도한 리턴값을 얻을 수 있다.
    		if((multi.charAt(j)-'0') == i) {
    			count++;
    		}
    	}
    	System.out.println(count);
    }
  } 
}