package code20221205_account_depth1;

/*
1. 추상클래스 : 일반클래스와 기능은 동일하나, 반드시 상속하여 일반클래스로 완성해야 함 : 미완성 설계도 + 추상 메서드 존재
2. 필드값을 상속받고, 자식 클래스는 인스턴스를 생성할 때 부모클래스가 먼저 생성 되어야 한다
: 생성자 생성할 때 super(); 생성자 코드 실행
3. 부모클래스의 메서드 이름과 동일한 메서드 구현 시 @Override로 재정의({}코드영역 정의를 다시 한다)
 */

/*
mission 1. studyJava0081_account을 추상클래스로 상속받아서 studyJava0082_accountInfo 클래스에 구현하시오
단, studyJava0082_accountInfo에 필드값 email, name을 추가하여 클래스를 완성하시오.
또한, studyJava0082_accountInfo에 studyJava0081_account의 getInfo()메서드를 @Override(재정의)하여
id/pw/email/name 필드값을 console창에 출력하는 메서드를 구현하시오

mission 1-1.
1)id,pw는 필수로 입력받고, email, name은 선택사항으로 인스턴스를 구현가능하도록 구조를 설계하시오 (@Overload)
2)accountInfo 클래스의 id/pw/email/name의 필드값이 모두 존재하는지 확인하는 메서드를 만드시오 (return boolean)
3)accountInfo 클래스의 email과 name을 수정할 수 있는 메서드를 만드시오 (interface 사용해도 됨)
4)accountInfo 클래스에 pw를 초기화하는 메서드를 만드시오 (interface 사용해도 됨)

*인터페이스는 메서드 선언만 하고 끝 + 강제로 구현하도록 유도
mission 2. studyJava0083_search 인터페이스를 만들고, searchId()메서드를 선언하여
studyJava0082_accountInfo에 searchId()구현하도록 구조를 구현하시오
 */
public abstract class studyJava0081_account {
    private String id;
    private String pw;

    public studyJava0081_account(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }


    public void getInfo() throws NoSuchMethodException {
        System.out.println(getId());
        System.out.println(getPw());
    }
    public String getId() {
        return this.id;
    }
    public String getPw() {
        return this.pw;
    }
    public void setPw(String pw) {
        this.pw = pw;
    }

}
