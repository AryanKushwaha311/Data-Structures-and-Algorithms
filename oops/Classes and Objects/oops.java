package _11_OOPS.Lecture_1;

class Student{
    int age;
    String name;
    float marks;

    //Constructor
//    Student(){
//
//    }
    Student(int ummar,String naam, float aank){
        this.age = ummar;
        this.name = naam;
        this.marks = aank;
    }
}
public class oops {
    public static void main(String[] args) {
//        System.out.println(age);
//        Student students = new Student();
//        System.out.println(students.name);
//        System.out.println(students.age);
        Student kunal = new Student(21,"kunal",89);
        Student Aryan = new Student(21,"Aryan",99);

//        System.out.println(Aryan.marks);


    }
}
