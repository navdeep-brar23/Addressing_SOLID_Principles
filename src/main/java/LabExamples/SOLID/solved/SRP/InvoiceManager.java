package main.java.LabExamples.SOLID.solved.SRP;
/**
 * InvoiceManager is responsible for generating invoices for car sales.
 * This class adheres to the Single Responsibility Principle (SRP) by focusing solely on invoicing operations.
 */
public class InvoiceManager {
    public void generateInvoice(String carModel, double price) {
        System.out.println("Invoice generated for " + carModel + ", Amount: $" + price);
    }
}
