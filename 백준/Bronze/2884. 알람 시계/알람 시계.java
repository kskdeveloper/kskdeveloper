import java.util.Scanner;

public class Main { 
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
	    
		//시간 입력 받기
		int hh = sc.nextInt();
		int mm = sc.nextInt();
		
		//입력받은 분이 0시 30분일 때
		if(mm <45) {
			//15
			mm = 60 - (45 -mm);
			//0이니까 -1이 된다
			hh--;
			//시간이 0보다 작은 경우는 하나이기에 시를 23으로 바꿔준다
			if(hh <0) {
				hh = 23;
			}
			System.out.println(hh + " " + mm);
		}
		else {
			System.out.println(hh + " "+(mm-45));
		}
	} 
}