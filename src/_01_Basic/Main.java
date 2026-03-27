import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("value of num1 :");
        int num1 = input.nextInt();
        System.out.println("value of num2 :");
        int num2=input.nextInt();
        
        int sum=num1+num2;
        System.out.println("sum of num1 and num2 is "+sum);

    }
}