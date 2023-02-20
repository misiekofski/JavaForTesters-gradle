package a_introduction;

import java.time.Year;

public class Task8 {

    public static void main(String[] args) {
        int price = 50;
        double discount = 0.5;

        double priceAfterDiscount = calculatePrice(price, discount);
        System.out.println(priceAfterDiscount);
    }
    public static double calculatePrice(int price, double discount) {
        return price - (price * discount);
    }
}
