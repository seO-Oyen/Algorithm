import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int i = 0;
        for (int a : arr) {
            if (a % divisor == 0) {
                i++;
            }
        }
        
        int[] answer = {};
        if (i != 0) {
            answer = new int[i];
            i = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % divisor == 0) {
                    answer[i] = arr[j];
                    i++;
                }
            }
            Arrays.sort(answer);
        } else {
            answer = new int[1];
            answer[0] = -1;
        }
        
        return answer;
    }
}