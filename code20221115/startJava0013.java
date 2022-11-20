import java.util.Scanner;

public class startJava0013 {

    //전역변수 : 어느 메서드에서나 불러올 수 있는 변수 (global variable)
    static int sum_grobal = 0;
    static String menu_list_array = "";
    //지역변수 : 메서드 내에서만 살아있는 변수 (외부에서 불러 올 수 없음) local variable

    public static void main(String[] args) {

        for(;;) {
            System.out.println("메뉴 출력합니다");
            //1. 메뉴출력
            menu_list();
            //2. scanner로 값 받기
            String temp = input_scanner();
            //3. 금액계산
            if(calcAndExit(temp)) {
                reception();
                break;
            };
            System.out.println("현재 계산 금액은 "+sum_grobal);
        }
    }

    public static void menu_list() {
        System.out.println("1. 매운 떡볶이 : 2500원");
        System.out.println("2. 마늘 떡볶이 : 4000원");
        System.out.println("3. 엽기 떡볶이 : 4500원");
        System.out.println("4. 종료");
    }

    public static String input_scanner() {
        Scanner sc = new Scanner(System.in);

        //String문자열을 입력받고, 한 줄 띄움 (줄 바꾸기)
//        sc.nextLine();

        //next(), nextInt()메서드를 사용하면 buffer에 enter키값이 남아 있어서,
        //다음 Scnner입력값이 enter키 값이 입력이 되는 현상(문제) 발생
        //이럴 때는 nextLine()메서드로 enter키값을 buffer에서 삭제.
        //Int정수 입력 받기
//        sc.nextInt();
        //String문자열을 입력 받기
//        sc.next();

        String choice_menu = sc.nextLine();
        return choice_menu;
    }

    public static boolean calcAndExit(String input) {
        //int의 ==(비교연산자)와 동일한
        //String의 equals() 비교연산자
        // 1 == 1 (숫자 일 경우는 == )
        // A.equals("B") (문자열 일 경우 .equals())
        if (input.equals("1")) {
            sum_grobal = sum_grobal + 2500;
            menu_list_array = menu_list_array + "매운 떡볶이, ";
        }else if (input.equals("2")) {
            sum_grobal = sum_grobal + 4000;
            menu_list_array = menu_list_array + "마늘 떡볶이, ";
        }else if (input.equals("3")) {
            sum_grobal = sum_grobal + 4500;
            menu_list_array = menu_list_array + "엽기 떡볶이, ";
        }else if (input.equals("4")) {
            return true;
        }
        return false;
    }

    public static void reception() {
        System.out.println("결제금액은 "+sum_grobal);
        System.out.println("주문하신 메뉴는 ");
        System.out.println(menu_list_array);
    }

    //break : 가장 가까운 반복문에서 탈출
    //전역변수 <> 지역변수(매개변수)

    // q0003
    //당신은 떡볶이 집 운영자 입니다.
    //주문을 자동화 하기 위해 키오스크 시스템을 만들려고 합니다.
    //다음과 같은 떡볶이 메뉴를 출력하고,
    //결제 시스템을 구축하시오
    //메뉴)
    //1. 매운 떡볶이 : 2000원
    //2. 마늘 떡볶이 : 4000원
    //3. 엽기 떡볶이 : 4500원

    //1) 떡볶이 메뉴를 계속 받도록 구조짜기 = 무한 반복문과 break활용
    //2) System.out.println()메서드로 메뉴 출력하기
    //3) Scanner로 메뉴이름 또는 번호를 입력 받기
    //4) 입력받은 번호 기반으로 결제금액 합산(연산)하여 출력하기

    //Scanner와 메서드와 전역변수를 활용하여 구축하시오

    
}
