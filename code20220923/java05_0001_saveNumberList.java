

import java.util.Scanner;

public class java05_0001_saveNumberList {

	public static void main(String[] args) {
		
		// 20220923 history
		// 1. 메모리의 stack과 heap과 new연산자
		// 2. 고정배열
//		
//		//고정배열 : 배열의 길이가 정해진 것
//		//배열 : 1,2,3,4,5
//		int intA = 1;
//		int intB = 2;
//		int intC = 3;
//		int intD = 4;
//		int intE = 5;
//		
//		//int타입으로배열(여러개 담을 수 있는)[] 선언
//		//이름은 intList
//		//=(대입연산자) 우측 항에 int[]타입으로 새로 독립적으로(new) 생성
//		//길이는 5 >> int[5];
//		int[] intList = new int[5];
//		
//		//메모리에 있는 intList배열 변수를 가져다가
//		//[0] 0번째 있는 배열순서에 
//		//=(대입연산자)를 통해 1이라는 숫자를 할당(저장)
//		intList[0] = 1;
//		intList[1] = 2;
//		intList[2] = 3;
//		intList[3] = 4;
//		intList[4] = 5;
//		
//		// 숫자 1부터 5까지 저장하는 고정배열을 만드시오
//		// A.length : 배열 A[]의 길이를 반환해주는 코드
//		for(int i = 0; i<intList.length; i++) {
//			System.out.println(intList[i]);
//		}
//		

//		
//		//0, 1, 2, 3
//		//자료형(클래스) 변수이름 = new 자료형(클래스)();
//		//1. int와 같이 앞에 소문자이면 기본타입으로 변수 안에 값을 저장
//		//2. String과 같은 앞의 대문자이면 같은 데이터일 경우 같은 주소값을 가짐
//		//3. 단, new 라고 붙이면 독립적인 메모리 영역을 할당하여 사용
//		//new 연산자와 리터럴 방식의 차이
////		int[] saveNumber = new int[4];
//		String testString = new String("김준석");
//		Scanner testScan = new Scanner(System.in);
//		
//		String testString_2 = new String("김준석");
//		String testString_3 = "김준석";
//		String testString_4 = "김준석";
//		
//		//System.identityHashCode() 메모리 주소를 반환해주는 메서드
//		//메모리 주소란 메모리영역을 알수 있는 번지수 (진짜 주소)
////		System.out.println(testString);
////		System.out.println(System.identityHashCode(testString));
////		System.out.println(System.identityHashCode(testString_2));
////		System.out.println(System.identityHashCode(testString_3));
////		System.out.println(System.identityHashCode(testString_4));
//		
//		// 숫자 1부터 100까지 저장하는 고정배열을 만드시오
//		//int[] int타입으로 []배열 선언, 변수이름은 intList_100
//		//=(대입연산자) 우측에 int[100] int타입으로 100개를 넣을 수 있는
//		//도구를 새로(new)만들어서 intList_100변수에 할당(저장)
//		int[] intList_100 = new int[100];
//		//for()반복문
//		//int i = 0;
//		//조건절 : i의 값은 intList_100.length(길이를 측정하는 도구)
//		//길이보다 작을 때까지 for문을 돌리겠다
//		//i++ : 증감식 (후위연산자)
////		for(int i = 0; i<intList_100.length; i++) {
////			System.out.println(intList_100[i]);
//////			intList[0]~
//////			intList[99]
//////					= 100
////		}
//		for(int i = 0; i<intList_100.length; i++) {
//			//intList_100[i] : 배열의 i번째를 가져와서
//			//=(대입연산자)를 통해 i+1의 값을 저장
//			intList_100[i] = i+1;
//		}
//		for(int i = 0; i<intList_100.length; i++) {
//			//intList_100[i] : 배열의 i번째의 값을 출력한다
//			System.out.println(intList_100[i]);
//		}
////		
//		String[] StringList_100 = new String[100];
//		for(int i = 0; i<StringList_100.length; i++) {
//			System.out.println(StringList_100[i]);
////			intList[0]~
////			intList[99]
////					= 100
//		}
////		int checkInt = 0;
//////		checkInt = 1;
//////		String checkString;
////		String checkString;
////		System.out.println(checkString);
//		
//		// 숫자 1부터 45까지 숫자를 랜덤으로 뽑아서
//		// 저장하는 고정배열을 만드시오
//		
		int[] lottoNumList = new int[6];
		for(int i = 0; i<lottoNumList.length; i++) {
			lottoNumList[i] = (int)(Math.random()*45)+1;
			//1) 예시로 랜덤으로 5숫자가 나오면
			//lottoNumList배열을 for문으로 돌려서 같은 값이 있는지 확인하기 
			//2) 같은 값이 있으면 다시 랜덤으로 뽑기
			//(continue로 처음으로 돌아가거나, 무한for문과 break사용하기 등등)
			for(int k =0; k<i; k++) {
				if(lottoNumList[i] == lottoNumList[k]) {
					System.out.println("같은 숫자를 뽑았습니다");
					i--;
					//낭비 방지
					//예를 들어 i의 값이 5이고
					//k의 값이 2이다
					//k[2]에서 같은 숫자가 나오면
					//3,4,5배열 방에 있는 값을 구지 찾을 필요가 없이
					//중복값을 찾았으므로
					//for문 종료
					break;
				}
			}
		}	
		for(int i = 0; i<lottoNumList.length; i++) {
			System.out.println(lottoNumList[i]);
		}
	}

}
