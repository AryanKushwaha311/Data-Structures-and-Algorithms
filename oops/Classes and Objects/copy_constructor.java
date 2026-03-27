package _11_OOPS.Lecture_1;

class Aryan {
    int age;
    String name;

    Aryan(){
        this(21,"Naman");
        System.out.println("Default Constructor");
    }
    Aryan(int age,String name){
        this.name = name;
        this.age=age;
        System.out.println("Parametrized constructor");
    }
//    Aryan(Aryan s){
//        this.name=s.name;
//        this.age=s.age;
//    }
}
public class copy_constructor {
    public static void main(String[] args) {
        Aryan s1 = new Aryan();

        int a;
        a=20;

        Integer obj = 10;
//        obj.
    }
}
