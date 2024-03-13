class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        
        int i = 0;
        while (true) {
            answer[i] = x * (i + 1);
            i++;
            if (i >= n) {
                break;
            }
        }
        
        return answer;
    }
}