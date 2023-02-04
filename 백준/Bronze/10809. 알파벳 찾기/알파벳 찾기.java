import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		
		//알파벳 개수
		int[] arr = new int[26];
		
		//모든 배열 값 -1로
		for(int i =0; i<arr.length;i++) {
			arr[i] = -1;
		}
		
		//문자 받기
		String str = sc.nextLine();
		
		for(int i =0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			// -1 인 경우에는 배열의 원소 값을 변경하고 -1 이 아닌 경우 배열의 원소 값을 변경하지 않는다
			if(arr[ch - 'a'] == -1) {
				// arr 배열의 인덱스(원소 위치)는 ch가 갖고 있는 
				//문자 인코딩 값(=아스키코드 값과 동일)에 'a' 또는 97 을 빼주면 된다.
				//만약 b 라는 문자가 ch 에 담겨있을 경우 b - 'a' 또는 b - 97 을 하면 1 이 되고,
				//arr[1] 은 문자 b를 가리키는 것을 의미한다.
				arr[ch - 'a'] = i;
			}
		}
		for(int num :arr) {
			System.out.print(num+" ");
		}
	}
}