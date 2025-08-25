package test;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        long n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] arr =  new int[n];
        int sum =0;

        for (int i = 0; i < n; i++) {   //입력 및 배열의 총 합 sum
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }

        Arrays.sort(arr);              //오름차순 정렬

        int answer = 0; //출력값

        for(int i=0 ;i<n-1;i++){
            sum = sum -arr[i];
            answer += arr[i] * sum;    //두 수가 곱한 값이 최소이려면 두 수의 차이가 최대한 커야함
        }

        System.out.println(answer);
    }
}
