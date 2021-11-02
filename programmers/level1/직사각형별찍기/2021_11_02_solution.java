import java.util.Scanner;

// https://programmers.co.kr/learn/courses/30/lessons/12969?language=java
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for (var i = 0; i < b; i++) {
            for (var j = 0; j < a; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}