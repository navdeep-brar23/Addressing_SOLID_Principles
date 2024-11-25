package main.java.LabExamples.SOLID.solved.SRP;

public class InvoiceManager {
    public void generateInvoice(String carModel, double price) {
        System.out.println("Invoice generated for " + carModel + ", Amount: $" + price);
    }
}
