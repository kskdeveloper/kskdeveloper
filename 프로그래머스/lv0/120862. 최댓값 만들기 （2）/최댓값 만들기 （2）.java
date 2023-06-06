import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        //오름차순으로 정렬
        Arrays.sort(numbers);
        int len = numbers.length;
        //양수 중에서 큰 값
        int num1 = numbers[len-1] * numbers[len-2];
        //음수 중에서 큰 수 있을 수 있으니 
        int num2 = numbers[0] * numbers[1];
        
        if(num1>num2){
            return num1;
        } else {
            return num2;
        }
    }
}