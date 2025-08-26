package sec03.exam01;

import java.util.*;

public class lazy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long total = 0;
        long a = 0;
        long b = 0;
        long answer = 0;
        List<Long> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextLong());
        }
        for (int i = 0; i < arr.size(); i++) {
            total += arr.get(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            a = arr.get(i);
            total -= a;
            b = a * total;
            answer += b;
        }
        System.out.println(answer);
    }
}
