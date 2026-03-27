package _05_Array.Questions;

import java.util.Arrays;

public class day_01 {
    static void allElement(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static int[] reverse(int[] arr){
        int[] arr2=new int[arr.length];
        int j =0;
        for (int i = arr.length-1; i >=0 ; i--) {
            arr2[j]=arr[i];
            j++;
        }
        return arr2;
    }
    static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }
    static int max(int[] arr ){
        int max= arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int[] evenOdd(int[] arr){
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i]&1)==0){
                even++;
            }
            else{
                odd++;
            }
        }
        return new int[]{even,odd};
    }
    static boolean linearSeach(int[] arr , int target){
        if (arr==null || arr.length==0){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return true;
            }
        }
        return false;
    }
    static float avgNum(int[] arr){
        int count = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
            count++;
        }
        float avg = (float)(sum/count);
        return avg;
    }

    public static void main(String[] args) {
        float ans = avgNum(new int[]{11,22,33,44,55,66});
        System.out.println(ans);
//        int ans = max(new int[]{91,122,133,44});
//        System.out.println(ans);
//        int[] arr = {11,22,33,44,55};
//        int[] ans = reverse(arr);
//        System.out.println(Arrays.toString(ans));

//        int ans = sum(new int[]{11,22,33});
//        System.out.println(ans);

//        allElement(new int[]{11,22,33,44});
    }
}

