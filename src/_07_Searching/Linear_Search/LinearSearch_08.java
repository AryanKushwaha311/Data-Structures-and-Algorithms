package _07_Searching.Linear_Search;

public class LinearSearch_08 {
    static int linearSearch(int[][] arr){
        int max=arr[0][0];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(linearSearch(arr));
    }
}
