package CodingProblem.LambdaExpression;


@FunctionalInterface
interface First{
    void show();
}
@FunctionalInterface
interface Second extends First{
    void show();

}
public class Test2 {
    public static void main(String[] args) {
//        First f = new Second() {
//
//            @Override
//            public void show() {
//                System.out.println("First");
//
//            }
//
//        }
//        f.show();


    }
}
