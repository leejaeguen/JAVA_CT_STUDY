package org.example;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        Set<String> groups = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String w = br.readLine().trim();
            char[] arr = w.toCharArray();
            Arrays.sort(arr);
            groups.add(new String(arr));
        }

        System.out.println(groups.size());
    }

}