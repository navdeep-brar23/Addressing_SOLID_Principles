package main.java.LabExamples.SOLID.solved.OCP;
/**
 * SeasonalDiscount provides a specific implementation of the Discount class.
 * It applies a 10% discount.
 */
public class SeasonalDiscount extends Discount {
    @Override
    public double calculate(double price) {
        return price * 0.10; // 10% discount
    }
}
