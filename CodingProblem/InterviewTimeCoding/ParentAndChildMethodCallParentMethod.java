package CodingProblem.InterviewTimeCoding;




class ParentMethod{
    void m1(){
        System.out.println("m1");
    }
    void m2(){
        System.out.println("m2");
    }
    void m3(){
        System.out.println("m3");
    }

}

class ChildMethod extends ParentMethod {
    void m1(){
        System.out.println("Child m1");
    }
    void m4(){
        System.out.println("Child m4");
    }
    void m5(){
        System.out.println("child m5");
    }

    void callParentMethod(){
        super.m1();
        m2();
        m3();
    }
}
public class ParentAndChildMethodCallParentMethod {
    public static void main(String[] args) {
        ParentMethod parentMethod = new ParentMethod();
        ChildMethod childMethod = new ChildMethod();

        childMethod.callParentMethod();
        parentMethod.m1();

    }

}
