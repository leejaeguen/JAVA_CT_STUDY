import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int K = sc.nextInt();
        if (K == 1){
            System.out.println(4);
            return;
        }

        long a = 1;
        long b = 1;
        for (int i = 3; i <= K; i++) {
            long c = a + b;
            a = b;
            b = c;
        }

        long result = 4 * b + 2 * a;
        System.out.println(result);

    }
}
