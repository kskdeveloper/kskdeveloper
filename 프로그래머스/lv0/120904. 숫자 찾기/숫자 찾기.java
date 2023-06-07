class Solution {
    public int solution(int num, int k) {
        int result = -1;
        
        String number = Integer.toString(num);
		String n = Integer.toString(k);
		
		String [] arr = number.split("");
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(n)) {
				result = i+1;
                break;
			}
		}
        return result;
    }
}