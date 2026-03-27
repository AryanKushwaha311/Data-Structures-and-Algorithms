package _05_Array.Questions;

import java.util.Arrays;

public class day_03 {
    static int countFreq(int[] arr,int target){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                count++;
            }
        }
        return count;
    }
    static int mostFreq(int[] arr){
        int maxCount=0;
        int maxFreq = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j <arr.length ; j++) {
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>maxCount){
                maxFreq=arr[i];
                maxCount=count;
            }
        }
        return maxFreq;
    }
    static int leastFreq(int[] arr){
        int minCount=Integer.MAX_VALUE;
        int minElement=arr[0];
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            if(count<minCount){
                minCount=count;
                minElement=arr[i];
            }
        }
        return minElement;
    }
    static int[] rem_duplicate(int[] arr){
        int[] arr2 = new int[arr.length];
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>1){
                for (int j = 0; j <=count; j++) {
                    arr[i]=arr[i]/10;
                }
            }
            arr2[k]=arr[i];
            k++;
        }
        return arr2;
    }
    public static void main(String[] args) {
        int[] result = rem_duplicate(new int[]{11,22,22,33,44,33,44,55});
        System.out.println(Arrays.toString(result));
//        int result = leastFreq(new int[]{11,33,33,33,11,11,11});
//        System.out.println(result);
//        int result = countFreq(new int[]{1,2,3,42,2,2,3,5,2},2);
//        System.out.println(result);
//        int result = mostFreq(new int[]{22,22,11,11,2,11,22});
//        System.out.println(result);
    }
}
