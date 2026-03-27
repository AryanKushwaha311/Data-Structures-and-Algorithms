package _06_Sorting;

import java.util.Scanner;

public class primeNumber {
    static void prime(int num){
            int result=0;
            for (int i=2;i<num;i++){
                if(num%i==0){
                    result++;
                }
            }

            if(result==0){
                System.out.println("prime");
            }
            else{
                System.out.println("not prime");
            }





    }
    public static void main(String[] args) {
        prime(2);
    }
}
