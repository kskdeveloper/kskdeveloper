import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
		
        List <Integer> list = new ArrayList<>();
		for(int i=5; i<num_list.length; i++) {
				list.add(num_list[i]);
		}
        
        int[] answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
        	answer[i] = list.get(i).intValue();
        }        
        return answer;
    }
}