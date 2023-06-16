class Solution {
    public int solution(int n) {
		int result = 0;
		for(int i = 4; i< n+1 ; i++) {	
			int cnt = 0;
			for(int j = 1 ; j < i+1; j++) {
				if(i%j == 0) {
					cnt++;
				}
			}
			if(cnt >= 3) {
				result ++;
			}
		}
        return result;
    }
}