package _11_OOPS.Lecture_3;

class A{
    String name = "Aryan";
    A(){
        System.out.println("this is parent class constructor");
    }
    public void show(){
        System.out.println("this is a parent method");
    }
}

class B extends A{
    String name = "Kushwaha";

    B(){
        super();
        System.out.println("This is child class constructor ");
    }

    public void printName(){
        System.out.println(super.name);
        System.out.println(this.name);
        System.out.println(name);
    }

    public void show(){
        super.show();
        System.out.println("this is child method");
    }
}        

public class super_key{
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.printName();

    }   
}
