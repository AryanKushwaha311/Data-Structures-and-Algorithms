package _11_OOPS.Lecture_1;

class Students{
    String name;
    int rno;

    Students(String name){
        this.name = name;
    }
    Students(int id,String naam){
        rno=id;
        name=naam;
    }
//    void show(){
////        String name = "local variable";
//        System.out.println(name);
//        System.out.println(this.name);
//    }
}
public class this_keyword{
    public static void main(String[] args) {
        Students Aryan = new Students(21,"Kushwaha");
        System.out.println(Aryan.rno);
        System.out.println(Aryan.name);
    }
}
