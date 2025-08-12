package sec03.exam01;

import java.util.Scanner;

public class changegreedy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int change = 1000 - n;
        int answer = 0;

        while(change > 0){
            if(change >= 500){
                change -= 500;
                answer++;
            }
            else if(change >= 100){
                change -= 100;
                answer++;
            }
            else if(change >= 50){
                change -= 50;
                answer++;
            }
            else if(change >= 10){
                change -= 10;
                answer++;
            }
            else if(change >= 5){
                change -= 5;
                answer++;
            }
            else if(change >= 1){
                change -= 1;
                answer++;
            }
        }
        System.out.println(answer);
    }
}
