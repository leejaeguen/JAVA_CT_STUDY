import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int M = sc.nextInt();

        Set<String> set = new HashSet<>();

        for (int i = 0; i < S; i++) {
            set.add(sc.next());
        }

        int result = 0;

        for (int i = 0; i < M; i++) {
            if (set.contains(sc.next())) {
                result++;
            }
        }

        System.out.println(result);
    }
}