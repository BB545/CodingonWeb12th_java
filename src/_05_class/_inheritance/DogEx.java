package _05_class._inheritance;

public class DogEx {

    public static void main(String[] args) {
        // 자식 클래스의 인스턴스 생성
        Dog myDog = new Dog("강아지", "dog", 3);
        Cat myCat = new Cat("고양이", "cat", 5);
        
        // 메소드 호출
        myDog.makeSound(); // 부모 클래스의 메서드 or 오버라이딩한 자식 클래스의 메서드
        myCat.makeSound();
        
        myDog.fetch(); // 자식 클래스의 메서드
        myCat.catFetch();
    }
    
}
