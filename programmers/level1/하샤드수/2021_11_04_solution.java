class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String xString = Integer.toString(x);
        int sumValue = 0;
        
        for (int i = 0; i < xString.length(); i++){
            sumValue += xString.charAt(i) - '0';
        }
        
        answer = x % sumValue == 0;
        
        return answer;
    }
}