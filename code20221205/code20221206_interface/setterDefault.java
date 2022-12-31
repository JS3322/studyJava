package code20221206_interface;

public interface setterDefault {

    //인터페이스의 메서드는 반드시 {}코드영역을 구현해야 한다 : 강제성
    //생략되었으나 abstract 라는 문법이 존재 (public void setPw() == public abstract void setPw())

    /**
     * @Since 비밀번호 변경 기능
     */
    public void setPw(String pw);
    /**
     * @Since 이름 변경 기능
     */
    public void setName(String name);
    /**
     * @Since 이메일 변경 기능
     */
    public void setEmail(String email);

}
