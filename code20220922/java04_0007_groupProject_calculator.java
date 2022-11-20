package code20220922;

import java.util.Scanner;

public class java04_0007_groupProject_calculator {

	//main(); 자바 프로그램의 가장 처음 시작되는 메서드 (시작점이자 끝)
	public static void main(String[] args) {
		
		//20220922 history
		//1. 메모리와 메서드 호출 개념
		//2. 사칙연산 계산기 프로젝트
		//3. continue;
		//4. switch();
		
		
		// 사칙연산 계산기 method ver
		// +, -, *, / 연산을 하는 메서드를 만드시오
		//단, 하나의 기능하는 메서드를 다수 만들어서 
		//복합적으로 구성하시오

		//Scanner타입으로 scan변수이름을 선언
		//=(대입연산자) Scanner도구를 만들어서(new)
		//좌측 항 scan변수에 저장(할당)
		Scanner scan = new Scanner(System.in);
		
		//main()메서드 밖에 있는 view_welcome()메서드를 가져다가(호출) 실행
		view_welcome();
		
		//숫자1입력받기
		view_numberPlz();
		//int타입으로 temp_num변수이름 선언
		//=(대입연산자) 우측 항 실행
		//scan 변수를 호출하여 (메모리에 있는 scan변수를 호출)
		//nextInt()메서드를 실행 >> 키보드에서 입력받은 숫자를 가져옴
		//대입연산자 좌측항에 있는 temp_num 변수에 저장
		int temp_num = scan.nextInt();
		//버퍼에 남아 있는 개행문자를 깨끗히 청소하기 위한 nextLine()메서드 실행
		//nextLine()메서드를 실행하면 버퍼에 문자열이 있는지 확인하고
		//\n(엔터 개행문자)가 남아 있기 때문에 문자열로 취급하여 가져감
		scan.nextLine();
		System.out.println(temp_num);
		//연산자 입력받기
		String temp_oper = "";
		view_stringPlz();
		for(;;) {
			temp_oper = scan.nextLine();
			//if(operation_check()) 
			//if조건절에 true false인지 확인만 하므로
			//operation_check메서드의 retrun값을 
			//true/false로 만들면 조건절로 바로 사용가능
			if(operation_check(temp_oper)) {
				break;
			}
			view_stringRePlz();
		}
		System.out.println(temp_num+temp_oper);
		//숫자2입력받기
		view_numberPlz();
		int temp_num_second = scan.nextInt();
		scan.nextLine();
		System.out.println(temp_num+temp_oper+temp_num_second+"=");
		
		temp_num = calc_start(temp_num, temp_oper, temp_num_second);
		
		System.out.println(temp_num);
		
//		//int intA : int타입으로 intA 변수명을 메모리에 선언
//		//=(대입연산자) 우측 항의 20이라는 숫자를
//		//좌측 항 intA변수에 할당 (저장)
//		int intA = 20;
//		Scanner scan = new Scanner(System.in);
//		//하단에 있는 view()메서드를 호출하여 실행
//		view();
		//scan이라는 변수를 메모리에서 불러옴
		//scan이 갖고 있는 nextInt();메서드를 실행
		//실행하면 키보드에서 입력받은 숫자를 intA에 할당(저장)
//		intA = scan.nextInt();
//		scan.nextLine();
//		String oper = scan.nextLine();
//		
//		if(oper.equals("*20")) {
//			intA = calcA20(intA);
//		}else if(oper.equals("-10")) {
//			intA = calcB10(intA);
//		}
		
		//calc(intA); intA 변수를 메모리에서 받아오고,
		//calc(); 메서드의 인자값으로 넣음,
		//calc(intA); 메서드 실행
		//실행 결과 값(retrun)을 
		//=(대입연산자) 좌측 항의 intA 변수에 할당(저장)
		
//		System.out.println(intA);
		
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
	
	//사칙연산 확인
	private static boolean operation_check(String B) {
		boolean result = false;
		if(B.equals("+")) {
			result = true;
		}else if(B.equals("-")) {
			result = true;
		}else if(B.equals("*")) {
			result = true;
		}else if(B.equals("/")) {
			result = true;
		}else if(B.equals("**")) {
			result = true;
		}
		return result;
	}
	
	private static int calc_start
	(int A, 
	String B, 
	int C) {
		int result = 0;
		
		if(B.equals("+")) {
			result = calc_plus(A,C);
		}else if(B.equals("-")) {
			result = calc_minus(A,C);
		}else if(B.equals("*")) {
			result = calc_multi(A,C);
		}else if(B.equals("/")) {
			result = calc_div(A,C);
		}else if(B.equals("**")) {
			result = calc_squa(A, C);
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
		return (int)Math.log10(A);
	}
	private static int calc_logAB(int A, int B) {
//		return (int) (Math.log10(A) / Math.log10(B));
		return (int) (Math.log(A) / Math.log(B));
	}

	//cacl(); 실행을 하면 아래 메서드가 실행
	//(int intA) 인자값으로 받은 데이터를 intA라는 이름으로 설정
	//return은 메서드 실행이 종료되면 반환해주는 값
	
	private static void continueTest() {
		for(int i = 0; i<10; i++) {
			if(i%2 == 0) {
				//continue : for문{}코드영역 처음으로 돌아간다
				//continue 실행 > 
				//1. for문 {}코드영역 처음으로 돌아감
				//2. for문은 한 바퀴 돌았으므로, 증감식 i++실행
				//3. 조건식 i<10; 이 성립하는지 확인
				//4. 다음 for문 실행
				continue;
			}
			System.out.println("숫자 "+i);
		}
	}
}
