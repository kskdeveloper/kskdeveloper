import java.util.Scanner;

public class Main { 
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
	    //우유 가게 수
	    int N = sc.nextInt();
	    
	    //우유 순서 0(딸) -> 1(초) -> 2(바) -> 0(딸)
	    int line[] = new int[N];
	    for(int i=0; i<N;i++) {
	    	line[i] = sc.nextInt();
	    }
	    
	    //마실 수 있는 우유 최대수
	    int cnt = 0;
	    //순서
	    int num = 0;
	    
	    for(int i=0; i<line.length;i++) {
	    	if(line[i]==num) {
	    		cnt++;
	    		num++;
	    	}
	    	if(num == 3) {
	    		num =0;
	    	}
	    }
	    System.out.println(cnt);
	} 
}