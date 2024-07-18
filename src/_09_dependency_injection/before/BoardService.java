package _09_dependency_injection.before;

// 게시판 목록을 관리하는 기능 제공
public class BoardService {
    // 코드 변경이 필요할 시 매우 안좋은 케이스
    // 변경이 어렵다 (번거로움)
    private final FileBoardPersistence persistence;

    public BoardService() {
        this.persistence = new FileBoardPersistence();
    }

    public void save() {
        persistence.save();
    }

    public void delete() {
        persistence.delete();
    }
}
