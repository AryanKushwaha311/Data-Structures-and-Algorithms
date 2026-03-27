import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        int i=2;
        int result=0;
        while(i<number){
            if(number%i==0) {
                result++;
            }
            i++;
        }
        if(result==0){
            System.out.println(number+" is a prime number");
        }
        else{
            System.out.println(number+" is not a prime number");
        }

    }
}