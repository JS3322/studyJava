public class startJava0003 {
    //필드 (전역변수)
    //class 내에서 어느 메서드에서나 사용할 수 있는 변수 <> 지역변수
    static int sum = 0;
    static int n = 0;

    //메서드
    public static void main(String[] args) {
        System.out.println("hello wold "+sum);
//        calc_plus(1,2);
        //반복문
        //int i = 0; 초기식 : 조건변수의 초기값
        //i<10; 조건식 : 조건변수가 특정조건 일 때까지 반복문실행
        //i++; 증감식 : 반복문 1회 실행 후 실행되는 코드
//        for (int i = 0; i<10; i++ ) {
//            System.out.println(i);
//        }

        // 전역변수 n을 선언하고,
        // n, n+1값을 더하는 메서드 calc_plus를 만들고,
        // 반복문(for)으로 calc_plus를 10회 돌릴 경우
        // n의 값은 몇인지 출력하시오

        for (int i = 0; i <10; i++) {
            System.out.println(i);
            System.out.println(n);
            n = calc_plus(n);
        }
        System.out.println(n);
    }

    public static int calc_plus(int n) {
        return n + (n + 1);
    }
}
