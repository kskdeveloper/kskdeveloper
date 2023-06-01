class Solution {
    public int solution(int n) {
		int result = n;
		int idx = 1;
		
		//3의 배수이거나 숫자 3이 포함되어 있는지 체크
		while(idx <= result) {
			if((idx % 3 == 0) || String.valueOf(idx).contains("3")) {
				
				result++;
			}

			idx++;
		}
        return result;
    }
}