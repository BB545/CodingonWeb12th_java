package _09_dependency_injection.before;

public class Main {
    public static void main(String[] args) {
        // 코드 변경이 필요할 시 매우 안좋은 케이스
        // 변경이 어렵다 (번거로움)
        BoardService service = new BoardService();

        service.save();
        service.delete();
    }
}
