//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<n;i++){
            String s = sc.next();
            if(s.equals("push")){
                st.push(sc.nextInt());
            }
            else if(s.equals("pop")){
                if(st.isEmpty()){
                    System.out.println(-1);
                }
                else {
                    System.out.println(st.pop());
                }
            }
            else if(s.equals("size")){
                System.out.println(st.size());
            }
            else if(s.equals("empty")){
                if(st.isEmpty()){
                    System.out.println(1);
                }
                else System.out.println(0);

            }
            else {
                if(st.isEmpty()){
                    System.out.println(-1);
                }
                else {
                    System.out.println(st.peek());
                }
            }
        }
    }
}