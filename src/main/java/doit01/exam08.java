package main.java.doit01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class exam08 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine()); // 숫자 개수
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[N];  //long
            for(int i = 0 ; i < arr.length ; i ++){
                arr[i] = Integer.parseInt(st.nextToken()); // 배열에 저장 //long
            }
            Arrays.sort(arr);
            int count = 0;
            for(int i = 0 ; i<N ; i++){
//                int K = i ;
                int K = arr[i];
                int s = 0;
                int j = N - 1;
                while(s < j) {
                    if (arr[s] + arr[j] == K) {
//                        if(arr[s] != K && arr[j] != K){
//                            count++;
//                            break;
//                        }else{
//                            s++;
//                            j--;
//                        }
                        //두 수가 달라야 함을 체크
                        if(s != i && j != i){
                            count++;
                            break;
                        }else if(s == i){
                            s++;
                        }else{
                            j--;
                        }
                    } else if (arr[s] + arr[j] < K) {
                        s++;
                    } else {
                        j--;
                    }
                }
            }
            System.out.println(count);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
