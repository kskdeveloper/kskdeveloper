import java.util.*;

class Solution {
    public Integer[] solution(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 1 ; i < n+1; i++){
            if(n%i == 0){
                list.add(i);
            }      
        }
        
        int len = list.size();
        //ArrayList를 배열로 변경
        Integer[] arr = list.toArray(new Integer[len]);
        
        return arr;
    }
}