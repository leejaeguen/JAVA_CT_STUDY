package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int N=0;

        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();

        List<Long> l=new ArrayList<>();

        l.add(1L);
        l.add(1L);

        for(int i=2; i<=N ;i++)
        {
            l.add(l.get(i-2)+l.get(i-1));
        }

        long result = 2 * (l.get(N-1) + l.get(N));
        System.out.print(result);

    }
}
