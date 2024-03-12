class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] splitS = s.split(" ");
        
        int min = Integer.parseInt(splitS[0]);
        int max = Integer.parseInt(splitS[0]);
        
        for (String c : splitS) {
            int parC = Integer.parseInt(c);
            if (min > parC) {
                min = parC;
            }
            if (max < parC) {
                max = parC;
            }
        }
        
        answer = min + " " + max;
        
        return answer;
    }
}