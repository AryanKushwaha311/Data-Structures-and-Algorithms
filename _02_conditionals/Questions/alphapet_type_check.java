import java.util.Scanner;

public class alphapet_type_check {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        char ch=input.next().trim().charAt(0);

        if(ch>='a'&& ch<='z'){
            System.out.println(ch+" is Lowercase");
        }
        else{
            System.out.println(ch+" is Uppercase");
        }
    }
}
