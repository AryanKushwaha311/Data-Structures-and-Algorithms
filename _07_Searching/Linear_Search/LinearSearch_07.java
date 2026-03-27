//package _07_Searching.Linear_Search;
////SEARCH IN 2D ARRAY
//import java.util.Scanner;
//
//public class LinearSearch_07 {
//    static void Search(int[][] arr,int target){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j <arr[i].length ; j++) {
//                if(arr[i][j]==target){
//                    System.out.println(i+" "+j);
//                    System.out.println(arr[i][j]);
//                    return;
//                }
//            }
//        }
//        System.out.println("not found");
//    }
//
//    public static void main(String[] args) {
////        int[][] arr={
////                {23,1,2,33},
////                {11,2,3},
////                {78,99,22,11},
////                {12,312}
////        };
////        int target=99;
////        Search(arr,target);
//        Scanner sc = new Scanner(System.in);
//        System.out.print("size of row ");
//        int rsize=sc.nextInt();
//        System.out.print("size of column ");
//        int csize=sc.nextInt();
//
//        int[][] arr= new int[rsize][csize];
//        for (int i = 0; i < rsize; i++) {
//            for (int j = 0; j < csize; j++) {
//                arr[i][j]=sc.nextInt();
//            }
//        }
//
//        System.out.println("Searching value: ");
//        int target=sc.nextInt();
//
//        Search(arr,target);
//
//    }
//}
