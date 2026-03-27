package Recurssion.Lecture_01;

import java.math.BigInteger;

public class Recurrsion {
    static long fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        long ans=fibo(100);
        System.out.println(ans);
    }
}
