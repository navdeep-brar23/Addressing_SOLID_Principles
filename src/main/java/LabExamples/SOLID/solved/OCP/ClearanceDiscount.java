package main.java.LabExamples.SOLID.solved.OCP;

public class ClearanceDiscount extends Discount {
    @Override
    public double calculate(double price) {
        return price * 0.20; // 20% discount
    }
}
