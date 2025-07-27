/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/131705
 * 풀이 날짜: 2025.07.27
 */

class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int len = number.length;

        for(int i=0; i<len-2; i++) {
            for(int j=i+1; j<len-1; j++) {
                for(int k=j+1; k<len; k++) {
                    if(number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}