import java.util.Scanner;

public class Main { 
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
	    
		//대소문자로 이루어진 단어 입력
        //모든 문자열을 대문자로 변환 <-> toLowerCase();
		String str = sc.next().toUpperCase();
		
		//A-Z까지 총 26개 담을 배열
		int arr[] = new int[26];

		for(int i=0; i<str.length();i++) {
			//대문자로 변경했으니 A-A =0 이런식으로 숫자 넣기
			//'A'(65) - 'A'(65) == 0, 'B'(66) - 'A'(65) == 1, 'C'(67) - 'A'(65) == 2
			int num = str.charAt(i) -'A';
			arr[num]++;
		}
		
		int max = 0;
		char answer = '?';
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
				//대문자 출력해야하기 때문에 아스키 코드상 
				//A(65) + 숫자 했을때 아스키코드 대문자 알파벳 나오도록 구현
				answer = (char)(i+'A');
			}
			else if(max == arr[i]) {
				answer = '?';
			}
		}
		System.out.println(answer);
	} 
}