package _07_Searching.Linear_Search;
//MINIMUM NUMBER

public class LinearSearch_06 {
    static int min(int[] arr) {
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr2={18,22,4,72,1,56};
        int minimum=min(arr2);
        System.out.println(minimum);
    }
}
