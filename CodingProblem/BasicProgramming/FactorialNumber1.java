package CodingProblem.BasicProgramming;

import java.util.Scanner;

public class FactorialNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Factorial Number " +x +" is " + isFactorial(x));

    }
    static int isFactorial(int n ){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }
}
