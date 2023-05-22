class Solution {
    public int solution(int order) {        
        int answer = 0;
        
        String num = String.valueOf(order);
        for(int i =0; i<num.length(); i++) {
        	char numChk = num.charAt(i);
        	if(numChk== '3' || numChk == '6' || numChk == '9') {
        		answer++;	
        	}
        }
        return answer;
    }
}