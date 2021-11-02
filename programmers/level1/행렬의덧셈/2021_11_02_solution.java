// https://programmers.co.kr/learn/courses/30/lessons/12950?language=java

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int parentLength = arr1.length;
        int childLength = arr1[0].length;
        
        int[][] answer = new int[parentLength][childLength];
        
        for (var i = 0; i < parentLength; i++) {
            for (var j = 0; j < childLength; j++) {
                int arr1Value = arr1[i][j];
                int arr2Value = arr2[i][j];
                
                answer[i][j] = arr1Value + arr2Value;
            }
        }
        
        return answer;
    }
}