package main.java.LabExamples.SOLID.solved.OCP;

public class DiscountCalculator {
    public double applyDiscount(Discount discount, double price) {
        return discount.calculate(price);
    }
}
