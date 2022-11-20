package code20220920;

import java.io.IOException;

public class java04_0003_forwhile_airCon {

	public static void main(String[] args) throws IOException {
		// 에어컨 리모콘 만들기
		// 현재 온도는 30도이다 : 초기값은 30
		// 냉방모드에서 1번을 누르면 온도 1감소,
		// 2를 누르면 온도 1증가를 메뉴가 있다
		// 리모콘 메뉴를 만드시오
		// 더불어, 3을 누르면 터보모드로 최저 온도인 18도로 세팅이 된다

		long startNanotime = 0; 
		//키를 눌렀을 때부터 새로운 메뉴가
		//나올 때까지의 시간
		long endNanotime = 0;

		int keycode = 0; //키보드의 값을 저장하는 변수 >> 메모리에 저장
		int currentTemper = 30; //현재 온도

		//while(true) ()조건식이 true이면 계속 반복
		while (true) {
			//in.read()메서드에서 받은 코드가 13, 10 모두 아닐 경우
			//&&로 모두 참이면 if {}코드 영역 실행
			//keycode != 13 : keycode변수의 값이 13이 아니면! 맞다!(참)
			//keycode != 10 : 변수의 값이 10아니면! 맞다(참)
			//&& 두 조건이 모두 참이면 결론적으로 참이다!
			//두 조건 중에 하나라도 거짓이면(false)이면 결론적으로 거짓이다!
			if (keycode != 13 && keycode != 10) {
				endNanotime = System.nanoTime();
				System.out.println("연산속도는 " + (endNanotime - startNanotime) / 1000000000.0);
				System.out.println("-----------------------------------");
				System.out.println("1. 온도1감소 |2. 온도1증가 | 3. 최저온도냉방");
			}
			//System.in.read();
			//System이라는 JVM내장 객체를 가져와서
			//im.read()메서드를 실행하면
			//컴퓨터에 연결된 키보드가 입력하는 값을 받아서 자바code에 전달
			//전달된 값은 keycode 변수에 저장
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

}
