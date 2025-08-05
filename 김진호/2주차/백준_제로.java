import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int K;  // 입력 받는 숫자 개수
        int j=0; //
        int an=0;
        int a=0;

        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();


        int [] answer = new int[K];

        for (int i = 0; i < K; i++)
        {
            a = sc.nextInt();

            if(a==0) //입력 받은 수가 0인 경우
            {
                answer[i-1]=0;
                j--;
            }

            else  //입력 받은 수 가 0이 아닌경우
            {
                answer[j++]=a;

            }
        }


        for (int i = 0; i < j; i++)
        {
            an+=answer[i];
        }

        System.out.print(an);
    }
}
