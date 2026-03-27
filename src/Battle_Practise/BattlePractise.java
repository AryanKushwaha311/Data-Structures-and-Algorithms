import java.util.Arrays;
import java.util.Scanner;

public class BattlePractise{
    

    // Question - 12
    public static int[] zeroAtEnd(int[] arr){
        int j = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[arr.length-1-j];
                arr[arr.length - 1] = temp;
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {11,0,22,0,33,0,0,44};
        int[] result = zeroAtEnd(arr);
        System.out.println(Arrays.toString(result));
    }
}