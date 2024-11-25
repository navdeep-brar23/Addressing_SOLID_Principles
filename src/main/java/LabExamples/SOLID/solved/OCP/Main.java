package main.java.LabExamples.SOLID.solved.OCP;

public class Main {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        Discount seasonal = new SeasonalDiscount();
        Discount clearance = new ClearanceDiscount();

        double seasonalPrice = calculator.applyDiscount(seasonal, 20000);
        double clearancePrice = calculator.applyDiscount(clearance, 20000);

        System.out.println("Price after Seasonal Discount: $" + seasonalPrice);
        System.out.println("Price after Clearance Discount: $" + clearancePrice);
    }
}
