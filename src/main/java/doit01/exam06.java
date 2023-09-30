package main.java.doit01;

import java.util.Scanner;

public class exam06 {
    public static void main(String[] args) {
        int count = 1;
        int sum = 1;
        int start_index = 1;
        int end_index = 1;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while ( end_index != N){
            if(sum == N){
                sum = sum + end_index;
                end_index++;
                count++;
            }else if(sum > N){
                start_index++;
                sum = sum - start_index;
            }else{
                end_index++;
                sum = sum + end_index;
            }
        }
        System.out.println(count);
    }
}
