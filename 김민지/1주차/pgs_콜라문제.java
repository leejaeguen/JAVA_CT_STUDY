/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/132267?language=java
 * 풀이 날짜: 2025.07.24
 */

class Solution {
    public int solution(int a, int b, int n) {
        int totalCoke = 0;
        int emptyBottles = n;

        while(emptyBottles >= a) {
            int newCoke = (emptyBottles / a) * b;
            totalCoke += newCoke;
            emptyBottles = newCoke + (emptyBottles % a);
        }

        return totalCoke;
    }
}