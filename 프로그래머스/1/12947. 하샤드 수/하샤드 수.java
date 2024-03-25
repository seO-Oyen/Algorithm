class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String[] arr = Integer.toString(x).split("");
        
        int sum = 0;
        for (String a : arr) {
            sum += Integer.parseInt(a);
        }
        
        return x % sum == 0;
    }
}