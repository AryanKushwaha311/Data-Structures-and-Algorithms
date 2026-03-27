package Battle_Practise;

import java.lang.reflect.Array;
import java.util.*;

public class test {
    public static void main(String[] args) {
        // Question-01
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(10);
//        arr.add(20);
//        arr.add(30);
//        arr.add(40);
//
//
//        arr.remove(Integer.valueOf(20));
//        System.out.println(arr);

//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(5);
//        arr.add(12);
//        arr.add(7);
//        arr.add(18);
//        arr.add(3);
//        System.out.println(arr);
//
//        for (int i = 0; i <arr.size() ; i++) {
//            if(arr.get(i)<10){
//                arr.remove(i);
//            }
//        }
//        System.out.println(arr);

//        StringBuilder sb = new StringBuilder("CodeHard");
//        sb.reverse();
//        sb.insert(4,"_");
//        System.out.println(sb);

//        StringBuilder sb = new StringBuilder("A");
//        sb.append(1);
//        sb.append(true);
//        sb.append(2.5);
//        System.out.println(sb);

//        StringBuffer sb = new StringBuffer("Thread");
//        sb.delete(3,6);
//        sb.append("Safe");
//        System.out.println(sb);

//        String s = "Hello";
//        StringBuilder sb = new StringBuilder(s);
//        sb.append("World");
//        System.out.println(sb);

//        int[] arr = {1, 2, 3, 4, 5};
//
//        for (int i = 0; i < arr.length; i++) {
//            int temp = arr[i];
//            arr[i]=arr[arr.length-1-i];
//            arr[arr.length-1-i]=temp;
//        }
//
//        System.out.println(Arrays.toString(arr));

//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(4);
//        arr.add(5);
//
//        for (int i = 0; i < arr.size(); i++) {
//            if(arr.get(i)%2==0){
//                arr.remove(arr.get(i));
//            }
//        }
//        System.out.println(arr);

        StringBuilder sb = new StringBuilder("Java");
        String str = sb.toString();
        sb.replace(0,4,"JavaDSA");
        System.out.println(sb);
    }
}
