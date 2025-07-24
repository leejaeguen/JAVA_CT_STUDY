class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while (n >= a) {
            int give = n / a;
            int get = give * b;
            
            n = n - give * a + get;
            answer = answer + get;
        }
        return answer;
    }
}