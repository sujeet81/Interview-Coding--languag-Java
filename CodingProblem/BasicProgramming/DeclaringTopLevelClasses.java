package CodingProblem.BasicProgramming;



abstract class R{
    abstract class A{
        abstract void abstractMethod();
    }
}

class C extends R{
    class D extends A{

        @Override
        void abstractMethod() {
            System.out.println("TOp level of Class is abstract method ");
        }
    }
}
public class DeclaringTopLevelClasses {
    public static void main(String[] args) {
        C s = new C();
        C.D inner = s.new D();
        inner.abstractMethod();
    }
}
