import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] points = new int[N][2];

        for (int i = 0; i < N; i++){
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }

        Arrays.sort(points,(a,b) -> {
            if (a[0] == b[0]){
                return Integer.compare(a[1],b[1]);
            }else{
                return Integer.compare(a[0],b[0]);
            }
        });
        for (int[] point : points) {
            System.out.println(point[0] + " " + point[1]);
        }
    }
}