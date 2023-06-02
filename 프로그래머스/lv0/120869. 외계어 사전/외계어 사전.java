class Solution {
    public int solution(String[] spell, String[] dic) {
		boolean wordCheck = false;
        
        for(String test : dic) {
			int cnt = 0;
			
			//test에서 하나 꺼낸 단어와 spell에서 꺼낸 알파벳이 포함되어 있는지 체크 
			for(String str : spell) {
				if(test.contains(str)) {
					cnt++;
				}
			}
			//spell의 개수와 cnt가 같으면 true
			if(cnt == spell.length) {
                wordCheck = true;
				break;
			} 
		}
        
        if(wordCheck){
            return 1;
        } else {
            return 2;
        }
    }
}