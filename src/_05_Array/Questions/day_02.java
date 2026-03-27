package _05_Array.Questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class day_02 {
    static int[] idx_even(int[] arr){
        int size = (arr.length+1)/2;
        int arr2[] = new int[size];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if((i&1)==0){
               arr2[j]=arr[i];
               j++;
            }
        }
        return arr2;
    }
    static int count(int[] arr,int X){
        int count=0;
        int max = X;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                count++;
            }
        }
        return count;
    }
    static int[] negative_array(int[] arr){
        int[] arr2 = new int[arr.length];
        int j =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0){
                arr[i]=0;
            }
            arr2[j]=arr[i];
            j++;
        }
        return arr2;
    }
    static boolean sorted(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1]>arr[i]) {
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    static void reverse(int[] arr){
        for (int i = arr.length-1; i >=0; i--) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        reverse(new int[]{11,22,33,44,55});
    }
}
