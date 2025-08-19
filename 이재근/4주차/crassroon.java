import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int result = 0;

        List<Integer> arr = new ArrayList<>();
        arr.add(0);
        for (int i = 0; i < N; i++) {
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);

        List<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr2.add(arr.get(i + 1) - arr.get(i));
        }

        Collections.sort(arr2);

        for (int i = 0; i < K; i++) {
            arr2.remove(arr2.size() - 1);
        }

        for (int num : arr2) {
            result += num;
        }
        System.out.println(result);
    }
}