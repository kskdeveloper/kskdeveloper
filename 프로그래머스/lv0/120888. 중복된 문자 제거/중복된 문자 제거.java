import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        
		List<Character> str = new ArrayList<>();
		List<Character> result = new ArrayList<>();
		
		//문자열의 문자 하나씩 list에 담기
		for(int i =0; i < my_string.length(); i++) {
			str.add(my_string.charAt(i));
		}
		
		//stream으로 중복제거 후 리스트로 담기 
		result = str.stream().distinct().collect(Collectors.toList());
		
        String answer = "";
        
		for(int i =0; i<result.size(); i++) {
			answer += result.get(i);
		}
        
        return answer;
    }
}