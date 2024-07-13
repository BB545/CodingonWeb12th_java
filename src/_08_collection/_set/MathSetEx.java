package _08_collection._set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MathSetEx {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        // 객체 저장
        set1.add("apple");
        set1.add("banana");
        set1.add("orange");
        set1.add("banana"); // 실행안됨 -> [banana, orange, apple] 중복값 허용 x
        System.out.println(set1);

        System.out.printf("총 %d 종류의 과일이 있습니다.", set1.size());

        ///////////////////////////////////////////////////////////
        Set<Course> set2 = new HashSet<>();

        Course java = new Course(101, "Java");
        Course js1 = new Course(102, "JavaScript");
        Course js2 = new Course(102, "JavaScript");
        System.out.println(java.hashCode());
        System.out.println(js1.hashCode()); // 1266328083 해시코드 동일
        System.out.println(js2.hashCode()); // 1266328083 해시코드 동일
        System.out.println(js1.equals(js2)); // true

        set2.add(java);
        set2.add(js1); // js1, js2 인스턴스는 다르지만 동등 객체이므로 한개만 생성됨
        set2.add(js2);
        System.out.println(set2);

        // 전체 요소 크기
        System.out.printf("총 %d 종류의 과정이 있습니다.", set2.size());

        // 전체 요소
        // case1. 반목문 사용
        for (Course c: set2) {
            System.out.println(c);
        }

        // case2. iterator() 메소드로 반복자를 얻어 객체 하나씩 가져오기
        // Iterator 클래스가 제공하는 메서드
        // - Iterator<E> iterator(): 컬렉션 요소를 순회하기 위한 Iterator 객체를 반환
        // - boolean hashNext(): 가져올 객체가 있으면 true, 없으면 false
        // - E next(): 컬렉션에서 하나의 객체를 가져옴
        Iterator<Course> it = set2.iterator();
        while (it.hasNext()) {
            Course c = it.next();
            System.out.println(c);
        }
    }
}
