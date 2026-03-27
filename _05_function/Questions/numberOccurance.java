package _05_function.Questions;

import java.util.Scanner;

public class numberOccurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int f = input.nextInt();
        int count = 0;

        while(n>0){
            if(n%10==f){
                count++;
                n/=10;    //remove last digit'
                System.out.println("Infinite loop");
            }
            else{
                n/=10;   //remove last digit
            }
        }
        System.out.println("Then number of occurance is :"+ count);
    }
}
