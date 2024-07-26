package CodingProblem.InterviewTimeCoding;


class  Engine{
    void start(){
        System.out.println("Engine is Starting");
    }
}


class Car{
    private Engine engine = new Engine();

    void startCar(){
        engine.start();
        System.out.println("Car is starting");
    }
}
public class ExampleCompostions {
    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();

    }

}
