package main.java.LabExamples.SOLID.solved.OCP;
/**
 * ClearanceDiscount provides a specific implementation of the Discount class.
 * It applies a 20% discount.
 */
public class ClearanceDiscount extends Discount {
    @Override
    public double calculate(double price) {
        return price * 0.20; // 20% discount
    }
}
