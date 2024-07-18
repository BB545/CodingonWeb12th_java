package _09_dependency_injection.Practice1;

public class SNSNotificationService implements NotificationService{
    public void send() {
        System.out.println("Order processed successfully");
    }

    private NotificationService notice;

    public void setNotice(NotificationService n) {
        this.notice = n;
    }
}
