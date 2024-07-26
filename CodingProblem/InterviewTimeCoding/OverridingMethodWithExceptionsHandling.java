package CodingProblem.InterviewTimeCoding;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent{
    void show() throws IOException{
        System.out.println("SuperClasses Method");
    }
}

class Child extends Parent{
    @Override
    void show() throws FileNotFoundException {
        System.out.println("SubClasses Method");
    }
}
public class OverridingMethodWithExceptionsHandling {
    public static void main(String[] args) {
        Parent obj = new Child();
        try{
            obj.show();

        }catch (IOException e){
            e.printStackTrace();

        }
    }

}
