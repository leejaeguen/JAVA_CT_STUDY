import java.util.Stack;
import java.util.Scanner;

public class Main{ 
    public static void main(String[] args){
    int n;
    String a;
    
    Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
    Stack<Integer> stack = new Stack<Integer>();
    for (int i = 0; i < n; i++) {
	    a = sc.next();
        if (a.equals("pop")){
            if (stack.isEmpty()){
                System.out.println(-1);
            }
            else{
                System.out.println(stack.pop());
            }
        }
        else if (a.equals("size")) {
            System.out.println(stack.size());
            
        }
        else if (a.equals("empty") ){
            if (stack.isEmpty()){
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
            
        }
        else if(a.equals("push")) {
            stack.push(sc.nextInt());
            
        }
        else {
            if (stack.isEmpty()){
                System.out.println(-1);
            }
            else{
                System.out.println(stack.peek());
            }   
        }
        
    }


}}




