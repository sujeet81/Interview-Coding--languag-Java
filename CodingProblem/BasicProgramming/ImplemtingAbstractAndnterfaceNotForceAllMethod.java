package CodingProblem.BasicProgramming;


import com.sun.security.jgss.GSSUtil;

interface Infr{
    void a();
    void b();
    void c();
    void d();
}

abstract class Implem implements Infr{
    @Override
    public void a() {
        System.out.println("Only one method is override");
    }
}

class Overrde extends Implem{

    @Override
    public void b() {
        System.out.println("b is the method of Override ");
    }

    @Override
    public void c() {
        System.out.println("C method is the override ");

    }

    @Override
    public void d() {


    }
}
public class ImplemtingAbstractAndnterfaceNotForceAllMethod {
}
