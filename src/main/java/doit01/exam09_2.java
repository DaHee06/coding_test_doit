package main.java.doit01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static main.java.doit01.exam09.Add;
import static main.java.doit01.exam09.Remove;

/**
 * DMA 비밀번호
 * 1. 4개의 문자
 * 2. 특정 문자 개수 추가
 *
 * 투 포인터
 */
public class exam09_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //DNA 문자열 길이
        int M = Integer.parseInt(st.nextToken()); //부문 문자열 길이

        char[] A = new char[N];
        A = br.readLine().toCharArray();

        int[] checkArr = new int[4];
        int [] myArr = new int[4];
        int checkNum = 0 ;
        int result = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<4;i++){
            checkArr[i] = Integer.parseInt(st.nextToken());
            if(checkArr[0] == 0){
                checkNum++;
            }
        }

        for(int i = 0 ; i<M ; i++){
            Add(A[i]);
        }

        if(checkNum == 4){
            result++;
        }

        for(int i = M ; i < N ;i ++){
            int j = i -M;
            Add(A[i]);
            Remove(A[j]);
            if(checkNum == 4){
                result++;
            }
        }

        System.out.println(result);
        br.close();
    }




}
