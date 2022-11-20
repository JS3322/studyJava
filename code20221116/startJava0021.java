import java.util.Scanner;

public class startJava0021 {

    static int sum_grobal = 0;
    static int totalPrice = 0;
    static String menu_list_array = "";

    // todo 20221116
    // 1. 객체지향 프로그래밍
    // 2. Math.Random 활용 : 결과를 통한 추측과 과정 만들기
    // 3. 가변배열 ArrayList 활용 : 고정배열과 가변배열의 차이와 활용

    // q0004
    //당신 옆 가게 떡볶이 집이 잘되는 것을 부러워하는 돈가스 집의 오너입니다.
    //다음과 같은 메뉴를 가진 키오스크 시스템을 구축하시오.
    //1. 안심 돈가스 : 9000원
    //2. 등심 돈가스 : 8000원
    //(단, 고객을 확보하기하기 위해
    //만원이상이면 10%할인, 2만원이상이면 20%할인을 하는
    //만원 단위별로 10%씩 증가하는
    //최대 50%할인 대박세일을 진행하려 합니다)
    //sum_grobal = sum_grobal - (sum_grobal /10)

    //scanner와 메서드와 전역변수를 활용하여 구축하시오

    public static void menu_list() {
        System.out.println("1. 안심 돈가스 : 9000원");
        System.out.println("2. 등심 돈가스 : 8000원");
        System.out.println("3. 종료");
    }

    public static String input_scanner() {
        Scanner sc = new Scanner(System.in);

        String choice_menu = sc.nextLine();
        return choice_menu;
    }

    public static boolean calcAndExit(String input) {

        if (input.equals("1")) {
            sum_grobal = sum_grobal + 9000;
            menu_list_array = menu_list_array + "안심 돈가스, ";
        }else if (input.equals("2")) {
            sum_grobal = sum_grobal + 8000;
            menu_list_array = menu_list_array + "등심 돈가스, ";
        }else if (input.equals("3")) {
            return true;
        }
        return false;
    }

    public static void reception() {

        //할인하기
        // 0~1만원만 0%
        // 1만원이상~2만원미만 10%
        // 2만원이상~3만원미만 20%
        // 3만원이상~4만원미만 30%
        // 4만원이상~5만원미만 40%
        // 5만원이상 50%
        // A && B : A조건 성립, B조건 성립 둘 다 되어야 true
        // A || B : A조건 성립, B조건 성립이 둘 중 하나가 되면 true
        if(sum_grobal < 10000) {
            totalPrice = sum_grobal;
        }else if(sum_grobal < 20000) {
            totalPrice = (int)(sum_grobal * 0.9);
//            totalPrice = sum_grobal - (sum_grobal / 10);
        }else if(sum_grobal < 30000) {
            totalPrice = (int)(sum_grobal * 0.8);
        }else if(sum_grobal < 40000) {
            totalPrice = (int)(sum_grobal * 0.7);
        }else if(sum_grobal < 50000) {
            totalPrice = (int)(sum_grobal * 0.6);
        }else {
            totalPrice = (int)(sum_grobal * 0.5);
        }

        System.out.println("할인 전 결제금액은 "+sum_grobal);
        System.out.println("할인 후 결제금액은 "+totalPrice);
        System.out.println("주문하신 메뉴는 ");
        System.out.println(menu_list_array);
    }

    public static void main(String[] args) {

        System.out.println("hello world");

        //(;;) : 초기식, 조건식, 증감식 없는 계속 반복되는 반복문(무한반복)
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
}
