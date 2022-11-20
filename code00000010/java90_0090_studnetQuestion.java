package code00000010;

import java.io.IOException;
import java.util.Scanner;

public class java90_0090_studnetQuestion {

	public static void main(String[] args) throws IOException {

//		//int num5(선언부) : int타입 num5변수명으로 메모리에 선언
//		//=(대입연산) 우측의 5라는 숫자를 num5변수에 할당
//		//(메모리 영역 안에 num5변수 영역에 5라는 숫자가 있음!)
//		int num5 = 5;
//		
//		//규칙1. 항상 대입연산자 우측 연산을 완료 후 좌측 변수에 할당(저장)
//		//규칙2. 우측에서 항상 좌측에 있는 산술연산자부터 실행하기
//		//(num5*2; num5변수를 먼저 가져오고, 2숫자를 곱한다(*))
//		
//		//= num5*2; 메모리 영역 안에 num5변수 영역의 숫자 5를 가져온다
//		//가져온 숫자 5를 *2연산을 실행한다 (CPU에서 작업 실행)
//		//연산 완료 후 =(대입연산자) 좌측에 있는 num5변수에 결과값을 할당(저장)
//		num5 = num5*2;
//		//System이라는 객체(JVM에 기본적으로 제공하는 객체)를 사용하여
//		//out.prinln() 메서드를 실행한다 (인자 num5를 넣고!)
//		//(Console창에 num5변수에 있는 값을 출력)
//		System.out.println(num5);

		keyPressExample();
		calcExample();

	}

	private static void calcExample() {
		// TODO Auto-generated method stub
		
	}

	public static void keyPressExample() throws IOException {

		// 디버깅모드 : 코드를 한줄씩 인식하여 알고리즘 어떻게 흘러가는 보는 모드
		// 장점1. 변수 모두다 확인 가능 (현재 코드 줄수에서 변수 데이터 확인)
		// 장점2. 코드 한 줄씩 보기 때문에 사람이 식별할 수 있는 속도

		// 에어컨 리모콘 만들기
		// 현재 온도는 30도이다
		// 냉방모드에서 1번을 누르면 온도 1감소.
		// 2를누르면 온도 1증가하는 메뉴가 있다
		// 리모콘 메뉴를 만드시오
		// 더불어, 3을 누르면 터보모드로 최저온도인 18도로 세팅이된다.

		boolean air = true;
		int keyCode = 0;
		int tem = 30;

		while (air) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("*******************************");
				System.out.println("1. 온도감소 2.온도증가 3.터보모드");
				System.out.println("선택하세요");
			}
			keyCode = System.in.read();

			if (keyCode == 49) {
				tem--;
				System.out.println("온도가1도 내려갑니다 현재온도는" + tem + "입니다.");
			} else if (keyCode == 50) {
				tem++;
				System.out.println("온도가1도 올라갑니다 현재온도는" + tem + "입니다.");
			} else if (keyCode == 51) {
				tem = 18;
				System.out.println("온도가" + tem + "도가 됩니다. 터보모드입니다.");
			}

			if (tem < 18) {
				tem = 18;
			}

		}
	}

	public static int solution(int n) {
		int answer = n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0 && i / j != 1 && i / j != i) {
					answer--;
					break;
				}
			}
		}
		return answer;
	}

}
