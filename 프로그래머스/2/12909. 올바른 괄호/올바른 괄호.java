class Solution {
    boolean solution(String s) {
        boolean answer = true;

        char[] temp = s.toCharArray();
        int leftn = 0;
        int rightn = 0;
        
        for (char tes : temp) {
            if (tes == '(') {
                leftn += 1;
            } else {
                if (leftn == 0) {
                    answer = false;
                    break;
                }
                leftn -= 1;
            }
        }
        if (leftn > 0) {
            answer = false;
        }

        return answer;
    }
}