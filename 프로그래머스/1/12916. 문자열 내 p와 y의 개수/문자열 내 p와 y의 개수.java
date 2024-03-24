class Solution {
    boolean solution(String s) {
        boolean answer = true;

        s = s.toLowerCase();
        String[] arr = s.split("");
        
        int p = 0;
        for(String a : arr) {
            if (a.equals("p")) {
                p++;
            }
            if (a.equals("y")) {
                p--;
            }
        }
        
        if (p != 0) {
            answer = false;
        }

        return answer;
    }
}