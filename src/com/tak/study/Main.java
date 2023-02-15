package com.tak.study;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //입력하고싶은 개수
        int N = sc.nextInt();

        //입력한 N만큼 값을 담을 배열
        int[] arr = new int[N];

        //값을 다 합칠 0 변수 선언
        int all = 0;

        //입력한 N만큼 반복
        for (int i = 0; i < N; i++) {

            arr[i] = sc.nextInt();

            all += arr[i];

        }

        System.out.println(all);
    }

//      함수를 구현하는 것이므로 정답은 아래 코드
//    long sum(int[] a) {
//        long sum = 0;	// a 배열 정수 합 변수
//
//        for(int i = 0; i < a.length; i++) {
//            sum += a[i];
//        }
//        return sum;
//    }


}
