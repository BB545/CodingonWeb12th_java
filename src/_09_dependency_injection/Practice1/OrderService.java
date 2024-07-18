package _09_dependency_injection.Practice1;

public class OrderService {
    private NotificationService notice;

    public OrderService(NotificationService n) {
        this.notice = n;
    }

    public void send() {
        notice.send();
    }

    public void processOrder() {
        NotificationService notice = new SNSNotificationService();
        SNSNotificationService SNSservice = new SNSNotificationService();

        SNSservice.setNotice(notice);
        SNSservice.send();
    }
}
