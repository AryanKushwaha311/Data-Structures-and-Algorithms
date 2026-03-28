import java.util.Arrays;
import java.util.Scanner;

public class BattlePractise{
    // Question - 1
    public static String lowerToUpperCase(String str){
        str=str.toLowerCase();
        String newStr = "";

        for (int i = 0;  i< str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 97 || ch <= 122){
                ch = (char)(ch - 32);
                newStr = newStr + ch;
            }
        }
        return newStr;
    }

    //Question-2
    public static void countFreq(String str){
        int max = Integer.MIN_VALUE;
        char freq = ' ';

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count > max){
                max = count;
                freq =str.charAt(i);
            }
        }
        System.out.println("Alphabet that appears most: "+freq);
        System.out.println("Number of time it appears: "+max);
    }
    public static void main(String[] args) {

        countFreq("aryananynannn");

    }
}