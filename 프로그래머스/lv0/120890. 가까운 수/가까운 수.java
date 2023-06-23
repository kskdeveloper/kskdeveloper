import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int closestNum = array[0];
        int minDiff = Math.abs(array[0] - n);

        for (int i = 1; i < array.length; i++) {
            int diff = Math.abs(array[i] - n);

            if (diff < minDiff) {
                closestNum = array[i];
                minDiff = diff;
            }
        }
         return closestNum;
    }
}