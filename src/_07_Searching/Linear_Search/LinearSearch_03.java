package _07_Searching.Linear_Search;

import java.util.Scanner;

public class LinearSearch_03 {
    static void linearSearch(String str,char target){
        if (str.length()==0){
            System.out.println("-1");
            return;
        }

        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i) == target){
                System.out.println(str.charAt(i));
                System.out.println(i);
                return;
            }
        }
        System.out.println("target wasn't find");
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        char target=sc.next().charAt(0);
        linearSearch(str,target);
//        linearSearch(arr,target);
    }
}
