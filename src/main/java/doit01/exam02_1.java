package main.java.doit01;

import java.util.Scanner;

public class exam02_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int p[] = new int[N];
        for(int i = 0; i < N; i++){
            p[i] = sc.nextInt();
        }

        int max = p[0];
        int sum = 0;
        for(int i = 0; i < N; i++){ // 인덱스 범위를 0부터 N-1까지로 수정
            if(max < p[i]){
                max = p[i];
            }
            sum += p[i];
        }


        sum = sum * 100 / N / max; // 계산 순서 수정
        System.out.println(sum);
    }



}
