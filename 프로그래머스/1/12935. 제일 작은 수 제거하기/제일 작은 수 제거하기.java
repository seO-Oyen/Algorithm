class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            int[] a = {-1};
            return a;
        }
        int[] answer = new int[arr.length - 1];
        int min = arr[0];
        
        for (int a : arr) {
            min = Math.min(min, a);
        }
        
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == min) {
                continue;
            }
            answer[j++] = arr[i];
        }
        
        
        return answer;
    }
}