class Solution {
    public int solution(String A, String B) {
        //indexOf() 특정 문자나 문자열 앞에서부터 처음
        //발견되는 인덱스 반환, 찾지 못하면 -1 반환
        return (B+B).indexOf(A);
    }
}