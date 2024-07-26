package CodingProblem.BasicProgramming;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
//        FactorialNumber n = new FactorialNumber();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(factorial(number));

    }
    static int factorial(int number){
        int i, fact = 1;

        for(i = 1; i<=number; i++){
            fact = fact *i;


        }
        return fact;

    }

}
