import java.util.Scanner;

public class occurance {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int f=input.nextInt();
        int count=0;

        while(n>0){
            int digit=n%10;
            if(digit==f){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}

