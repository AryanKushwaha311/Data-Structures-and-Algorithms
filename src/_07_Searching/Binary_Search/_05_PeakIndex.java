package _07_Searching.Binary_Search;
//duplicate values are not allowed

import java.util.Scanner;

public class _05_PeakIndex {
    static int PeakIndexInMountainArray(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return arr[end];
    }
    public static void main(String[] args) {
        System.out.println("row size: ");
        Scanner sc = new Scanner(System.in);
        int row= sc.nextInt();

        int[] arr = new int[row];
        for (int i = 0; i < row; i++) {
            arr[i]=sc.nextInt();
        }

        int ans = PeakIndexInMountainArray(arr);
        System.out.println(ans);
    }
}


