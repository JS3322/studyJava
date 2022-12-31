import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * reflection : 반사 : runtime 시점에서 데이터를 받아오는 행위 : 코드를 작성하고 실제로 동작할 때 어떤 정보가 오고가고
 * class나 메서드를 어떨 때 사용하는지를 나중에 선택하기 위해서
 * runtime : 실행
 */

public class reflection {

    public static void main(String[] args) throws ClassNotFoundException {
        //Class : 설계도 타입으로 변수 선언 : 프로그램이 실행된 후에 정보를 받은 객체를 넣음
        //forName(매개변수) : exampleClass001 이라는 class 파일의 정보를 받음
        Class main_c = Class.forName("exampleClass001");
        //클래스가 갖고 있는 메서드 배열
        Method[] main_m = main_c.getMethods();

        //생성자 배열 (오버로딩 있으므로 배열로 받음)
        Constructor[] main_c_c = main_c.getConstructors();
        //부모 클래스(인터페이스는 다중상속)으로 클래스 배열 받음
        Class[] main_c_interface = main_c.getInterfaces();
        //추상클래스는 1개만 상속받으므로 배열로 선언 안함
        Class superClass = main_c.getSuperclass();

        //heap메모리에 주소값을 리턴함
        System.out.println(main_c);
        System.out.println(main_m);
        System.out.println(main_c_c);
        System.out.println(main_c_interface);
        System.out.println(superClass);
    }
}
