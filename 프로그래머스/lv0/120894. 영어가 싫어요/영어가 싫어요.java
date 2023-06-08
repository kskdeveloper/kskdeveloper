class Solution {
    public long solution(String numbers) {
        String [] setNum = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i =0; i < setNum.length; i++){
            numbers = numbers.replaceAll(setNum[i], String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }
}