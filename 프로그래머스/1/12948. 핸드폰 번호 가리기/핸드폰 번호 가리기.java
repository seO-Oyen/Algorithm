class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] arr = phone_number.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 4) {
                answer += "*";
            } else {
                answer += arr[i];
            }
        }
        
        return answer;
    }
}