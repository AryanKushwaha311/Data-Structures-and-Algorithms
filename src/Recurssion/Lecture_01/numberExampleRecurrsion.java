package Recurssion.Lecture_01;
/*

RECURRSION:-
it is a function that call itself.

BASE CONDITION:-
NOTE:- EVERY FUNCTION CALL STORED IN STACK MEMORY AND TAKES SOME MEMORY.
1.If there is no base condition in recursion, there is no stopping point.
2.Every recursive call waits in the stack for another call to finish. If there is no base condition,
  no call ever finishes, so the stack keeps growing until stack overflow occurs.

 */
public class numberExampleRecurrsion {
    // CASE-01
   static void print(int n){
       if (n==6){
           System.out.println(6);
           return;
       }
       print(n+1);
       System.out.println(n);
   }

    // CASE-02
    static void print2(int n){

        System.out.println(n);
        print2(n+1);

        if(n==6){
            System.out.println(6);
            return;
        }
    }


    public static void main(String[] args) {
//        print(1);
        print2(1);
    }
}
