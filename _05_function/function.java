import java.util.Scanner;

public class function {
    static int sum(int a,int b){
        return a+b;
    }

    static void swap(int a,int b){
        int temp=b;
        b=a;
        a=temp;
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x =input.nextInt();
        int y=input.nextInt();
//        System.out.println(sum(a,b));

        System.out.println(x+" "+y);
        swap(x,y);
    }
}