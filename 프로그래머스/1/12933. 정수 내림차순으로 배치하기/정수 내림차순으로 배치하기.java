import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String[] st = Long.toString(n).split("");
        
        Arrays.sort(st);
        
        String an = "";
        for (int i = st.length - 1; i >= 0; i--) {
            an += st[i];
        }
        answer = Long.parseLong(an);
        
        return answer;
    }
}