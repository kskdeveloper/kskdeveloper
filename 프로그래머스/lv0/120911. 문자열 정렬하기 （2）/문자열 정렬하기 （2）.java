import java.util.*;

class Solution {
    public String solution(String my_string) {
		my_string = my_string.toLowerCase();
		String[] result = my_string.split("");
		Arrays.sort(result);
        
        //배열을 문자열로 변환 (new String()은 int와 char일 때 사용)
        String answer = String.join("", result);
        
        return answer;    
    }
}