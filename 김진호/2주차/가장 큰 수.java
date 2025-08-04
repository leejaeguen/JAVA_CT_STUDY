class Solution {
    public String solution(int[] numbers) {
        
        String answer = "";
        int Max_val = 0;
        int tmp = 0;
        
        for(int i= 0 ; i<numbers.length; i++)
        {
            for(int j=0; j< numbers.length; j++)
            {
               if ((numbers[j] + "" + numbers[i]).compareTo(numbers[i] + "" + numbers[j]) < 0)
                {
                         tmp =numbers[i];
                         numbers[i]=numbers[j];
                        numbers[j]=tmp;
                }
            }
        }
        
        for(int num:numbers)
        {
            answer += num;
        }
    
        
        
        return answer;
    }
}