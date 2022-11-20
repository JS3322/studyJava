package code20220922;

import java.util.Scanner;

public class java04_0008_groupProject_calculator_switch {

	// main(); 자바 프로그램의 가장 처음 시작되는 메서드 (시작점이자 끝)
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		view_welcome();

		view_numberPlz();
		int temp_num = scan.nextInt();
		scan.nextLine();
		System.out.println(temp_num);

		String temp_oper = "";
		view_stringPlz();
		for (;;) {
			temp_oper = scan.nextLine();
			if (operation_check(temp_oper)) {
				break;
			}
			view_stringRePlz();
		}
		System.out.println(temp_num + temp_oper);

		view_numberPlz();
		int temp_num_second = scan.nextInt();
		scan.nextLine();
		System.out.println(temp_num + temp_oper + temp_num_second + "=");

		temp_num = calc_start(temp_num, temp_oper, temp_num_second);
		System.out.println(temp_num);
	}

	private static void view_welcome() {
		System.out.println("안녕하세요");
		System.out.println("계산기입니다");
		System.out.println("----------------");
		System.out.println("첫 번째 숫자를 입력하고 ");
		System.out.println("연산자를 입력하고 ");
		System.out.println("두 번째 숫자를 입력하면 ");
		System.out.println("계산결과가 출력됩니다");
		System.out.println("----------------");
	}

	private static void view_numberPlz() {
		System.out.println("숫자를 입력하시오");
	}

	private static void view_stringPlz() {
		System.out.println("문자를 입력하시오");
	}

	private static void view_stringRePlz() {
		System.out.println("문자를 다시 입력하시오");
	}

	private static boolean operation_check(String B) {
		boolean result = false;
		if (B.equals("+")) {
			result = true;
		} else if (B.equals("-")) {
			result = true;
		} else if (B.equals("*")) {
			result = true;
		} else if (B.equals("/")) {
			result = true;
		} else if (B.equals("**")) {
			result = true;
		}
		return result;
	}

	private static int calc_start(int A, String B, int C) {
		int result = 0;

		switch (B) {
		case "+":
			result = calc_plus(A, C);
			break;
		case "-":
			result = calc_minus(A, C);
			break;
		case "*":
			result = calc_multi(A, C);
			break;
		case "/":
			result = calc_div(A, C);
			break;
		case "**":
			result = calc_squa(A, C);
			break;
		}
		return result;
	}

	private static int calc_plus(int A, int B) {
		return A + B;
	}

	private static int calc_minus(int A, int B) {
		return A - B;
	}

	private static int calc_multi(int A, int B) {
		return A * B;
	}

	private static int calc_div(int A, int B) {
		return A / B;
	}

	private static int calc_squa(int A, int B) {
		return (int) Math.pow(A, B);
	}

	private static int calc_log10(int A) {
		return (int) Math.log10(A);
	}

	private static int calc_logAB(int A, int B) {
//		return (int) (Math.log10(A) / Math.log10(B));
		return (int) (Math.log(A) / Math.log(B));
	}

	// cacl(); 실행을 하면 아래 메서드가 실행
	// (int intA) 인자값으로 받은 데이터를 intA라는 이름으로 설정
	// return은 메서드 실행이 종료되면 반환해주는 값
}
