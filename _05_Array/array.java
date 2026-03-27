package _05_Arrays;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int [] arr=new int[5];
//
//        for(int i=0;i<arr.length;i++){
//            arr[i]=input.nextInt();
//        }
//
//        for (int num:arr){
//            System.out.println(num +" ");
//        }

//        int [] arr= new int[5];
//        arr[0]=23;
//        arr[1]=45;
//        arr[2]=233;
//        arr[3]=543;
//        arr[4]=4;
//
//        System.out.println(arr[3]);
//        System.out.println(arr);

        int[][] arr = new int[3][2];
        System.out.println(arr.length);

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }

        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}