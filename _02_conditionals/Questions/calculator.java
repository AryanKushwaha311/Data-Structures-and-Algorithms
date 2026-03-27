import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while (true) {
            System.out.println("Valid operators : +,-,*,/,%");
            if(input.hasNext("[xX]")){
                System.out.println("Existing calculator");
                break;
            }

            int a =input.nextInt();
            int b =input.nextInt();
            int result=0;
            String operator=input.next();
            if(operator=="+"){
                result=a+b;
            }
            else if(operator=="-"){
                result=a-b;
            }
            else if(operator=="*"){
                result=a*b;
            }
            else if(operator=="/"){
                result=a/b;
            }
            else if(operator=="%"){
                result=a%b;
            }
            System.out.println("Answer: "+result);
        }
    }
}
