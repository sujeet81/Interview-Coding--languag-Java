package CodingProblem.InterviewQuestions150LeedCode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fst = sc.next();
        String scd = sc.next();

        String merge = mergeAlternately(fst,scd);
        System.out.println(merge);

    }
    public static String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<m || i<n; i++){
            if(i<m){
                sb.append(word1.charAt(i));
            }
            if(i<n){
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }
}
