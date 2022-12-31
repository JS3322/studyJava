package code20221206_interface;

/*
 * 인터페이스 : 기능만 선언하는 메서드를 상속받아서 구현 + 메서드 구현 강제(갑을관계) + 다중 상속가능 + (상수와 default메서드)
 * 인터페이스는 곧 개발자의 문서로써 기능을 함 (문서대로 구현해라) (메서드 기능만)
 * : 구조를 명확히 하고 팀원들이 일관성있게 클래스 구현 가능
 * 메서드명만 선언 : 껍데기 선언 기능. abstract 타입이 생략되어 있음 (public void test() == public abstract void test())
 * 다중상속 : implements A,B,C... 여러개 가능
 * final : 변하지 않는 변수, 상수 선언 가능 : 초기값이 있어야하는 상수이며 문법 생략 됨 : final 생략되어 변수선언처럼 해도 상수
 * default method : 인터페이스에서 {}코드영역이 있는 메서드로 그대로 가져다가 실행가능 (이미 구현되어 있으므로)
 * *static method / static field 가능 : 인스턴스 없이 static 코드 가능
 */

import java.util.HashMap;

public interface search {
    /**
     * @value search의 테스트코드
     */
    String testCode = "code20221206";

    /**
     * @return 현재 인터페이스의 코드를 반환
     */
    public default String returnCode() {
        return this.testCode;
    }

    /**
     * @return 인스턴스가 갖고 있는 모든 필드값을 조회하고 리턴(HashMap)
     */
    public HashMap<String, String> searchAll();

    /**
     * @return 아이디 유무 확인
     */
    public boolean searchId(String id);

    /**
     * @return pw 일치 확인
     */
    public boolean searchPw(String pw);

    /**
     * @return 동일 이메일 확인
     */
    public boolean searchEmail(String email);

}
