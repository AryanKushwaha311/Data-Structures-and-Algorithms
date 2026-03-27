//package _07_Searching.Binary_Search;
//
//public class OrderAgnosticBS {
//    static int orderAgnosticBS(int[] arr,int target){
//        int start=0;
//        int end=arr.length-1;
//
//        boolean isAsc=arr[start]<arr[end];
//        while(start<=end){
//            int middle=start+(end-start)/2;
//            if(isAsc){
//                if (target<arr[middle]){
//                    end=middle-1;
//                } else if (target>arr[middle]) {
//                    start=start+1;
//                }else {
//                    target=middle;
//                }
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6};
//        int target=4;
//
//    }
//}
