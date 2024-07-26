package CodingProblem.BasicProgramming;

public class EvenNumber {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(IsEven(n));

    }
    static boolean IsEven(int n){
      if(n  == 0){

          return true;
      }

     if(n%2==0){
         return true;
     }
     return false;

    }
}
