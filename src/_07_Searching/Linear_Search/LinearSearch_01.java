package _07_Searching.Linear_Search;

import java.util.Scanner;

public class LinearSearch_01 {
    static void linearSearch(int[] arr,int target) {
        if (arr.length==0){
            System.out.println("-1");
            return;
        }
        for (int i = 0; i <arr.length ;i++) {
            if(arr[i]==target){
                System.out.println(i);
                return;
            }
        }
        System.out.println("Target wasn't found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();

        int[] arr=new int[size];
        for (int i = 0; i <size ; i++) {
            arr[i]=sc.nextInt();
        }

        int target=sc.nextInt();

        linearSearch(arr,target);
    }
}
