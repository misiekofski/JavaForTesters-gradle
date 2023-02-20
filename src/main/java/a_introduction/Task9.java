package a_introduction;

public class Task9 {
    public static void main(String[] args) {
        System.out.println(minFrom(10, 20, 3));
    }

    public static double minFrom(double a, double b, double c) {
        if (a < b && b < c) {
            return a;
        } else if (b < a && a <c ) {
            return b;
        } else {
            return c;
        }
    }
}
