package com.charles.start;

public class ArrayDemo {

    public static void print_array_2(int x) {
        int M = 2;
        int N = 3;
        double [] [] a = new double[M][N];

        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                a[i][j] = i + j * 0.1;
                System.out.println(a[i][j]);
            }
        }

        System.out.printf("x is %X. \n", x);


    }

    public static void main(String[] args) {
        int N;
        N = 2;
        int i;
        double[] a;
        a = new double[N];

        for (i = 0; i < N/2; i++)
            a[i] = 1.1;
        for (i = N/2; i < N; i++)
            a[i] = 2.2;

        for (i = 0; i < N; i++) {
            System.out.println(a[i]);
        }

        print_array_2(0xF1);
    }

}
