package _05_class._interface._02;

interface Controller {
    // 추상 메서드
    void poweron();
    void poweroff();

    // 디폴트 메소드
    // - 인터페이스가 완전한 실행코드를 가진 디폴트 메서드 선언 가능
    // - 추상 메서드에는 실행부({})가 없지만, 디폴트 메서드는 실행부가 있다.
    default void display() {
        System.out.println("디스플레이가 켜졌습니다.");
    }
}

class TV implements Controller {
    @Override
    public void poweron() {
        System.out.println("TV power on");
    }

    @Override
    public void poweroff() {
        System.out.println("TV power off");
    }
}

class Computer implements Controller {
    @Override
    public void poweron() {
        System.out.println("Computer power on");
    }

    @Override
    public void poweroff() {
        System.out.println("Computer power off");
    }
}

public class InterfaceEx01 {

    public static void main(String[] args) {
        TV tv = new TV();
        Computer computer = new Computer();

        tv.poweron();
        tv.display();
        tv.poweroff();

        System.out.println("--------------------------");

        computer.poweron();
        computer.display();
        computer.poweroff();
    }

}
