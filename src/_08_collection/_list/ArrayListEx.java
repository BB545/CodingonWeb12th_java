package _08_collection._list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        // ArrayList 컬렉션 생성
        List<Book> list = new ArrayList<>();

        // 객체 추가
        list.add(new Book("제목1", "지은이1"));
        list.add(new Book("제목2", "지은이2"));
        list.add(new Book("제목3", "지은이3"));
        list.add(new Book("제목4", "지은이4"));
        list.add(new Book("제목5", "지은이5"));
        list.add(new Book("제목6", "지은이6"));
        System.out.println(list);

        // 리스트 개수 얻기
        System.out.printf("총 %d 권의 책이 있습니다.", list.size());

        // 특정 인덱스 객체 가져오기
        System.out.println(list.get(2));

        // 인덱스로 특정 객체 삭제
        list.remove(2);
        list.remove(2);
        System.out.println(list);

        for (Book b: list) {
            System.out.println(b);
        }
        System.out.println();

        // 모든 객체 삭제
        chackIfEmpty(list); // false
        list.clear();
        chackIfEmpty(list); // true
        System.out.println(list);
    }

    private static void chackIfEmpty(List<?> list) {
        System.out.println("객체가 비어있나요? " + list.isEmpty());
    }
}
