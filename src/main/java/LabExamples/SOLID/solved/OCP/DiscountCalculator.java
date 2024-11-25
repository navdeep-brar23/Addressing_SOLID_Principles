package main.java.LabExamples.SOLID.solved.OCP;

/**
 * DiscountCalculator applies a discount using the Discount class.
 * This class adheres to the Open/Closed Principle by being open to extension but closed to modification.
 */
public class DiscountCalculator {
     /**
     * Applies the discount using a specific Discount implementation.
     * 
     * @param discount An implementation of the Discount class.
     * @param price The original price of the product.
     * @return The discounted price.
     */
    public double applyDiscount(Discount discount, double price) {
        return discount.calculate(price);
    }
}
