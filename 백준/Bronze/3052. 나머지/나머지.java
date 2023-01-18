import java.util.HashSet;
import java.util.Scanner;

public class Main { 
	public static void main(String args[]) { 
	  
		Scanner sc = new Scanner(System.in);
		
		//HashSet 이용하기(중복되는 원소는 하나만 저장되고, 순서 개념없음)
		HashSet<Integer> hash = new HashSet<Integer>();

		for(int i=0; i<10; i++) {
			
			int num = sc.nextInt();
			//hasnSet에 저장
			hash.add(num%42);
		
		}
		//저장되어 있는 원소 개수
		System.out.println(hash.size());

	}
}