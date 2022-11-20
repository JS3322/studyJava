package code20220920;

import java.util.Scanner;

public class java04_0005_randomAndEquals {

	public static void main(String[] args) {
		
		// 랜덤숫자를 출력하는 메서드 Math.random();의 결과는 소수점이기 때문에
		// double 타입 num 변수를 선언하고 0을 num변수 메모리에 저장
		int num = 0;
		int exNum = 0;
		int lotto1 = 0;
		int lotto2 = 0;
		int lotto3 = 0;
		int lotto4 = 0;
		int lotto5 = 0;
		int lotto6 = 0;
		// 초기식 i =0; 조건식 i<10; 증감식 i++(for문 한 번 돌때마다 1씩 i증가)
		for (int i = 0; i < 6; i++) {
			exNum = (int)(Math.random()*45)+1;
			System.out.println(exNum);
			
			
			
			if(lotto1 == 0) {
				//lotto1 변수에
				//=(대입연산자)를 통해서
				//exNum변수의 값을 가져다가 할당(저장)
				
				//exNum변수에 예를 들어 23이라는 숫자가 있다고 가정한다면, 
				//=(대입연산자) 우측부터 시작하여, 
				//exNum변수를 메모리에서 불러가다 값을 가져온다
				//23이라는 숫자가 가져와져서, 
				//=(대입연산자) 좌측에 있는 lotto1이라는 변수에 할당(저장)
				lotto1 = exNum;
				
			}else if(lotto2 == 0) {
				lotto2 = exNum;
			}else if(lotto3 == 0) {
				lotto3 = exNum;
			}else if(lotto4 == 0) {
				lotto4 = exNum;
			}else if(lotto5 == 0) {
				lotto5 = exNum;
			}else if(lotto6 == 0) {
				lotto6 = exNum;
			}
			
			// 0.0~0.999 곱하기 10,100하면
			// 0.0~9.999, 0.0~99.999
			// 메모리 num이라는 변수에다가 Math.random()메서드로 실행한 값을
			// 저장
			// Math.random(); 소수점 표기한
			// 0.0보다 크거나 같고 1.0보다 작은 값 출력(0.99999..)
			// (int)로 형변환(캐스팅)을 하면 소수점이 다 짤려서 출력 = 0
			// num이 double타입이기 때문에 0을 0.0으로 형변환(캐스팅)하여
			// num에 저장
//			num = (int) (Math.random() * 45) + 1;
//			System.out.println(num);
			
			//Math.random(); 소수 표기이므로 정수 표현인 int타입에 맞지 않음
		}
		
		System.out.println("로또 번호는 ");
		System.out.println(lotto1+"/"+lotto2+"/"+lotto3+"/");
		System.out.println(lotto4+"/"+lotto5+"/"+lotto6+"/");

//      Scanner scan = new Scanner(System.in);
//      String inputData = "";
//      Scanner scanner = new Scanner(System.in);
//      String result = "";
//      String study = "";
//      for(;;) {
//         System.out.println("값을 입력하시오!");
////       inputData = scan.nextLine();
//         //A.equals("B")
//         //equals()메서드를 사용하여 A변수의 데이터(문자열)와
//         //"B"문자를 비교해서 참이면(true)이면 {}코드 영역 실행
//         //유사) == :숫자 비교
//
//         //변수 study 에 특정 문자열을 검증해서 어떤 공부를 할지 출력하시오
//         //이것은 자바다 = 자바공부 시작
//         //JQuery = javascript언어 공부
//         //Spring = spring freamwork공부
//         //SQL = Data Base공부
//         //HTML,CSS = frontend공부
//         //아두이노 = 임베디드 공부
//
//         //Scanner타입으로 scanner변수명으로 메모리에 선언
//         //=(대입연산자)를 통해 새로만든 Scanner도구를 할당(저장)
//         //단, 키보드와 연동할 수 있는 System.in객체를 사용(인자값)
//
//
//         //scanner도구를 가져다가 nextLine();메서드를 사용해서
//         //키보드의 값을 study 변수에 저장
//         study = scanner.nextLine();
//         //study.equals("비교문자열")
//         //study는 String타입으로
//         //.equals()메서드를 사용해서 문자열 값을 비교
//         if(study.equals("이것은 자바다")) {
//            result = "자바 공부 시작!";
//         }else if(study.equals("Jquery")) {
//            result = "Jquery 공부 시작!";
//         }else if(study.equals("SQL")) {
//            result = "Data base 공부 시작!";
//         }else if(study.equals("HTMLCSS")) {
//            result = "HTML / CSS 공부 시작!";
//         }else if(study.equals("Spring")) {
//            result = "SpringFreamwork 공부 시작!";
//         }
//         System.out.println(result);
//      }

	}

}