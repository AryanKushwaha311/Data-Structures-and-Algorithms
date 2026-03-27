package Recurssion.Lecture_01;

/*
point to be noted here is that if all these functions have the same body and doing the same things then why
are we creating this functions again and again.(only we are doing here is taking a number , printing a number
and calling a number).
That's why RECURRSION come into the picture to replace this repeating thing.
*/

public class numberExample {
    static void message(){
        System.out.println("Hello World ");
        message1();
    }
    static void message1() {
        System.out.println("Hello World 1");
        message2();
    }
    static void message2() {
        System.out.println("Hello World 2");
        message3();
    }
    static void message3() {
        System.out.println("Hello World 3");
        message4();
    }
    static void message4() {
        System.out.println("Hello World 4");

    }
    static void print(int n){
        System.out.println(n);
    }
    public static void main(String[] args) {

        message();
    }
}
