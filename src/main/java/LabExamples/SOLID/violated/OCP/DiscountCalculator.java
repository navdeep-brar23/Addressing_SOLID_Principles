package main.java.LabExamples.SOLID.violated.OCP;
/**
 * DiscountCalculator calculates discounts based on the discount type.
 * This class violates the Open/Closed Principle because adding a new discount type 
 * requires modifying this class.
 */
public class DiscountCalculator {
     /**
     * Calculates the discount based on the type of discount.
     * 
     * @param discountType The type of discount (e.g., "Seasonal", "Clearance").
     * @param price The original price of the product.
     * @return The discounted price.
     */
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
