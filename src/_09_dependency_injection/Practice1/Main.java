package _09_dependency_injection.Practice1;

public class Main {
    public static void main(String[] args) {
        NotificationService notice = new EmailNotificationService();

        OrderService service = new OrderService(notice);

        service.processOrder();
        service.send();
        System.out.println("---");
        service.processOrder();
        service.send();
    }
}
