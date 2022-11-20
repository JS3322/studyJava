public class startJava0004 {

    //계산기만들기_part1
    //덧셈, 뺄셈, 나눗셈, 곱셈 메서드를 만들고,
    //n이라는 숫자에 덧셈 2회(10, 20), 뺄셈 1회(14),
    //곱셈 2회(11, 13), 나눗셈 1회(12)을 하는 메서드를 만들고
    //실행하시오

    static double n = 0.0;

    public static void main(String[] args) {
        System.out.println("hello world");
        calc_operation();
        System.out.println(n);
    }

    public static void calc_operation() {
        calc_plus(10.0);
        calc_plus(20.0);
        calc_minus(14);
        calc_multi(11);
        calc_multi(13);
        calc_divide(12);
    }

    public static void calc_plus(double input) {
        n = n + input;
    }

    public static void calc_minus(double input) {
        n = n - input;
    }

    public static void calc_multi(double input) {
        n = n * input;
    }

    public static void calc_divide(double input) {
        n = n / input;
    }


}
