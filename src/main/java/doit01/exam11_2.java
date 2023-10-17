package main.java.doit01;

import java.util.Scanner;
import java.util.Stack;

public class exam11_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0 ; i< A.length;i++){
            A[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        StringBuffer sf = new StringBuffer();
        int num = 1;
        boolean isNo = true;
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= num) {
                while (A[i] >= num) {
                    stack.push(num++); //후치 연산자 : num 값을 사용한 뒤에 1을 증가시킴
                    sf.append("+\n");
                }
                stack.pop();
                sf.append("-\n");
            } else { //A[i] < num
                int n = stack.pop();
                if(n > A[i]){
                    System.out.println("NO");
                    break;
                }
                else{
                    sf.append("-\n");
                }
            }
        }
        if (isNo) System.out.println(sf.toString());
    }
}
