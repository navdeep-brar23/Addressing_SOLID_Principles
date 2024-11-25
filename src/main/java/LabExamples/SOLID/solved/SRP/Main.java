package main.java.LabExamples.SOLID.solved.SRP;

public class Main {
    public static void main(String[] args) {
        CarInventoryManager inventoryManager = new CarInventoryManager();
        CarSalesManager salesManager = new CarSalesManager();
        InvoiceManager invoiceManager = new InvoiceManager();

        inventoryManager.addCar("Toyota Corolla", 20000);
        salesManager.sellCar("Toyota Corolla");
        invoiceManager.generateInvoice("Toyota Corolla", 20000);
    }
}
