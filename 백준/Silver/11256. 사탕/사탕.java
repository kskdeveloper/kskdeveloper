import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main { 
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
	    
		//테스트 케이스 개수
	    int T = sc.nextInt();
	    
	    
	    for(int i = 0; i<T; i++) {
	    	//박스 최소값
	    	int cnt = 0;
	    	//사탕개수 J
	    	int J = sc.nextInt();
	    	//상자 개수N
	    	int N = sc.nextInt();
	    	
	    	Integer boxes [] = new Integer[N];
	    	
	    	for(int j = 0; j<N; j++) {
	    		//상자 안에 담을 수 있는 사탕 수 (a*b)
	    		int a = sc.nextInt();
	    		int b = sc.nextInt();
	    		//박스 크기
	    		boxes[j] = a*b;
	    	}
	    	for(int p =0; p < boxes.length; p++) {
	    		//오름차순으로 정렬
	    		Arrays.sort(boxes, Collections.reverseOrder());

	    			if(boxes[p] >= J) {
	    				cnt++;
	    				break;
	    			}
	    			else if(boxes[p] <= J) {
	    				J = J - boxes[p];
	    				cnt++;
	    			}
	    	}
	    	System.out.println(cnt);
	    }

	} 
}