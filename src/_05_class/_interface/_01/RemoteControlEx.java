package _05_class._interface._01;

public class RemoteControlEx {

    public static void main(String[] args) {
        // interface 도 하나의 타입이므로 변수 타입으로 사용 가능
        // interface 는 참조 타입이므로 null 값 가질 수 있음
        RemoteControl rc;

        // rc 변수에 Television 객체 대입
        // main -> interface -> Television 함수 실행
        rc = new Television();
        rc.turnon();
        rc.setVolume(5);
        rc.turnoff();

        // rc 변수에 Audio 객체 대입 (교체)
        rc = new Audio();
        rc.turnon();
        rc.setVolume(15);
        rc.turnoff();

        // 상수는 구현 객체와는 상관 없는 인터페이스 소속 멤버
        // 인터페이스로 바로 접근해서 상수값 읽기 가능
        System.out.println(RemoteControl.MAX_VOLUME);
        System.out.println(RemoteControl.MIN_VOLUME);
    }
    
}
