package main.java.LabExamples.SOLID.solved.DIP;
/**
 * CarNotificationManager is responsible for notifying about car sales.
 * It depends on the NotificationService interface, adhering to the Dependency Inversion Principle.
 */
public class CarNotificationManager {
    private NotificationService notificationService;
 /**
     * Constructor injects the NotificationService dependency.
     * This allows for flexibility in choosing the notification method.
     * 
     * @param notificationService An implementation of the NotificationService interface.
     */
    public CarNotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
 /**
     * Sends a notification for a car sale using the injected NotificationService.
     * 
     * @param carModel The model of the car that was sold.
     */
    public void notifySale(String carModel) {
        notificationService.sendNotification("Car sold: " + carModel);
    }
}
