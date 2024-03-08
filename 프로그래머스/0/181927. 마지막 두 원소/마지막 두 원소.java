class Solution {
    public int[] solution(int[] num_list) {
        int num = num_list.length + 1;
        int[] answer = new int[num];
        for(int i =0; i<num_list.length; i++){
            answer[i] += num_list[i];
        } 
        if(num_list[num -2]> num_list[num -3]){
            answer[num-1] = num_list[num -2] - num_list[num -3];
        } else {
           answer[num-1] = num_list[num -2] *2; 
        }
        return answer;
    }
}