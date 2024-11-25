package main.java.LabExamples.SOLID.solved.DIP;

public class CarNotificationManager {
    private NotificationService notificationService;

    public CarNotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifySale(String carModel) {
        notificationService.sendNotification("Car sold: " + carModel);
    }
}
