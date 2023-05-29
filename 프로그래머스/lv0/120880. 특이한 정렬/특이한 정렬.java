import java.util.*;

class Solution {
    public Object[] solution(int[] numlist, int n) {
        
		//리스트에 기존 배열 담기
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i =0; i<numlist.length; i++) {
			result.add(numlist[i]);
		}
        
		//커스터마이징 된 새로운 정렬 방법을 정의할 때 사용
		Collections.sort(result, new Comparator<Integer>() {
			@Override
			public int compare(Integer num1, Integer num2) {
				if(Math.abs(num1 - n) != Math.abs(num2 - n)) {
					return Math.abs(num1 - n) - Math.abs(num2 - n);
                    
				} else {
                    //내림차순으로 정렬되어 큰값이 우선하게 됨
					return num2 - num1;
				}
			}
		});
        
		return result.toArray();
    }
}