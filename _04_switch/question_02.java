import java.util.Scanner;

public class question_02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int days=input.nextInt();
        

        switch(days){
            case 1->System.out.println("Aryan kushhwaha");
            case 2->System.out.println("Arav singh");
            case 3->{

                System.out.println("Which department you want:");
                String department=input.nextLine();
                switch(department){
                    case "IT"->System.out.println("This Student is from IT department");
                    case "CSE"->System.out.println("This Student is from CSE department");
                    case "ECE"->System.out.println("This Student is from ECE department");
                    case "AIML"->System.out.println("This Student is from AIML department");
                }
            }
            default->System.out.println("error");
        }
    }    
}
