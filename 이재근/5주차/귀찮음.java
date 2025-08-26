package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr =  new long[n];

        long total = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        long result = 0;
        for (int i = 0; i < n; i++) {
            total = total - arr[i];
            result += total * arr[i];
        }
        System.out.println(result);

    }

}


// 아래 코드는 O(n^2) 이라 시간 복잡도가 너무 높음

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int input = sc.nextInt();
//         long[] arr =  new long[input];

//         for (int i = 0; i < input; i++) {
//             arr[i] = sc.nextInt();
//         }
//         long sum = 0;
//         ArrayList<Long> list = new ArrayList();
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 sum += arr[j];
//             }
//             list.add(arr[i] * sum);
//             sum = 0;
//         }
//         long result = 0;

//         for(long num2 : list){
//             result += num2;
//         }
//         System.out.println(result);

//     }

// }