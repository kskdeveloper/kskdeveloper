class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int [num];
        
        //배열의 첫번째 값 구하기
        int firstNum = (total/num) - ((num-1)/2);
        
        for(int i =0; i<num;i++){
            answer[i] = firstNum;
            firstNum++;
        }
        return answer;
    }
}