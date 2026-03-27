package _07_Searching.Binary_Search;

import java.util.Scanner;

public class _03_SmallestLetter {
    static char search(char[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        if(start==arr.length){
            return arr[0];
        }
        return arr[start];
    }
    public static void main(String[] args) {
        char[] arr = {'a','b','c','e'};
        char target = 'd';
        char ans = search(arr,target);
        System.out.println(ans);
    }
}
