import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        List<Integer> scoreList = new ArrayList<>();
        
        for(int[] num : score) {        	
        	scoreList.add(num[0] + num[1]);
        }
        
        scoreList.sort(Comparator.reverseOrder());
        
        int[] answer = new int[score.length];

        for(int i=0; i<score.length; i++) {
        	answer[i] = scoreList.indexOf(score[i][0] + score[i][1]) +1;
        }
        
        return answer;
    }
}