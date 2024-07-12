package _05_class._interface._01;

// interface 선언
public interface RemoteControl {
    // 추상 메서드 선언
    // - 실행부({})가 없는 메서드
    public void turnon();

    public void turnoff();

    public void setVolume(int volume);

    // 상수 필드
    // - 인터페이스에 선언된 필드는 모두 "public static final" 특성을 가짐
    // - 따라서, 생략하더라고 컴파일 과정에서 자동으로 붙음
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;
}

// 인터페이스에서 다음 세가지 선언은 모두 동일한 의미
// 1) public static final int MY = 10;
// 2) static final int MY = 10;
// 3) final int MY = 10;
