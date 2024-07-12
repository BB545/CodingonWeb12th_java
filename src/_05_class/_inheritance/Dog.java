package _05_class._inheritance;

public class Dog extends Animal {
    // 메서드 오버라이딩: 부모 클래스의 makeSound 메소드 재정의
    @Override // 컴파일러가 정확히 오버라이딩 되었는지 체크하는 기능 (생략 가능)
    void makeSound() {
        super.makeSound(); // 부모 클래스의 메서드 호출 // - 동물이 운다! 도 같이 출력됨
        System.out.println("멍멍!");
    }

    public Dog(String species, String name, int age) {
        setSpecies(species);
        setName(name);
        setAge(age);
    }

    void fetch() {
        System.out.println("공 가져와!");
    }
}

// 부모 메서드 호출
// - 메서드 오버라이팅: 부모 메서드는 숨겨지고 자식 메서드만 사용됨
//      (오버라이딩 하려는 자식 메서드가 부모 메서드의 일부만 변경되더라도 중복된 내용을 자식 메서드도 가지고 있어야 함)
// ex. 부모 메서드가 100줄의 코드를 가지고 있으면, 자식 메서드에서 나머지 내용 동일하고 1줄만 추가하고 싶어도
//     100줄을 부모와 동일하게 코드 모두 작성해야함;;
// - 자식 메서드에서 부모 메서드 호출하면 해결 가능
// ex. super.부모메서드이름() : 숨겨진 부모 메서드 호출
