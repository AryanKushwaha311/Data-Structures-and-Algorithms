package _07_Searching.Linear_Search;

import java.util.Scanner;
//SEARCH THE TARGET AND RETURN TRUE or FALSE
public class LinearSearch_04 {
    static boolean linearSearch(String str,char target){
        if (str.length()==0){
            System.out.println("-1");
            return false;
        }

        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i) == target){
                System.out.println(str.charAt(i));
                System.out.println(i);
                return true;
            }
        }
        System.out.println("target wasn't find");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        char target=sc.next().charAt(0);
        System.out.println(linearSearch(str,target));
//        linearSearch(arr,target);
    }
}
