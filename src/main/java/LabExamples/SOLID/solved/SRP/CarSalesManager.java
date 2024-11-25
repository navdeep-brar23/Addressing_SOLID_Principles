package main.java.LabExamples.SOLID.solved.SRP;

/**
 * CarSalesManager is responsible for handling car sales operations.
 * This class adheres to the Single Responsibility Principle (SRP) by focusing solely on sales-related tasks.
 */
public class CarSalesManager {
    public void sellCar(String carModel) {
        System.out.println("Car sold: " + carModel);
    }
}
