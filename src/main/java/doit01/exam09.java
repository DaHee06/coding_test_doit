package main.java.doit01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 슬라이딩 윈도우
 * S : 받은 문자열 크기 -> A : 문자열 데이터
 * P : 부분 문자열 크기
 * checkArr : 비밀번호 체크 배열
 * myArr : 현재 상태 배열
 * checkSecret : 몇개의 문자와 관련된 개수를 충족했는지 판단하는 변수
 * 유효한 비밀번호 확인하기
 *
 */
public class exam09 {
    static int[] checkArr = new int[4];
    static int[] myArr = new int[4];
    static int checkSecret = 0;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(br.readLine()); // 받은 문자열
        int P = Integer.parseInt(br.readLine()); // 부문 문자열
        char[] A = new char[S];
        A = br.readLine().toCharArray(); // 받은 라인에 대해 char 배열로 반환
        checkArr = new int[4];
        myArr = new int[4];
        checkSecret = 0;
        int result = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 4 ; i++ ){
            checkArr[i] = Integer.parseInt(st.nextToken());
            //만약 0 이라면 이미 조건을 만족했기 때문에 추가하기
            if(checkArr[0] == 0){
                checkSecret++;
            }
        }
        for(int i =0; i<P ; i++){
            Add(A[i]);
        }
        if(checkSecret == 4){
            result++;
        }

        //슬라이딩 윈도우 처리  -- index 처리
        //i = end_index , j = start_index
        for(int i = P ; i < S ; i++){
            int j = i - P ;
            Add(A[i]);
            Remove(A[j]);
            if(checkSecret == 4){
                result++;
            }
        }

        System.out.println(result);
        br.close();


    }
    static void Add(char ch){
        switch (ch){
            case 'A':
                myArr[0]++;
                if (myArr[0] == checkArr[0]) {
                    checkSecret++;
                }
            case 'C' :
                myArr[1]++;
                if(myArr[1] == checkArr[1]){
                    checkSecret++;
                }
            case 'G' :
                myArr[2]++;
                if(myArr[2] == checkArr[2]){
                    checkSecret++;
                }
            case 'T' :                myArr[3]++;
                if(myArr[3] == checkArr[3]){
                    checkSecret++;
                }
        }
    }

    static void Remove(char ch){
        switch (ch){
            case 'A':
                myArr[0]--;
                if (myArr[0] == checkArr[0]) {
                    checkSecret--;
                }
            case 'C' :
                myArr[1]--;
                if(myArr[1] == checkArr[1]){
                    checkSecret--;
                }
            case 'G' :
                myArr[2]--;
                if(myArr[2] == checkArr[2]){
                    checkSecret--;
                }
            case 'T' :
                myArr[3]--;
                if(myArr[3] == checkArr[3]){
                    checkSecret--;
                }
        }
    }


}
