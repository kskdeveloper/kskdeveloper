import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main { 
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
	    //에너지 드링크 수
	    int N = sc.nextInt();
	    
	    //드링크 양
	     Integer num [] = new Integer[N];
	     for(int i =0; i<N; i++) {
	    	 num[i] = sc.nextInt();
	     }
	     
	     //내림차순
	     Arrays.sort(num, Collections.reverseOrder());
	     
	     double sum = num[0];
	     for(int i =1 ; i<N; i++) {
	    	 sum = sum + (num[i]/2.0);
	     }
	     
	     System.out.println(sum);
	} 
}