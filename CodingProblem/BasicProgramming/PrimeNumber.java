package CodingProblem.BasicProgramming;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int count = sc.nextInt();
        System.out.print(isPrimeNumber(count));
    }
    static boolean isPrimeNumber(int n ){
        if(n<=1){
            return false;
        }
        for(int i = 2; i<=n/2;i++){
            if(n%i==0){
                return false;
            }

        }
        return true;

    }
}
