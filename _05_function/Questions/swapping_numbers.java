package _05_function.Questions;

import java.util.Scanner;

public class swapping_numbers {
    static void swap(int a , int b){
        int temp = b;
        b=a;
        a=temp;
        System.out.println(a);
        System.out.println(b);
    }

    static void swap2(int a,int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }

    static void add(int... a){
        int sum = 0;
        for(int num: a){
            sum+=num;
        }
        System.out.println(sum);
    }
    static int a =10;
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("a: ");
//        int a = input.nextInt();
//        System.out.print("b: ");
//        int b = input.nextInt();

        add(2,3,4,5);
//        System.out.println(a);
//        swap2(a,b);
    }
}
