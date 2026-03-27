package _06_Sorting;

public class armStrong {

    static void arm(int num){
        int count=0;
        int temp=num;
        while(temp>0){
            count++;
            temp/=10;
        }
        //sum
        int sum=0;
        temp=num;
        while(temp>0){
            int digit=temp%10;
            sum += Math.pow(digit, count);
            temp=temp/10;
        }

        //check armstrong
        if(sum==num){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
    public static void main(String[] args) {
        arm(1534);
    }
}
