class Solution {
    public String solution(String my_string, int num1, int num2) {
		 //문자열 쪼개서 char타입 배열이 넣기(String -> char)
		 char [] charArr = my_string.toCharArray();
		 
		 charArr [num1] = my_string.charAt(num2);
		 charArr [num2] = my_string.charAt(num1);
		 
		 //char형 배열 문자열로 바꾸는 두가지 방법
		 //String answer = String.valueOf(charArr); 
		 String answer = new String(charArr);
        
        return answer;
    }
}