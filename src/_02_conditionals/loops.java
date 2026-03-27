import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // for(int i =1;i<=10;i++){
        //     System.out.println("hello world");
        // }

        //find the largest of three numbers?????
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();

        // if((a>b) && (a>c)){
        //     System.out.println(a);
        // }
        // if((b>a)&&(b>c)){
        //     System.out.println(b);
        // }

        // else{
        //     System.out.println(c);
        // }

        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max) {
            max=c;
        }
        System.out.println(max);
    }
    
}
