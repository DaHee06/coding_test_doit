package main.java.doit01;

import java.io.*;
import java.util.Stack;

public class exam12 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] A = new int[n];  // 제시되는 수열
        int[] ans = new int[n]; //정답 수열
        String[] str = bf.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(str[i]);
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(0); //인덱스 기본값 넣기 , push 하여 초기화
        for(int i = 0 ; i < A.length;i++){
            //stack이 비어있지 않고 현재 수열이 스택 top 인덱스와 비교하여 수열 저장
            while(!stack.isEmpty() && A[i] > A[stack.peek()]){
                ans[stack.pop()] = A[i];
            }
            stack.push(i); //신규 인덱스 넣기
        }
        while(!stack.isEmpty()){
            ans[stack.pop()] = -1; //최종값 비교 값 없으므로 -1
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++) {
            bw.write(ans[i] + " ");
            // 출력한다
        }
        bw.write("\n");
        bw.flush();

    }
}
