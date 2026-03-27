package _05_function.Questions;

import java.util.Scanner;

public class fabonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count=2;

        if (n == 0) {
            System.out.println(0);
            return ;
        }
        else if (n == 1) {
            System.out.println(1);
            return;
        }

        while (count <= n) {
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        System.out.println(b);

    }

}
