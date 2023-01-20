import java.util.Scanner;

public class Main { 
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
	    //현재 주파수
	    int A = sc.nextInt();
	    //듣고 싶은 주파수
	    int B = sc.nextInt();
	    
	    //미리 지정되어 있는 주파수의 수
	    int N = sc.nextInt();
	    
	    //A-B값을 현재 최소값으로 지정
	    int min = Math.abs(A-B);
	    
	    //주파수 받기
	    for(int i=0; i<N;i++) {
	    	int num = sc.nextInt();
            //+1 0이되면 버튼 1번 클릭한 것과 동일해지니까
	    	min = Math.min(Math.abs(B-num)+1, min);
	    	
	    }
	    System.out.println(min);
	} 
}