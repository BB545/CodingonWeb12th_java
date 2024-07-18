package _09_dependency_injection.Practice1;

public class EmailNotificationService implements NotificationService{
    public void send() {
        System.out.println("Sending email notification: Your order has been processed");
    }
}
