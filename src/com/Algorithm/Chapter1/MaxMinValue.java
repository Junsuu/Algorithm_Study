package com.Algorithm.Chapter1;

import java.util.Scanner;

public class MaxMinValue {
    // 연습문제 Q1
    static int max4(int a , int b, int c,int d){
        int max = 0;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();

        max = a;

        if(max < b){
            max = b;
        }
        if(max < c){
            max = c;
        }
        if(max < d){
            max = d;
        }
        return max;
    }

    // 연습문제 Q2
    static int min3(int a , int b, int c,int d){
        int min = 0 ;


        return min;
    }

    // 연습문제 Q3
    static int min4(int a , int b, int c,int d){

    }
}
