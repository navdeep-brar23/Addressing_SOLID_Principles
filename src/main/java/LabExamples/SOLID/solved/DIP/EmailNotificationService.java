package main.java.LabExamples.SOLID.solved.DIP;
/**
 * EmailNotificationService is an implementation of the NotificationService interface.
 * It handles sending notifications via email.
 */
public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email notification: " + message);
    }
}
