package code20221205_accountInfo_depth2;




import code20221205_account_depth1.studyJava0081_account;
import code20221206_interface.search;
import code20221206_interface.setterDefault;

import java.util.HashMap;

//mission1. setterDefault라는 인터페이스를 studyJava0081_accountInfo클래스에서 상속받아서,
//미구현된 메서드들을 구현하시오

//mission2. 만일, 상속받은 인터페이스들의 이름이 동일할 경우 어떻게 되는지 확인하시오.
//= 상속이나, 구현(인터페이스)도 순서가 있으므로 동일 명일 경우 먼저 실행되는 코드를 인식 (= queue)

public class studyJava0081_accountInfo extends studyJava0081_account implements setterDefault, search {
    private String email;
    private String name;

    public studyJava0081_accountInfo(String id, String pw, String email, String name) {
        //자식클래스 인스턴스를 만들 때, 반드시 부모클래스의 인스턴스(생성자) 생성 완료 후 진행
        super(id, pw);
        this.email = email;
        this.name = name;
    }
    //생성자의 타입에 따라 다른 인스턴스 생성 가능(초기값 다양성) : overloading

    //@Override : super(부모클래스)의 동일한 메서드 이름으로 만들어 새로 코드를 재정의
    @Override
    public void getInfo() throws NoSuchMethodException {
        System.out.println(super.getId());
        System.out.println(super.getPw());
        System.out.println(this.getEmail());
        System.out.println(this.getName());
    }
    public String getEmail() {
        return this.email;
    }

    public String getName() {
        return this.name;
    }


    //mission searchAll() 메서드의 코드영역{}을 완성하시오
    //모든 필드값(id/pw,email/name)을 조회하여 리턴하는 searchAll()메서드
    //return 타입은 void가 아니라, HashMap으로(key,value) return하도록 수정하시오
    @Override
    public HashMap<String, String> searchAll() {

        HashMap<String, String> result = new HashMap<>();
        result.put("id", super.getId());
        result.put("pw", super.getPw());
        result.put("email", this.getEmail());
        result.put("name", this.getName());

        //new HashMap<String, String> {{ put(Key, This.methodNAME)}};
        //This.methodNAME의 this는 가장 가까운 객체(인스턴스) HashMap을 가르키기 때문에
        //methodNAME은 HashMap에 있는 메서드만 사용할 수 있다
        return result;
    }

    //mission 인터페이스에 정의된 3개 메서드를 구현하시오 (searchId, searchPw, searchEmail)
    /**
     * @param id
     * @return 아이디 유무 확인
     */
    @Override
    public boolean searchId(String id) {
        //super.getId() 와 (id)를 비교하는 메서드 equals()를 실행하면
        //결과 내용은 true, false가 출력됨
        //*리턴값을 모르면 실행하는 메서드 안에 들어가보면 됨
//        boolean result = super.getId().equals(id);
        return super.getId().equals(id);
    }

    /**
     * @param pw
     * @return pw 일치 확인
     */
    @Override
    public boolean searchPw(String pw) {
        return super.getPw().equals(pw);
    }

    /**
     * @param email
     * @return 동일 이메일 확인
     */
    @Override
    public boolean searchEmail(String email) {
        //부모클래스의 메서드 getId()/getPw()는 super(부모클래스)로 지칭해야 되며,
        //자식클래스의 메서드 getEmail()/getName()은 this(본인클래스)로 지칭
        return this.getEmail().equals(email);
    }


    /**
     * @param pw
     * @Since 비밀번호 변경 기능
     */
    @Override
    public void setPw(String pw) {
        //부모클래스의 setPw메서드를 활용하여 super.pw 필드값 주소에 있는 값을 변경
        //getPw()를 거치면, super.pw에 있는 복사한 값 자체만 변경하므로 인스턴스 필드값은 변경되지 않음
        super.setPw(pw);
    }


    /**
     * @param name
     * @Since 이름 변경 기능
     */
    @Override
    public void setName(String name) {
        //this.name이라는 인스턴스의 필드 name값을 매개변수 name의 값으로 변경
        this.name = name;

    }

    /**
     * @param email
     * @Since 이메일 변경 기능
     */
    @Override
    public void setEmail(String email) {
        this.email = email;

    }
}
