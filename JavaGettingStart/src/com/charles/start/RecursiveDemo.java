package com.charles.start;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveDemo {
    public static int rank(int key, int[] a)
    {
        return rank(key, a, 0, a.length-1);
    }

    public static int rank(int key, int[] a, int lo, int hi)
    {
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return rank(key, a, lo, mid - 1);
        else if (key >a[mid]) return rank(key, a, mid + 1, hi);
        else return mid;
    }

    public static void main(String[] args)
    {
        int N = 3;
        int[] whitelist;
        whitelist = new int[N];
        int i;
        Scanner sc = new Scanner(System.in);
        int key;

        for (i = 0; i < whitelist.length; i ++)
        {
            System.out.printf("pls enter a digital(%d/%d)\n", i + 1, whitelist.length);
            if ( !sc.hasNextInt() )
            {
                System.out.println("Input error,Game over.\n");
                return;
            }
            whitelist[i] = sc.nextInt();
        }

        //sort the array.
        Arrays.sort(whitelist);

        for (i = 0; i < whitelist.length; i ++)
        {
            System.out.println(whitelist[i]);
        }

        //enter the key.
        System.out.println("pls enter the key.");
        if ( !sc.hasNextInt() )
        {
            System.out.println("key error,Game over.");
            return;
        }

        key = sc.nextInt();

        if (rank(key, whitelist) < 0)
        {
            System.out.printf("The key %d is not in the whitelist.\n", key);
            return;
        }

        System.out.println("The key is in the whitelist.");
    }

}
