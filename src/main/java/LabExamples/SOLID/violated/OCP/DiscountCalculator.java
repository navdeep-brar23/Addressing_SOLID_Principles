package main.java.LabExamples.SOLID.violated.OCP;

public class DiscountCalculator {
    public double calculateDiscount(String discountType, double price) {
        if (discountType.equals("Seasonal")) {
            return price * 0.10; // 10% discount
        } else if (discountType.equals("Clearance")) {
            return price * 0.20; // 20% discount
        } else {
            return 0; // No discount
        }
    }
}
