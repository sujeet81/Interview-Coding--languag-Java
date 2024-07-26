package CodingProblem.BasicProgramming;


import java.awt.image.SampleModel;

abstract class Demo{
    static void m1(){
        System.out.println("abstract");
    }
}
public class Test extends Demo{
    public static void main(String[] args) {
        Demo.m1();
    }


}

