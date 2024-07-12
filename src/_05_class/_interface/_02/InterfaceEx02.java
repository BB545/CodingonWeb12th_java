package _05_class._interface._02;

interface Move {
    void moveForward();
    void moveBackward();
}

interface Power {
    void powerOn();
    void powerOff();
}

// 인터페이스의 "다중 상속"
// - extends: 인터페이스가 인터페이스를 상속 받을 때
// - implements: 클래스가 인터페이스를 구현할 떄
interface Car extends Move, Power{
    void changeGear(int gear);
}

class Suv implements Car {
    @Override
    public void changeGear(int gear) {
        System.out.println("기어 변경: " + gear);
    }

    @Override
    public void moveForward() {
        System.out.println("전진");
    }

    @Override
    public void moveBackward() {
        System.out.println("후진");
    }

    @Override
    public void powerOn() {
        System.out.println("시동 켬");
    }

    @Override
    public void powerOff() {
        System.out.println("시동 끔");
    }
}

public class InterfaceEx02 {

    public static void main(String[] args) {
        Suv mySuv = new Suv();
        mySuv.powerOn();
        mySuv.changeGear(5);
        mySuv.powerOff();
    }

}
