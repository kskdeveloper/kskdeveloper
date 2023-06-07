import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        //배열의 크기 알 수 없기에 ArrayList에 담기
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i]%n ==0){
                list.add(numlist[i]);
            }
        }
        
        //ArrayList에 담긴 데이터 배열에 담기
        int [] result = new int[list.size()];
        for(int i =0; i<list.size(); i++){
            result[i] = list.get(i).intValue();
        }
        
        return result;
    }
}