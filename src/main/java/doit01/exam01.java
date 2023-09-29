package main.java.doit01;

import java.util.Scanner;

public class exam01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();
        char[] ch = sNum.toCharArray();
        int answer = 0;
        for(int i = 0; i<ch.length;i++){
//            int num = Integer.parseInt(String.valueOf(ch[i]));
//            answer += num;
//            answer += ch[i] - '0';
            answer += ch[i] - 48;
        }
        System.out.println(answer);
    }

}
