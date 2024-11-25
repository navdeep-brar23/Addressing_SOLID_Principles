package main.java.LabExamples.SOLID.solved.DIP;
/**
 * Main class to demonstrate the solution to the Dependency Inversion Principle.
 * Different notification services (Email, SMS) can be injected into the CarNotificationManager.
 */
public class Main {
    public static void main(String[] args) {
        // Test with Email Notification
        NotificationService emailService = new EmailNotificationService();
        CarNotificationManager emailManager = new CarNotificationManager(emailService);
        emailManager.notifySale("Toyota Corolla");

        // Test with SMS Notification
        NotificationService smsService = new SMSNotificationService();
        CarNotificationManager smsManager = new CarNotificationManager(smsService);
        smsManager.notifySale("Honda Civic");
    }
}
