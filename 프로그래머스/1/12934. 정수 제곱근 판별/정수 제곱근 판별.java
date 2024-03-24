class Solution {
    public long solution(long n) {
        long answer = -1;
        
        double d = Math.sqrt(n);
        
        if (d % 1 == 0) {
            d++;
            answer = (long)(d * d);
        }
        
        
        return answer;
    }
}