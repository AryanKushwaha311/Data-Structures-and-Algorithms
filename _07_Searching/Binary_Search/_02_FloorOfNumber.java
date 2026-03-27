package _07_Searching.Binary_Search;

import java.util.Scanner;

public class _02_FloorOfNumber {
    static int search(int[] arr,int tar){
        int start=0;
        int end=arr.length-1;

        if(tar>arr[end]){
            System.out.println("Target is Array Out of bound");
            return -1;
        }

        while(start<=end){
            int mid =start+(end-start)/2;
            if (arr[mid]>tar) {
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return arr[end];
    }

    public static void main(String[] args) {
        System.out.print("size of row is: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        int[] arr= new int[row];
        for (int i = 0; i < row; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.print("target is: ");
        int target=sc.nextInt();

        int ans=search(arr,target);
        System.out.println(ans);

    }
}
