package _07_Searching.Binary_Search;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class _06_firstAndLast_Infinite {
    static int BinarySearch(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        while(start<=end){
            int mid= start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static int search(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return BinarySearch(arr,target,start,end);
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,4,4,4,5};
        int target = 4;

        int ans = search(arr, target);
        System.out.println("Position of " + target + " is: " + ans);


    }
}
