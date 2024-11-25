package main.java.LabExamples.SOLID.solved.DIP;
/**
 * SMSNotificationService is another implementation of the NotificationService interface.
 * It handles sending notifications via SMS.
 */
public class SMSNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}
