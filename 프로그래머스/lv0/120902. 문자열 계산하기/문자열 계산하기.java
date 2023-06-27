class Solution {
    public int solution(String my_string) {
		String [] str = my_string.split(" ");
		
		int result = Integer.parseInt(str[0]);
	
		for(int i = 1 ; i < str.length; i+=2) {
			if(str[i].equals("+")) {
				result += Integer.parseInt(str[i+1]);
			} else {
				result -= Integer.parseInt(str[i+1]);
			}
		}     
        return result;
    }
}