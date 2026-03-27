package _05_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr =  new ArrayList<Integer> (10);
        arr.add(11);
        arr.add(12);
        arr.add(13);
        arr.add(14);
        arr.add(15);
        arr.add(null);
        System.out.println(arr);

//       Object[] arr2 = {null,null,new int[]{1,2,3}};
//       for (int i = 0; i < arr2.length; i++) {
//           System.out.println(Arrays.toString(arr2));
//        }
    }
}
