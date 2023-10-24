package main.java.doit01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class exam14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> MyQueue = new PriorityQueue<>((o1,o2) ->
        {
            int first_os = Math.abs(o1);
            int sencond_os = Math.abs(o2);
            if(first_os == sencond_os) return o1 - o2; //오름차순
            else return first_os - sencond_os; //절대값 리턴
        }
        );
        for(int i = 0; i < N ;i++){
            int request = Integer.parseInt(br.readLine());
            if(request == 0){
                    if(MyQueue.isEmpty()) {
                        System.out.println("0");
                    }
                    else{
                        System.out.println(MyQueue.poll());
                    }
                }
            else{
                MyQueue.add(request);
            }
        }

    }
}
