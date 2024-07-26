package CodingProblem.BasicProgramming;


abstract class A {
    final void m1(){
        System.out.println("This is he final method");
    }
}
 class B extends A{

 }
public class FinalAbstract {
    public static void main(String[] args) {
        A a = new B();
        a.m1();
    }
}
