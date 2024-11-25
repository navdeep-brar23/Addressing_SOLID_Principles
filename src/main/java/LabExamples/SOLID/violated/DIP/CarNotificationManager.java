package main.java.LabExamples.SOLID.violated.DIP;

/**
 * CarNotificationManager is responsible for notifying about car sales.
 * This class is tightly coupled to the EmailNotificationService, 
 * violating the Dependency Inversion Principle.
 */

public class CarNotificationManager {
    private EmailNotificationService emailService;
/**
     * Constructor initializes the EmailNotificationService.
     * This creates tight coupling, making it difficult to change or add new notification methods.
     */
    public CarNotificationManager() {
        this.emailService = new EmailNotificationService(); // Tightly coupled
    }

    /**
     * Sends a notification for a car sale using EmailNotificationService.
     * 
     * @param carModel The model of the car that was sold.
     */
    public void notifySale(String carModel) {
        emailService.sendNotification("Car sold: " + carModel);
    }
}
/**
 * EmailNotificationService handles sending email notifications.
 * This is a concrete implementation, making it hard to extend or replace.
 */

class EmailNotificationService {
    /**
     * Sends an email notification.
     * 
     * @param message The notification message to send.
     */
    public void sendNotification(String message) {
        System.out.println("Sending email notification: " + message);
    }
}

