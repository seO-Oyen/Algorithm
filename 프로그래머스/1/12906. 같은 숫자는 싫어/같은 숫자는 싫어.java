import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        int last = arr[0];
        int len = 1;
        for (int i = 1; i < arr.length; i++) {
            if (last != arr[i]) {
                last = arr[i];
                len++;
            }
        }
        
        int[] answer = new int[len];
        last = arr[0];
        answer[0] = arr[0];
        int j = 1; 
        for (int i = 1; i < arr.length; i++) {
            if (last != arr[i]) {
                last = arr[i];
                answer[j++] = arr[i];
            }
        }

        return answer;
    }
}