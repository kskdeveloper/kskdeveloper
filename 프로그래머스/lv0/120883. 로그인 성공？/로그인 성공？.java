import java.util.*;
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        
		Map<String, String> loginMap = new HashMap<String, String>();
		
        //map은 순서 상관 없기 때문에 사용
		for(String[] str : db) {
			loginMap.put(str[0], str[1]);	
		}
        
		//containsKey(true false 반환) -> map에 key값이 있다면
		if(loginMap.containsKey(id_pw[0])) {
			//key값에 대응되는 value 값 불러 올 때 사용하는 방법
			//get -> key에 대응되는 값 가져온다
			if(loginMap.get(id_pw[0]).equals(id_pw[1])) {
				return "login";
			} else {
				return "wrong pw";
			}
		} 
		else {
			return "fail";
		}
    }
}