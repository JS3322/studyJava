package code20220919;

import java.io.IOException;
import java.util.Random;
//JVM안에 있는 Scanner라는 객체(클래스)를 가져다 쓴다! (선언)
//import 가져다 쓴다!
import java.util.Scanner;

public class java03_memoryAndNumber {

	public static void main(String[] args) throws IOException {

		// 20220919 history
		// 1. 메모리와 system.in(buffer) / out
		// 2. 연산속도와 알고리즘(분할정복법)
		// 3. 정확한 수 (정수 계산)
		//정수로 일단 계산하고 후에 소수점으로 표기할 것
		// 4. 삼항연산자
		//항이 3개인데, 1번째 항은 조건식, 2번째 항은 true값일경우,
		//3번째 항은 false일경우
		questionStep1_1();
	}

	public static void inputDataProcess() {
		// Scanner : JVM밖에서 데이터를 입력받는 메서드
		// Scanner()입력받기 <-> println()출력하기

		// Scanner타입으로 input변수 선언!
		// new Scanner(System.in); 인스턴스 Scanner실행하여 input변수에 할당(저장)
		// System.in : System객체에 입력받아서 처리하는 in객체를 담아서 인자값으로 전달
		Scanner input = new Scanner(System.in);
		// System.out(출력) <-> System.in(입력)

		System.out.println("당신의 이름은 무엇입니까?");
		// input.nextLine(); Scanner 선언한 input변수의
		// netLine() 메서드를 실행하면
		// 사용자가 입력한 String문자를
		// =(대입연산자) 좌측에 inputData변수에 할당(저장)
		String inputData = input.nextLine();
		int inputDataInt = input.nextInt();
		boolean inputDataBoolean = input.nextBoolean();

		System.out.println("나의 이름은 " + inputData);
	}

	public static void exactNum() {
		// 2진수로 표현하면 숫자를 정확하게 나타낼 수 없다!
		// 항상 10진수는 [2진수 변환한 뒤에 계산 하고] 다시 10진수로 표현!
		// 2진수 표기 후 나머지를 무한대로 출력할 경우
		// 타입에 따라 표기할 수 있는 범위의 한도에 의해 소수점 특정자리까지만 표현
		System.out.println(0.1 + 0.2);

		// int타입으로 apple변수를 선언
		// =(대입연산자) 우측에 있는 1을 좌측 apple변수에 할당(저장)
		int apple = 1;
		int totalPieces = apple * 10;
//		double pieceUnit = 0.1;
		int number = 7;
		int temp = totalPieces - number;

		// 소수점 표기를 정수로 우선 계산하고 다시 소수점 영역으로 변환
		// 정수를 정확히 표현이 가능하다!
		double result = temp / 10.0;

		// double타입으로 result변수이름 선언
		// =(대입연산자) 우측에 apple변수를 메모리에서 가져온 뒤
		// number변수 데이터와 priceUnit변수 데이터를 곱한 값을
		// 뺀 값을 result변수에 저장
//		double result = apple - number*pieceUnit;

		System.out.println("사과 한 개에서 ");
		System.out.println("0.7 조각을 빼면, ");
		System.out.println(result + " 조각이 남는다.");

	}

	public static void memoryCheck() {
		// int num5(선언부) : int타입 num5변수명으로 메모리에 선언
		// =(대입연산) 우측의 5라는 숫자를 num5변수에 할당
		// (메모리 영역 안에 num5변수 영역에 5라는 숫자가 있음!)
		int num5 = 5;

		// 규칙1. 항상 대입연산자 우측 연산을 완료 후 좌측 변수에 할당(저장)
		// 규칙2. 우측에서 항상 좌측에 있는 산술연산자부터 실행하기
		// (num5*2; num5변수를 먼저 가져오고, 2숫자를 곱한다(*))

		// = num5*2; 메모리 영역 안에 num5변수 영역의 숫자 5를 가져온다
		// 가져온 숫자 5를 *2연산을 실행한다 (CPU에서 작업 실행)
		// 연산 완료 후 =(대입연산자) 좌측에 있는 num5변수에 결과값을 할당(저장)
		num5 = num5 * 2;
		// System이라는 객체(JVM에 기본적으로 제공하는 객체)를 사용하여
		// out.prinln() 메서드를 실행한다 (인자 num5를 넣고!)
		// (Console창에 num5변수에 있는 값을 출력)
		System.out.println(num5);
	}
	
	public static int menuChoice(int MenuChoice, int MenuCount) {
		int price = 0;
		if(MenuChoice == 1) {
			price = 2000;
		}else if(MenuChoice == 2) {
			price = 4000;
		}else if(MenuChoice == 3) {
			price = 4500;
		}
		return price*MenuCount;
	}
	
	
	public static void questionStep1() {
		System.out.println("|---------------------------|");
		System.out.println("|----안녕하세요  떡볶이 집입니다---|");
		System.out.println("|--------메뉴를선택하세요. ------|");
		System.out.println("|1. 매운 떡볶이 : 가격 개당 2000원|");
		System.out.println("|2. 마늘 떡볶이 : 가격 개당 4000원|");
		System.out.println("|3. 엽기 떡볶이 : 가격 개당 4500원|");
		
	
		
		//Scanner타입으로 scanMenu변수이름 선언
		//new 객체생성(도구생성)
		//Scanner라는 도구를 새로 생성한다 (인자는 System.in을 쓰겠다)
		//System.in 컴퓨터 키보드와 같은 입력을 받을 수 있는 도구를 사용하는 객체
		//생성된 도구(객체)는 scanMenu메모리 영역에 저장
		Scanner scanMenu = new Scanner(System.in);
		//int타입으로 MenuChoice변수이름 선언!
		//=(대입연산자) 우측에 scanMenu변수에 있는 Scanner도구를 메모리에서
		//가져와서 nextInt()메서드를 실행!
		//실행하면 키보드의 입력값(int타입으로)을 받아서
		//menuChoice 변수에 할당(저장)
		int MenuChoice = scanMenu.nextInt();
		//개수 입력
		System.out.println("개수를 입력하세요");
		int MenuCount = scanMenu.nextInt();
		//결과 출력
		
		//table의 개수는 4개, 1~4까지 있음
		//tableNum 사용자가 입력하는 테이블의 숫자를 저장하는 변수 선언
		int tableNum = 0;
		//고객이 앉는 테이블 번호 입력 받음
		//int i의 초기값은 0으로 1번만 돌면 종료되는 조건 i<0을 갖고 실행
		for(int i = 0; i<1; i++) {
			System.out.println("서빙 받을 테이블 숫자를 입력하세요");
			//이미 만들어진 tableNum변수를 가져다 씀
			//scanMenu.nextInt(); 사용자가 입력한 정수를 tableNum에 할당(저장)
			tableNum = scanMenu.nextInt();
			//tableNum <=4 조건이 성립하면 true
			//tableNum > 0 조건 성립하면 true
			//&& 두 조건이 모두 성립하면 true
			if(tableNum <=4 && tableNum > 0) {
				System.out.println(tableNum +"테이블 입니다");
			}else {
				//조건이 성립되지 않으면 i는 1감소
				i--;
				System.out.println("다시 입력 해 주세요");
			}
			//조건이 성립되지 않으면 이 줄에서는 i가 -1
		}
		
		
		
		String menuString = "";
		int price = 0;
		if(MenuChoice == 1) {
			menuString = "매운 떡볶이";
			price = 2000;
		}else if(MenuChoice == 2) {
			menuString = "마늘 떡볶이";
			price = 4000;
		}else if(MenuChoice == 3) {
			menuString = "엽기 떡볶이";
			price = 4500;
		}
		System.out.println("주방장님 메뉴 들어왔습니다!");
		System.out.println(tableNum+"테이블의 ");
		System.out.println("선택한 메뉴는 "+menuString+" 이고, ");
		System.out.println("메뉴의 개수는 "+MenuCount+" 입니다 ");
		
		System.out.println("결제 금액은 다음과 같습니다");
		System.out.println(tableNum+"테이블의 ");
		System.out.println("총 정산 금액은 "+ price*MenuCount);
		
		//if, for, else, Scanner, println
		//당신은 떡볶이 집 운영자 입니다.
		//오더를 자동화 하기 위해 키오스크 시스템을 만들려고 합니다.
		//다음과 같은 떡볶이 메뉴를 출력하고, 
		//고객명과 입력받은 떡볶이를 주방장과 결제시스템에게 
		//데이터를 전달하는 시스템을 구축하시오.
		//메뉴)
		//1. 매운 떡볶이 : 2000원
		//2. 마늘 떡볶이 : 4000원
		//3. 엽기 떡볶이 : 4500원
	}
	
	public static void questionStep1_1() throws IOException {
		//당신 옆 가게 떡볶이 집이 잘되는 것을 부러워하는 돈가스 집의 오너입니다.
		//다음과 같은 메뉴를 가진 키오스크 시스템을 구축하시오.
		//1. 안심 돈가스 : 9000원
		//2. 등심 돈가스 : 8000원
		//(단, 고객을 확하기하기 위해 
		//만원이상이면 10%할인, 2만원이상이면 20%할인을 하는
		//만원 단위별로 10%씩 증가하는 
		//최대 50%할인 대박세일을 진행하려 합니다)
		
		//keycode, totalPrice, discountPrice변수 메모리 영역을 할당
		//0이라는 숫자를 넣는다!
		int keycode = 0;
		int totalPrice = 0;
		int discountPrice = 0;
		
		//메뉴를 다 받을 때까지 while돌도록 만듬
		while(true) {
			//keycode가 13, 10모두 아닐 경우에 {}코드영역 실행
			//keycode != 13 : keycode가 13이 아니면, 참!(true)
			// A && B : A조건 B조건 모두 성립해야 true >> {}코드영역 실행
			if (keycode != 13 && keycode != 10) {
				System.out.println("---------------------");
				System.out.println("1. 안심 돈가스 : 9000원");
				System.out.println("2. 등심 돈가스 : 8000원");
				System.out.println("3. 주문 완료");
			}
			//in.read(); 메서드로 키보드의 키 코드를 받아서
			//변수 keycode에 저장 (enter key 13 10코드 존재)
			keycode = System.in.read();
			if(keycode == 49) {
				totalPrice += 9000; // totalPrice = totalProce + 9000;
			}else if(keycode == 50) {
				totalPrice += 8000;
			}else if(keycode == 51) {
				//3번 키 51코드를 누르면 break;로 while종료
				break;
			}
		}
		
		//if문은 조건절이 성립되면 하단에 있는 if else문 조건은 확인하지 않음
		//범위 계산 예) 1만원 이상 2만원이상 확인 할 필요없이
		//앞에 if문에서 1만원이하 경우를 확인했으므로 
		//두 번째 if문 1만원 이하의 조건은 따로 확인 할 필요 없음
		if(totalPrice<10000) {
			//할인0%
			discountPrice = totalPrice;
		}else if(totalPrice<20000) {
			//할인10%
			discountPrice = (int)(totalPrice * 0.9);
		}else if(totalPrice<30000) {
			//할인20%
			discountPrice = (int)(totalPrice * 0.8);
		}else if(totalPrice<40000) {
			//할인30%
			discountPrice = (int)(totalPrice * 0.7);
		}else if(totalPrice<50000) {
			//할인40%
			discountPrice = (int)(totalPrice * 0.6);
		}else if(totalPrice<60000) {
			//할인50%
			discountPrice = (int)(totalPrice * 0.5);
		}
		
		System.out.println("할인 전 금액은 "+totalPrice+" 입니다");
		System.out.println("할인 후 금액은 "+discountPrice+" 입니다");
		
//		//Scanner 타입으로 scan변수이름 선언
//		//new Scanner Scanner객체를 "새로 생성하여" scan 변수에 할당(저장)
//		//단, 인자값 System.in을 을 넣어서 키보드와 연동되도록 지정
//		Scanner scan = new Scanner(System.in);
//		System.out.println("결제 금액은?");
//		//scan변수에 있는 Scanner를 가져다가 nextInt()메서드를 실행하여
//		//사용자가 입력한 키보드 값을 price변수에 할당(저장)
//		int price = scan.nextInt();
//		//(price * 0.6) 소수점 연산이므로 int타입이 아님!
//		//int타입은 소수점 연산보다 범위가 작으므로
//		//(int)타입으로 강제 형변환하여 price 타입 int와 동일하게 맞춰서 할당(저장)
//		price = (int)(price * 0.6);
//		System.out.println("할인 된 금액 = "+price);
//		//(price>5000)? price는 5000보다 큰가? true / false 확인
//		// A결과 : B결과 // true이면 A결과, false이면 B결과 출력
//		System.out.println((price>5000)? "5000원보다 비쌉니다":"5000원보다 쌉니다");
	}
	
	public static void questionStep2Grade() {
		//점수가 90점 이상이면 수, 
		//자동 계산하는 메서드를 구축
	}
	
	public static void questionStep2Fuit() {
		//배, 사과, 오렌지를 키우는 농장이 있다
		//생상량은 각각 5, 6, 7개이다
		//하루당 생산되는 과일의 개수?
		//시간당 과일의 생산 갯수를 출력 (float avg = total/ 24f);
	}
	

	
	public static void question2Figure1() {
		//*
		//2중 for문을 사용하여 다음 도형을 만드시오
		//1 2 3 4 5 6 7 8 9
		//2 3 4 5 6 7 8 9 1
		//3 4 5 6 7 8 9 1 2
		//...
		//printf :  %d
		//System.out.printf("%d ", num);
		//System.out.print(); 줄띄기 안함
		for(int i = 1; i<=10; i++) {
			for(int j = 0; j< 10; j++) {
				int num = i + j;
				if(num > 10) {
					num = num - 10;
				}
				System.out.printf("%d ", num);
			}
		}
		
		for(int i = 0; i< 10; i++) {
			for(int j = 1; j<11; j++) {
				if(i+j > 10) {
					System.out.print(i+j-10);
				}else {
					System.out.print(i+j);
				}
			}
			System.out.println();
		}
		
		for(int i = 0; i< 10; i++) {
			for(int j = 1; j < 11; j++) {
				if((i+j) % 10 == 0) {
					System.out.println(+10);
				}else {
					System.out.println((i+j)%10);
				}
				
			}
			System.out.println();
		}
	}
	
	public static void questionStep2Random1() {
		//*
		//변수 money에 10~5000사이의 랜덤수(난수)를 발생시킨다
		//오락실 동전 교환기는 투입된 금액을 자동으로 변환시켜 준다
		//단, 1의 자리 숫자는 0이 되도록 한다 (ex) 3390, 1020..
		//발생된 money를 동전으로 바꾸면 각 동전이 몇개씩 필요한지 판단하는 코드 작성
		
		int[] coin = {500, 100, 50 , 10};
		int money = new Random().nextInt(500) + 1; //500
		money *= 10;
		System.out.println("금액 = "+money);
		
		for(int i = 0; i< coin.length; i++) {
			int res = money/coin[i]; //몫 구하기
			System.out.println(coin[i]+" 원 : "+res);
			money %= coin[i];//나머지로 다음 동전
		}
	}
	
	public static void questionStep2() {
		
	}
	
	public static void questionStep3Calc() {
		//계산기 만들기
		//scanner로 특정 입력값을 받으면 자동으로 사칙연산하여
		//결과를 출력하는 시스템을 구축하시오
		//equals()
		Scanner scan = new Scanner(System.in);
		
	}
	
	public static void questionStep5자동과수동가위바위보() {
		//random()
		//사용자의 입력값을 받아서 가위바위보를 하는 게임과
		//자동으로 가위바위보를 반복적으로 하는 게임을 만드시오
	}
	
	public static void questionStep6중간값맞추기() {
		//랜덤 숫자를 지정하고 그 수치보다 크다 작다라고 표현
		//최종적으로 수치를 찾기
	}
	
	public static void questionStep7리모콘만들기() {
		//특정 신호 문자열이나 숫자를 받으면 채널이나 음량을 변환하는 리모콘 만들기
	}
	
	public static void questionStep4신호등() {
		//교통정체구간에 적용할 시스템을 구축
		//1. 차량 100대가 있습니다
		//2. A블럭에서 20대 차량이 정지할 수 있고,
		//B블록에서 50대 차량이 정지할 수 있습니다.
	}
	
}
