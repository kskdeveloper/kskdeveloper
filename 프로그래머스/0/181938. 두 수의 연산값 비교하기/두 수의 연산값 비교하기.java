class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String num1 = a+""+b;
        int num2 = 2*a*b;
        if(Integer.parseInt(num1) > num2){
            answer = Integer.parseInt(num1);
        } else {
            answer = num2;
        }
        return answer;
    }
}