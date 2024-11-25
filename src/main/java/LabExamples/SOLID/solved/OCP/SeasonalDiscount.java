package main.java.LabExamples.SOLID.solved.OCP;

public class SeasonalDiscount extends Discount {
    @Override
    public double calculate(double price) {
        return price * 0.10; // 10% discount
    }
}
