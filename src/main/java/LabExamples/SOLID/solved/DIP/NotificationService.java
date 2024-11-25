package main.java.LabExamples.SOLID.solved.DIP;
/**
 * NotificationService defines a contract for sending notifications.
 * This abstraction allows for different notification implementations (e.g., Email, SMS).
 */
public interface NotificationService {
     /**
     * Sends a notification with the specified message.
     * 
     * @param message The notification message to send.
     */
    void sendNotification(String message);
}

