package sec03.exam01;

import java.util.*;

public class tile {
    public static void main(String[] args) {
        long round = 0;
        Scanner sc = new Scanner(System.in);
        int tile = sc.nextInt();

        ArrayList<Long> arr = new ArrayList<>();
        arr.add(1L);

        while(arr.size() < tile) {
            if(arr.size() > 1 && arr.size() < 81) arr.add((long)arr.get(arr.size() - 1) + arr.get(arr.size() - 2));
            else arr.add(1L);
        }

        if(arr.size() > 1) {
            round = (arr.get(arr.size() - 1) + arr.get(arr.size() - 2)) * 2 + arr.get(arr.size() - 1) * 2;
        }
        else{
            round =  arr.get(arr.size() - 1) * 4;
        }

        System.out.println(round);
    }

}
