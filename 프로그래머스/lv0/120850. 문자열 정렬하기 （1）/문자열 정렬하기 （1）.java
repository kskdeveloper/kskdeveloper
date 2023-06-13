import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        //0~9 아닌 값은 공백처리
		String str = my_string.replaceAll("[^0-9]", "");
		
		int [] result = new int [str.length()];
		
		for(int i =0; i < result.length; i++) {
			result[i] = str.charAt(i)-'0';
		}
		
		Arrays.sort(result);
        
        return result;
    }
}