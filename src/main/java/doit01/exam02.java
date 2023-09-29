package main.java.doit01;

import java.util.Scanner;

public class exam02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int p[] = new int[N];
        for(int i=0;i<N;i++){
            p[i] = sc.nextInt();
        }
        long max = p[0];
        long sum = 0;
        for(int i = 1; i<p.length;i++){
            if(max < p[i]){
                max = p[i];
            }
            sum += p[i];
        }
//        int sum = 0;
//        for(int i = 0; i<p.length;i++){
//            sum += p[i];
//        }
        sum = sum*100/max/N;
        System.out.println(sum);
    }
}
