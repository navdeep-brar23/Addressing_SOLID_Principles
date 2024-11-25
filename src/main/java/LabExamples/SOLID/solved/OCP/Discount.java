package main.java.LabExamples.SOLID.solved.OCP;
/**
 * Discount is an abstract class that defines a contract for calculating discounts.
 * Subclasses can provide specific implementations for different discount types.
 */
public abstract class Discount {
     /**
     * Calculates the discount based on the price.
     * 
     * @param price The original price of the product.
     * @return The discounted price.
     */
    public abstract double calculate(double price);
}
