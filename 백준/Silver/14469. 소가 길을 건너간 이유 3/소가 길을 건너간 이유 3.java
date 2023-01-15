import java.util.Arrays;
import java.util.Scanner;

public class Main { 

	static int N;
	static Cow[] cows;
	
	//Cow 클래스 선언
	static class Cow implements Comparable<Cow>{
		int enter;
		int time;
		
		//생성자
	 	public Cow(int enter, int time) {
		  super();
		  this.enter = enter;
		  this.time = time;
	   }
	 	//Comparable 인터페이스를 구현하려면 compareTo() 메소드를 오버라이딩해야 하는데, 
	 	//이 메소드가 바로 정렬 규칙을 정하는 메소드이다.
	 	@Override
	 	public int compareTo (Cow c) {
	 		return Integer.compare(this.enter, c.enter);
	 	}
	}	
	
	public static void main(String args[]) { 
	  
	Scanner sc = new Scanner(System.in);
    
	//소 몇마리 출입하는지
	int N = sc.nextInt();
	
	//Cow 클래스 속성 담을 배열 생성
	Cow[] cows = new Cow[N];
	
	//출입시간과 검사시간 담기
	for(int i =0; i<N; i++) {
//		Cow cow = new Cow(cow.enter,cow.time);
//		cow.enter = sc.nextInt();
//		cow.time = sc.nextInt();
		cows[i] = new Cow(sc.nextInt(),sc.nextInt());
	}
	
	//오름차순으로 정렬하기
	Arrays.sort(cows);
	
	//들어가는 시간을 첫번째 값이라고 지정하고
	    int enterTime = cows[0].enter;
	 
	    for(int i =0; i<N; i++) {
	    	
	    	if(enterTime < cows[i].enter ) {
	    		enterTime = cows[i].enter;
	    	}
	    	//들어가는 시간과 검사시간 더하기
	    	enterTime += cows[i].time;
	    }
	    
	    System.out.println(enterTime);
	    
	  }
}