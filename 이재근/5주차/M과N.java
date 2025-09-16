import java.util.Scanner;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();

        int[] arr = new int[M];
        method(0, M, N, arr);
        System.out.print(sb);
    }

    private static void method(int cnt, int M, int N, int[] arr) {
        if (cnt == M) {
            for (int i = 0; i < M; i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }
        for (int i = 1; i <= N; i++) {
            arr[cnt] = i;
            method(cnt + 1, M, N, arr);
        }
    }
}