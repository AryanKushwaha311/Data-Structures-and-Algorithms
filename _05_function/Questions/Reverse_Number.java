package _05_function.Questions;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int r=0;

        while(n>0){
            int d=n%10;
            r=r*10+d;
            n/=10;
        }
        System.out.println(r);
    }
}
