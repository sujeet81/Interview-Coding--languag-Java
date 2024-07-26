package CodingProblem.BasicProgramming;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FindFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(IsFibonacciNumber(x));
    }
    static boolean IsFibonacciNumber(int n) {
        if (n == 0 || n == 1) {
            return true;
        }
        int a = 0, b = 1, c;
        while (n >= 2) {

            c = a + b;
            a = b;
            b = c;
            if (n == c) {
                return true;
            } else if (c >= n) {
                return false;
            }
        }
        return false;
    }
}
