package _07_generic;

// 참고. Number 클래스
// - Java 에서 모든 숫자형식의 부모 클래스
// - 정수형, 실수형 데이터 타입 모두 포함
// ex. Byte, Short, Integer, Long, Float, Double

// 제네릭 제한 case1
// - Box 클래스는 제네릭 타입 T를 받지만, 제한을 두어 Number 를 상속한 클래스만 허용
class Box<T extends Number> {
    private T item;
    public void setItem(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
}

// 제네릭 제한 case2
interface Movable {
    void move();
}

class Car implements Movable {
    @Override
    public void move() {
        System.out.println("자동차 출발~");
    }
}

class Bicycle implements Movable {
    @Override
    public void move() {
        System.out.println("자전거 출발~");
    }
}

// - Container 클래스는 제네릭 타입 T를 받지만 제한을 두어 Movable 인터페이스를 구현한 클래스만 허용
// - makeItMove 메서드는 해당 객체의 move 메서드 호출
class Container<T extends Movable> {
    private T item;
    // 생성자
    public Container(T item) {
        this.item = item;
    }
    public void makeItMove() {
        item.move();
    }
}

public class GenericEx02 {

    public static void main(String[] args) {
        // err : 제네릭 타입에 Number 를 상속받지 않는 타입을 사용 중
        // Box<String> sBox = new Box<>(); // Number 를 상속 받는 타입이 아니기에 컴파일 에러

        Box<Double> dBox = new Box<>();
        dBox.setItem(3.14);
        System.out.println(dBox.getItem());

        Box<Integer> iBox = new Box<>();
        iBox.setItem(10000);
        System.out.println(iBox.getItem());

        Box<Short> sBox = new Box<>();
        sBox.setItem((short) 42); // 형변환 해줘야함 // 참고. (short) 형 변환 필요한 이유?
        // Java 에서 정수 리터럴은 int 로 간주함 -> 42라는 숫자를 short 형 숫자로 사용하고 싶으면 명시적 형변환 필요
        System.out.println(sBox.getItem());

        //////////////////////////////////
        Container<Car> cc = new Container<>(new Car()); // public Container(T item) 객체를 넘겨줘야함
        Container<Bicycle> bc = new Container<>(new Bicycle());
        cc.makeItMove();
        bc.makeItMove();
    }

}
