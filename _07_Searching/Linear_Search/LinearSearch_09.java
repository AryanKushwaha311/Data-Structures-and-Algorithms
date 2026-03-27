package _07_Searching.Linear_Search;

public class LinearSearch_09 {
    static int totalEvenNum(int[] arr){
        int count=0;
        for (int i:arr){
            if(evenNum(i)){
                count++;
            }
        }
        return count;
    }

    static boolean evenNum(int num){
        int numberOfDigits=countDigits(num);
//        if(numberOfDigits%2==0){
//            return true;
//        }
//        return false;
        return numberOfDigits % 2==0;
    }

    static int countDigits(int num){
        if(num==0){
            return 1;
        }
        if(num<0){
            num*=-1;
        }
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr={-1736,23,488,911};
        int result=totalEvenNum(arr);
        System.out.println(result);

        System.out.println(countDigits(-1234));

    }
}
