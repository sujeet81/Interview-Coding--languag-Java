package CodingProblem.BasicProgramming;

import java.util.Scanner;

public class Fibo1 {
    public static void main(String[] args) {
//        int n1 = 0, n2 = 1, n3;
//        int r = 10;
//
//        System.out.print(n1+ " " +n2);
//        for(int i = 2; i<=10; i++){
//            n3 = n1 + n2;
//            System.out.print(" " + n3 );
//            n1 = n2;
//            n2 = n3;

        Scanner sc = new Scanner(System.in);
        int x  = sc.nextInt();
        System.out.println(isFiboNum(x));





    }
    static boolean isFiboNum(int n){
       if(n == 0 || n == 1){
           return true;
       }
       int a = 0, b = 1,c;
       while(true){
           c = a+b;
           a = b;
           b = c;
           c = a+b;
           if(n == c){
               return true;
           }
           else if(c >= n){
               return false;

           }
       }


    }
}
