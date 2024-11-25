package main.java.LabExamples.SOLID.violated.SRP;
/**
 * CarSalesManager violates the Single Responsibility Principle (SRP) by handling multiple responsibilities:
 * 1. Inventory management
 * 2. Sales operations
 * 3. Invoicing
 * 
 * This tightly coupled design makes the class harder to maintain and extend.
 */
public class CarSalesManager {
     /**
     * Adds a car to the inventory.
     * 
     * @param carModel The model of the car to be added.
     * @param price The price of the car to be added.
     */
    public void addCar(String carModel, double price) {
        System.out.println("Car added: " + carModel + ", Price: $" + price);
    }
 /**
     * Sells a car.
     * 
     * @param carModel The model of the car being sold.
     */
    public void sellCar(String carModel) {
        System.out.println("Car sold: " + carModel);
    }
 /**
     * Generates an invoice for a car sale.
     * 
     * @param carModel The model of the car for which the invoice is being generated.
     * @param price The price of the car being sold.
     */
    public void generateInvoice(String carModel, double price) {
        System.out.println("Invoice generated for " + carModel + ", Amount: $" + price);
    }
}
