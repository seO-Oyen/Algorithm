import java.util.*;

class Solution {
    public int[] solution(long n) {
        String[] array = Long.toString(n).split("");
        int[] intarray = new int[array.length];
        int[] answer = new int[array.length];
        
        for (int i = 0; i < array.length; i++) {
            intarray[i] = Integer.parseInt(array[i]);
        }
        
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            answer[j] = intarray[i];
        }
        
        return answer;
    }
}