// import java.util.Scanner;

// public class _01_CeilingOfNumber {
//     static int search(int[] arr,int tar){

//         int start=0;
//         int end=arr.length-1;
//         // Edge case: if target > largest element → no ceiling
//         if (tar > arr[end]) {
//             return -1;
//         }
//         boolean isAsc=arr[start]<arr[end];
//         while (start<=end){
//             int mid = start+(end-start)/2;
//                 if(isAsc){
//                     if (arr[mid]>tar) {
//                         end=mid-1;
//                     }else{
//                         start=mid+1;

//                     }
//                 }
//                 else{
//                     if(arr[mid]==tar){
//                         return arr[mid];
//                     } else if (arr[mid]<tar) {
//                         start=mid+1;
//                     }else{
//                         end=mid-1;
//                     }

//             }

//         }
//         return arr[start];
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("size of row:");
//         int row=sc.nextInt();
//         int[] arr =  new int[row];

//         for (int i = 0; i < row; i++) {
//             arr[i]=sc.nextInt();
//         }

//         int target=sc.nextInt();
//         int ans=search(arr,target);
//         System.out.println(ans);

//     }
// }