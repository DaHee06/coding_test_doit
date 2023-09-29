package main.java.doit01;

import java.util.Scanner;

public class exam05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //원본 배열
        int M = sc.nextInt(); //합배열
        long[] S = new long[N];
        long[] C = new long[M];
        for(int i=0; i < S.length ; i++){
            S[i] = sc.nextInt();
        }
        for(int i=0;i<C.length;i++){
            C[i] = C[i-1] + S[i];
            C[i] /= M;
        }
        for(int i=0;i<C.length;i++){

        }
    }
}
