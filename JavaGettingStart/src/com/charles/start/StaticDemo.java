package com.charles.start;

public class StaticDemo {

    public static int abs(int x)
    {
        if (x < 0) {
            return -x;
        }
        else {
            return x;
        }
    }

    //计算直角三角形的斜边
    public static double hypotenuse(double a, double b) {
        return Math.sqrt(a*a + b*b); //java的Math包
    }

    public static void main(String[] args){
        int n = -17;
        double hyp;

        n = abs(n);
        System.out.println(n);

        hyp = hypotenuse(3.0, 4.1);
        System.out.println(hyp);
    }
}
