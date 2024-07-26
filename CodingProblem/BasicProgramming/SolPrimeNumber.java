package CodingProblem.BasicProgramming;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SolPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(IsThisPrimeNumber(n));


    }
    static boolean IsThisPrimeNumber(int n){
        if(n<=1){
            return false;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }


       return true;

    }
}
