package a_introduction;

public class App {
    public static void main(String[] args) {
        drive(Vehicle.CAR);
    }

    public static void drive(Vehicle v) {
        System.out.println(v.name());
        System.out.println(v.ordinal());
    }
}
