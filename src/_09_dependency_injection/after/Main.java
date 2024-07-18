package _09_dependency_injection.after;

public class Main {
    public static void main(String[] args) {
        // 코드 변경이 필요할 시 new FileBoardPersistence(); <-> new DbBoardPersistence(); 부분만 바꿔주면 된다.
        IBoardPersistence persistence = new FileBoardPersistence();
        // -> 파일에서 데이터베이스로 기획이 변경되었는데 서비스 코드를 변경하지 않아도 된다 (의존성 주입의 장점)

        // case 1. 생성자를 이용한 주입
        /* BoardService service = new BoardService(persistence); */

        // case 2. setter 를 이용한 주입
        BoardService service = new BoardService();
        service.setPersistence(persistence);

        service.save();
        service.delete();
    }
}
