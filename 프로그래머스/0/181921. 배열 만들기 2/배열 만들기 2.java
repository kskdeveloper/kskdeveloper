import java.util.*;
class Solution {
    public int[] solution(int l, int r) {       
        List<Integer> list = new ArrayList<>(); 
        int cnt = 0;        
        for(int i=l; i<=r ; i++){
            String str = i + "";
            for(int j =0; j<str.length(); j++){
                if(str.charAt(j) == 48 || str.charAt(j) == 53){
                    cnt++;
                }
            }
            if(cnt == str.length()){
                list.add(i);
            }
            cnt = 0;
        }
        
        int[] answer = {-1};
        if(list.isEmpty()){
           return answer;
        }
        
        int[] resultArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            resultArr[i] = list.get(i);
        }
        return resultArr;
    }
}