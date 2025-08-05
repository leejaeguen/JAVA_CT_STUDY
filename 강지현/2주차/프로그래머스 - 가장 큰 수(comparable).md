```
import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        List<s_com> lt = new ArrayList<s_com>();
        int zero_cnt=0;
        for(int i=0;i<numbers.length;i++){
            lt.add(new s_com(Integer.toString(numbers[i])));
            if(numbers[i]==0)zero_cnt++;
        }
        if(zero_cnt==numbers.length)return "0";

        Collections.sort(lt);
        for (int i = 0; i < lt.size(); i++) {
            answer = answer + lt.get(i).a;
        }
    
        
        return answer;
    }
}

class s_com implements Comparable<s_com> {
    String a;
    public s_com(String a){
        this.a = a;
    }
    @Override
    public int compareTo(s_com o) {
        return (o.a + this.a).compareTo(this.a + o.a);
    }
}
```
