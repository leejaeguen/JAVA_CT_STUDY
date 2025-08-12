package sec03.exam01;

import java.util.Scanner;

public class starDot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char[][] arr = new char[4*(n-1) + 1][4*(n-1) + 1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ' ';
            }
        }
        star(0, arr, n);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void star(int start, char[][] array, int n){
        if(n <= 0) return;
        for (int i = start; i < start + 4*(n-1) + 1; i++) {
            array[start][i] = '*';
            array[i][start] = '*';
            array[start + 4*(n-1)][i] = '*';
            array[i][start + 4*(n-1)] = '*';
        }
        star(start+2, array, n-1);
    }
}

