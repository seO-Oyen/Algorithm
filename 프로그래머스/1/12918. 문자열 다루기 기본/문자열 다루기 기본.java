class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        char[] arr = s.toCharArray();
        if (arr.length == 4 || arr.length == 6) {
            for (int a : arr) {
                if (a < 48 || a > 57) {
                    return false;
                }
            }
        } else {
            return false;
        }
        
        
        
        return answer;
    }
}