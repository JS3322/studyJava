package code00000010;

import java.io.IOException;
import java.util.Scanner;

public class java80_0001_groupProject_calc {

	public static void main(String[] args) throws IOException {
		// *문자열자르기
		// *객체화
		// *continue
		// 특정 값을 입력하면 자동으로 계산해주는 계산기를 만드시오
		// ex) 12입력하고, +입력하고, 30입력하면
		// 42출력할 것

		// 계산기 자동인식 시스템을 구축하려고 합니다
		// 처음에 "본 시스템은 숫자와 연산자를 반복적으로 입력 받습니다,
		// =를 입력하면 입력이 완료됩니다"
		// 출력이 되고,
		// 시작을 하면 "숫자를 입력하시오" 두 번째에는 "연산자를 입력하시오"를
		// 계속 반복합니다 (반복문)
		// if문과 for문, ==과 equals()와 변수 등등을
		// 사용하여 본 시스템을 구축하시오

		// 키보드 값을 입력받는 Scanner 도구 만들기
		Scanner scan = new Scanner(System.in);

		// 숫자 입력받는 변수
		int input_num = 0;
		// 연산자 입력받는 변수
		String input_calc = "";

		System.out.println("본 시스템은 숫자와 연산자를 반복적으로 입력 받습니다," + "=를 입력하면 입력이 완료됩니다");
		int temp = 0; // 임시 값 저장소
		String temp_oper = "+";

		for (;;) {

			System.out.println("첫번째 수");
			input_num = scan.nextInt();
			System.out.println("두번째 수");
			temp = scan.nextInt();
			scan.nextLine();
			System.out.println("연산자 입력");
			input_calc = scan.nextLine();

			if (input_calc.equals("+")) {
				// =(대입연산자) 우측에 항을 모두 계산 한 뒤에
				// input_num + temp; 계산 완료
				// =(대입연산자) 좌측 항에 있는 temp변수에 할당(저장)
				temp = input_num + temp;
			} else if (input_calc.equals("-")) {
				temp = input_num - temp;
			}else if (input_calc.equals("종료")) {
				break;
			}

			System.out.println(temp);
		}

		for (;;) {
//			temp_num = input_num;
			System.out.println("숫자를 입력하시오");
			menuBar();
			input_num = scan.nextInt();
			scan.nextLine(); // scan에 있는 buffer를 비움

			// 처음에 시작할 때 input_cacl변수의 값이 아무것도 없으므로
			// input_calc 값이 없을 때는 if문에 들어가지 않도록
			// 예외처리를 함
			if (!input_calc.equals("")) {
				// =연산자 일 경우 현재 숫자와 직전에 연산자 결과값을 출력
				// 하기 위해 연산자를 임시저장하는 변수 사용
				temp_oper = input_calc;
			}
			System.out.println("연산자를 입력하시오");
			input_calc = scan.nextLine();

			// 이항연산자
			if (temp_oper.equals("+")) {
				temp += input_num;
			} else if (temp_oper.equals("-")) {
				temp -= input_num;
			} else if (temp_oper.equals("*")) {
				temp *= input_num;
			} else if (temp_oper.equals("/")) {
				temp /= input_num;
			} else if (temp_oper.equals("**")) {
				temp = (int) Math.pow(temp, input_num);
			} else if (temp_oper.equals("%")) {
				temp %= input_num;
			}

			// 단항연산자
			if (input_calc.equals("=")) {
				System.out.println(temp);
				break;
			} else if (input_calc.equals("root")) {
				temp = (int) Math.sqrt(temp);
				System.out.println(temp);
				break;
			} else if (input_calc.equals("2진수")) {
				temp = Integer.parseInt(Integer.toBinaryString(temp));
				System.out.println(temp);
				break;
			}
		}
	}

	public static int menuBar() throws IOException {
		int keycode = 0;
		String result = "";

		System.out.println("---------------");
		System.out.println("| 7 / 8 / 9   |");
		System.out.println("| 4 / 5 / 6   |");
		System.out.println("| 1 / 2 / 3   |");
		System.out.println("| + / 0 / a완료|");
		System.out.println("-------------");
		for (;;) {
			for (;;) {
				keycode = System.in.read();
				if (keycode != 13 && keycode != 10) {
					break;
				}
			}
			// a값 코드 입력시 for문 종료
			if (keycode == 49) {
				break;
			}
			result += Integer.toString(keycode);
		}
		return Integer.parseInt(result);
	}

	public static int calcTest(int firstNum, int secondNum, String operation) {

		int result = 0;

		if (operation.equals("+")) {
			result = firstNum + secondNum;
		} else if (operation.equals("-")) {
			result = firstNum - secondNum;
		} else if (operation.equals("*")) {
			result = firstNum * secondNum;
		} else if (operation.equals("/")) {
			result = firstNum / secondNum;
		}

		return result;
	}

}
