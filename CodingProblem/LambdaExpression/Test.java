package CodingProblem.LambdaExpression;



@FunctionalInterface
interface Inr{
    void show();
}
public class Test {
    public static void main(String[] args) {

//        Inr r = new Inr() {
//            @Override
//            public void show() {
//                System.out.println("Lambda Expression");
//            }
//        };
//       r.show();

        Inr r = () -> System.out.println("Show");
        r.show();
    }
}
