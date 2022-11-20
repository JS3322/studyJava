package code20220920;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class java04_0002_forwhile {

	// 20220920 history
	// 1.for와 while과 System.in.read()과 math.random()
	// while(boolean) : boolean타입으로 true값일 경우 무한 반복
	// while문이 할 수 있는 것은 for문이 다 할 수 있음!
	// int num = (int) (Math.random() * n)+startNumber;
	// equals() : 문자열 비교 (숫자 비교 == 유사)

	// 2.반복문과 break와 continue
	// continue : 하단 코드 생략하고 처음으로 돌아가기
	// 3.if와 switch
	// do while : 먼저 실행되는 코드가 있고 나중에 반복문

	public static void main(String[] args) throws Exception {
		keyPressExample2();
	}

	public static void studyForWhile() {
		// for문 : 반복문 : 특정값 기준으로 조건이 성립할 때까지 코드 반복
		// 메모리에 sum이라는 변수를 선언하고 (타입은 int)
		// 0이라는 숫자를 =(대입연산자)를 통해 sum에 할당(저장)
		int sum = 0;
		// 초기식 : int i = 1; i변수 기준으로 1부터 시작한다
		// 조건식 : i<=100; i는 100이하일 때까지 for문을 실행한다
		// 증감식 : i++; for문 1번 돌 때마다 i는 1씩 증가한다
		for (int i = 1; i <= 100; i++) {
			// sum + i; sum이라는 변수를 가져다가 i를 더하여
			// =(대입연산자)를 통해 sum이라는 변수에 할당 (저장)
			// sum = sum + i
			// 1 = 0 + 1;
			// 3 = 1 + 2;
			// 6 = 3 + 3;
			// 10 = 6 + 4;
			sum = sum + i;
		}
		System.out.println(sum);
		// sum 변수의 값을 0으로 저장
		sum = 0;
		int i = 1;
		// for문 계속 돌기 (조건식 없으므로 무한 돌기)
		for (;;) {
			sum = sum + i;
			// if조건이 성립되면 {}코드 안에 break; 코드가 실행되어
			// 가장 가까운 for문을 종료 시킴
			if (i >= 100) {
				break;
			} else {
				i++;
			}
		}
		System.out.println(sum);

		// boolean 타입은 true/false값만 넣을 수 있음
		// boolean타입 flag변수이름으로 메모리에 영역 선언
		// =(대입연산자)를 통해 true값을 flag변수에 할당(저장)
		boolean flag = true;
		// 0이라는 숫자를 sum변수를 가져다가 저장
		sum = 0;
		i = 1;
		// while() : 조건이 true일 때까지 무한 반복
		while (true) {
			// i를 2로 나누어서 나머지가 0일경우 (짝수)
			// {}코드영역에 코드를 실행
			if (i % 2 == 0) {
				System.out.println(i);
			}
			// 짝수일 경우만 출력하고,
			// 1~100보다 작을 때까지 while문을 돌리시오
			// i++; 후위연산자로 i값을 먼저 출력하고, i를 1증가
			i++;
			// if(i==100)i의 값을 메모리에서 가져와서
			// 100이라는 숫자와 동일하면 {}코드 영역을 실행
			// {}코드영역의 break;를 실행하여
			// 가장 가까운 for문을 종료
			if (i > 100) {
				break;
			}
		}
	}

	public static void keyPressExample3() throws IOException {
		long startNanotime = 0;
		long endNanotime = 0;
		int keycode = 0;
		int currentTemper = 30;
		for (;;) {
			endNanotime = System.nanoTime();
			System.out.println("연산속도는 " + (endNanotime - startNanotime) / 1000000000.0);
			System.out.println("-----------------------------------");
			System.out.println("1. 온도1감소 |2. 온도1증가 | 3. 최저온도냉방");
			for (;;) {
				keycode = System.in.read();
				startNanotime = System.nanoTime();
				if (keycode != 13 && keycode != 10) {
					break;
				}
			}
			if (keycode == 49) {
				currentTemper--;
			} else if (keycode == 50) {
				currentTemper++;
			} else if (keycode == 51) {
				currentTemper = 18;
			}

			if (currentTemper < 18) {
				currentTemper = 18;
			}
			System.out.println("현재 온도는 " + currentTemper);
		}
	}

	public static void keyPressExample2() throws IOException {
		// 에어컨 리모콘 만들기
		// 현재 온도는 30도이다
		// 냉방모드에서 1번을 누르면 온도 1감소,
		// 2를 누르면 온도 1증가를 메뉴가 있다
		// 리모콘 메뉴를 만드시오
		// 더불어, 3을 누르면 터보모드로 최저 온도인 18도로 세팅이 된다

		long startNanotime = 0;
		long endNanotime = 0;

		int keycode = 0;
		int currentTemper = 30;

		while (true) {

			if (keycode != 13 && keycode != 10) {
				endNanotime = System.nanoTime();
				System.out.println("연산속도는 " + (endNanotime - startNanotime) / 1000000000.0);
				System.out.println("-----------------------------------");
				System.out.println("1. 온도1감소 |2. 온도1증가 | 3. 최저온도냉방");
			}
			keycode = System.in.read();
			startNanotime = System.nanoTime();
			// 1번
			if (keycode == 49) {
				currentTemper--;
			} else if (keycode == 50) {
				currentTemper++;
			} else if (keycode == 51) {
				currentTemper = 18;
			}

			if (currentTemper < 18) {
				currentTemper = 18;
			}
			System.out.println("현재 온도는 " + currentTemper);
		}

	}

	// throws Exception 코드 중에 키보드 또는 마우스 입력값을
	// 받아서 실행하는 코드 일 경우 JVM밖에서 일어나는 에러를
	// (상정)처리하기 위한 선언
	public static void keyPressExample() throws Exception {

		boolean run = true;
		int speed = 0;
		int keycode = 0;

		while (run) {
			// keycode가 13이 아니고 (!=) >> true : 13이 아니면 사실이다
			// keycode가 10이 아니면 (!=) >> true : 10이 아니면 사실이다
			// 두 개 다 true(사실)일 때만 {}코드 영역 실행
			if (keycode != 13 && keycode != 10) {
				System.out.println("----------------------");
				System.out.println("1. 증속 |2. 감속 | 3. 중지");
			}
			// System.in.read(); 메서드를 사용하여 사용자가 입력한 키보드 값 받기
			// 단, enter키를 눌렀으므로 13 10이라는 코드를 같이 받음
			// while문을 입력받은 값 1번, 13코드 1번, 10 코드 1번 총 3번의
			// while문을 실행한다
			// (System.in.read();에서 전달받은 코드가
			// 모두 다 전달되어 비워질 때까지!)
			keycode = System.in.read();

			// keycode의 값이 49일 경우 {}코드 영역 실행
			if (keycode == 49) {
				speed++;
				System.out.println("현재 속도는 " + speed);
			} else if (keycode == 50) {
				speed--;
				System.out.println("현재 속도는 " + speed);
			} else if (keycode == 51) {
				// 메모리에 있는 run이라는 변수를 가져와서
				// flase값을 =(대입연산자)로 할당(저장)
				run = false;
			}
		}
		System.out.println("프로그램 종료");
//		while (true) {
//			// System.in.read(); 키보드의 입력값을 정수로 변환하여 전달
//			//단, enter키가 있어서 3번에 입력값을 받음 = while문 3번실행
//			// 전달된 값은 =(대입연산자)를 통해 keycode변수에 할당(저장)
//			int keycode = System.in.read();
//			System.out.println(keycode);
//			//keycode로 입력받은 값이 0일 경우
//			//정수 48을 인식한다, 단, enter키를 눌렀기 때문에
//			//13하고 10도 같이 인식한다
//			//즉, 0과 enter를 누르면 49 13 10이라는 숫자를 인식한다
//			if(keycode==48) {
//				System.out.println("0");
//			}else if(keycode==49) {
//				System.out.println("1");
//			}else if(keycode==50) {
//				System.out.println("2");
//			}else if(keycode==51) {
//				System.out.println("3");
//			}
//
//		}
	}

	public static void questinBetweenNumber() {
		// 변수 n1과 n2에 값 사이에 합을 계산하여 출력하는 프로그램
		// 예) 2,5 일경우 3,4의 합
	}

	public static void questionLoopNumber() {
		// 1부터 100까지 반복하는 문장에서 3의 배수만 출력
	}

	public static void questionLotto() {
		// 로또 숫자 랜덤 발생
	}

	public static void chamchamchamGame() {
		// 위, 아래, 좌, 우 랜덤으로 발생시키는 참참참에 맞춰서
		// 키보드 입력을 3초 내에 실행
		// while(for), if, nanoTime()또는 시간 계산, in.read()
	}

	public static void makeGame() {
		// 랜덤으로 숫자와 사칙연산을 발생시켜서
		// 사용자는 빠른 시간내에 답변을 하는 게임을 만드시오
		// nanoTime()과 math.random() 메서드 사용
	}

}
