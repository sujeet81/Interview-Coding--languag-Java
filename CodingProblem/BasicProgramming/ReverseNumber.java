package CodingProblem.BasicProgramming;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int reverse = 0;
    while(x != 0){
        int rem = x%10;
        reverse = reverse * 10 + rem;
        x = x /10;
    }
        System.out.print(reverse);
    }
}
