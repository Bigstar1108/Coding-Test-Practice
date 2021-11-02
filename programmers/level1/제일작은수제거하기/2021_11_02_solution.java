// https://programmers.co.kr/learn/courses/30/lessons/12935?language=java

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        
        if (length == 1) {
            int[] answer = {-1};
            
            return answer;
        }
        
        int minNumber = getMinNumber(arr);
        
        int[] answer = getFilterArray(arr, minNumber);
        
        return answer;
    }
    
    public int getMinNumber(int[] arr) {
        int minNumber = 0;
        
        for (var i = 0; i < arr.length; i++) {
            if (i == 0) {
                minNumber = arr[i];
                continue;
            } 
            
            if (minNumber > arr[i]) {
                minNumber = arr[i];
            }
        }
        
        return minNumber;
    }
    
    public int[] getFilterArray(int[] arr, int minNumber) {
        int length = arr.length - 1;
        int[] filterArray = new int[length];
        
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (arr[i] == minNumber) {
                continue;
            }
            
            filterArray[k] = arr[i];
            k++;
        }
        
        return filterArray;
    }
}