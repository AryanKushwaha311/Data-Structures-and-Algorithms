import java.util.Scanner;

public class switch_case {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            // String fruit=input.nextLine();

            // switch(fruit){
            //     case "Mango"->System.out.println("King of the fruits");
            //     case "apple"->System.out.println("King of the fruits");
            //     case "banana"->System.out.println("King of the fruits");
            //     case "orange"->System.out.println("King of the fruits");
            //     default->System.out.println("give the valid input......");
            // }

            int days=input.nextInt();
            switch(days){
                case 1->System.out.println("Monday");
                case 2->System.out.println("Tuesday");
                case 3->System.out.println("Wednesday");
                case 4->System.out.println("Thursday");
                case 5->System.out.println("Friday");
                case 6->System.out.println("Saturday");
                case 7->System.out.println("Sunday");
                default->System.out.println("give valid input....");
            }
        }
}
