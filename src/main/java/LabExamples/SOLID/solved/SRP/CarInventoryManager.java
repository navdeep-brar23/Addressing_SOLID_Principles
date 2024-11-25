package main.java.LabExamples.SOLID.solved.SRP;
/**
 * CarInventoryManager is responsible for managing inventory operations.
 * This class adheres to the Single Responsibility Principle (SRP) by focusing solely on inventory management tasks.
 */
public class CarInventoryManager {
    public void addCar(String carModel, double price) {
        System.out.println("Car added: " + carModel + ", Price: $" + price);
    }
}
