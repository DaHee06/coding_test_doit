package main.java.doit01;

import java.io.*;
import java.util.Stack;

public class exam12_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] anw = new int[n]; //정답 수열
        for(int i =0;i<arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(0); // 인덱스 = 0 넣기
        for(int i = 1; i<arr.length ; i++){
            while(!stack.empty() && arr[stack.peek()] < arr[i]){
                anw[stack.pop()] = arr[i]; //stack에서 뺀 값을 anw
            }
            stack.push(i); //나머지 상황은 push
        }
        //최종 배열 순환 후 마지막 값 pop
        while(!stack.empty()){
            anw[stack.pop()] = -1;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i =0;i<n;i++){
            bw.write(anw[i] + " ");
        }
        bw.write("\n");
        bw.flush();

    }
}
