package _11_Maths_For_DSA.Part_01;

public class Question_01 {
    public static String checkEvenOdd(int n){
        if ((n&1) == 0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }
    public static void main(String[] args) {
        String result = checkEvenOdd(11);
        System.out.println(result);
    }
}
