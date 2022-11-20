import java.util.Scanner;

public class startJava0012 {

    //Scanner : 키보드 값을 입력받는 패키지
    public static void main(String[] args) {
        System.out.println("hello world");

        //좌측 : 타입 변수명 (Scanner(타입) sc(변수명))
        //= : 대입연산자
        //우측 : 값(실행코드) new 새로운 도구 만듬(인스턴스)
        //new Scanner(인자값 System을 연결해주는 통로)
        Scanner sc = new Scanner(System.in);
//        String abc = new String("김준석");
//        abc = new String("박준석");
//        String abcd = "김준석";
        System.out.println("이름을 입력하시오");
        String inputData = sc.nextLine();
        System.out.println("당신의 이름은 "+inputData);
    }
}
