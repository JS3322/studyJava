import java.util.ArrayList;

//startJava0061_account 클래스의 모든 기능을 물려받아서 새로운 기능을 더하는 클래스
//ClassName extends SuperClass(부모클래스) : SuperClass의 필드, 메서드를 상속받아서 ClassName에 적용
public class startJava0061_account_extends_log_ver extends startJava0061_account{
//    int count;
    ArrayList<startJava0061_rps_log> list = new ArrayList<>();
    //super : 부모클래스(superClass)를 지칭하는 단어 : 상속, 자원을 물려주는 대상의 클래스 : extends
    startJava0061_account_extends_log_ver(String id, String pw, String email, String name) {
        //부모(super)클래스의 필드값을 채워서 가져오기
        super(id, pw, email, name);
        //자식클래스의 count필드값 채움(저장)
//        this.count = count;
    }

    void getInfo() {
        System.out.println("id는 :"+super.id);
        for (startJava0061_rps_log item : list) {
            System.out.println(item.winRPS);
        }
    }
    void setList(startJava0061_rps_log log) {
        list.add(log);
    }
}
