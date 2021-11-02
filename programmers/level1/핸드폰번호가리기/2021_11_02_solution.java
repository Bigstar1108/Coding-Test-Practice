// https://programmers.co.kr/learn/courses/30/lessons/12948?language=java

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        int length = phone_number.length();
        
        int startIndex = length - 4;
        String parseNumber = phone_number.substring(startIndex, length);
        
        for (int i = 0; i < startIndex; i++) {
            answer += "*";
        }
        
        answer += parseNumber;
        
        return answer;
    }
}