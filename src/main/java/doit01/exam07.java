package main.java.doit01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//주몽
public class exam07 {
    public static void main(String[] args) throws IOException {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            int M = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < arr.length ; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr); //배열의 오름차순 정렬
            int start_index = 0;
            int end_index = N - 1;
            int count = 0;
            while ( start_index < end_index ) {  //start_index < end_index에만 진행되어야 함
                if(arr[start_index] + arr[end_index] > M){
                    end_index--;
                }else if(arr[start_index] + arr[end_index] < M){
                    start_index++;
                }else{
                    end_index--;
                    start_index++;
                    count++;
                }
            }
            System.out.println(count);
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
