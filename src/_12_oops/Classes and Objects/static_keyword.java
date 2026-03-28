package _11_OOPS.Lecture_1;
class Human{
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    public Human(int age, String name , int salary , boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
//        this.population += 1; // works but not recommended
        Human.population +=1; //recommended
    }
}

public class static_keyword {
    public static void main(String[] args) {
        Human Kunal = new Human(21,"naman",23000,true);
        Human Aryan = new Human(21,"aryan",23000,true);
//        System.out.println(Kunal.population); // still works but not recommended
        System.out.println(Human.population); // recommended
    }
}



