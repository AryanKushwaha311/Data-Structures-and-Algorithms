package _07_Searching.Binary_Search;

import java.util.Arrays;

public class _04_firstAndLast {
    static  int secondPosition(int[] arr,int target){
        if(arr==null|| arr.length==0){
            return -1;
        }
        int second_value=-1;
        int start=0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid]==target){
                second_value=mid;
                start=mid+1;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        }

        return second_value;
    }
    static int[] Position(int[] arr,int target){
        if(arr==null || arr.length==0){
            return new int[]{-1,-1};
        }
        int first_value=-1;
        int second_value=secondPosition(arr,target);

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid]==target){
                first_value=mid;
                end=mid-1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return new int[]{first_value,second_value};
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,3,5,8};
        int target=3;
        int[] result=Position(arr,target);
        System.out.println(Arrays.toString(result));
    }
}
