package _09_dependency_injection.before;

// "데이터베이스"에 게시판 목록을 저장하는 클래스
public class DbBoardPersistence {
    public void save() {
        System.out.println("데이터베이스에 게시판 저장 중...");
    }

    public void delete() {
        System.out.println("데이터베이스 게시판 삭제 중...");
    }
}
