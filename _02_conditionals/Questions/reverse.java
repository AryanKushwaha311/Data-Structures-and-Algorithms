import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int s=0;
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();

        while(n>0){
            int digit=n%10;
            s=s*10+digit;
            n=n/10;
        }
        System.out.println(s);
    }    
}
