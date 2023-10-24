package main.java.doit01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exam13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> qu = new LinkedList<>();
        int N = sc.nextInt();
        for(int i = 1;i<=N;i++){
            qu.add(i);
        }
        while(qu.size()>1){
            qu.poll();
//            int m = qu.poll();
//            qu.add(m);

            qu.add(qu.poll());
        }
        System.out.println(qu.poll());
    }
}
