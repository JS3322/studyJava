package code00000010;

/*
 * 자바파일 생성 날짜
 * 자바파일 작성자
 * 자바파일 사용처
 * 
 */
public class java90_0002_programersCustomExam {

	// 메인메서드 : 자바 프로그램의 시작점!
	public static void main(String[] args) {
	
		// 자바의 시작점은 public static void main에서 시작
		// 순차적으로 한 줄씩 실행
		// examEvenAndOddCustom(); 코드가 실행!
		double result = examEvenAndOddCustom(30);
		System.out.println(result);
		// public static void examEvenAndOddCustom이 실행
		// examEvenAndOddCustom 내용이 다 실행되면 다음 줄 실행

		// 관점 : 하나의 행동, 물체 모든 것을 다양한 시점으로 보는 것
		// 1.개발자 관점 : 코드의 가독성 : 다른 사람이 본인의
		// 코드를 객관적으로 분석할 수 있는가?
		// --변수이름 : 변수이름으로 변수(메서드, 클래스 이름)의 속성을
		// 알 수 있어야 한다 (구체적으로 쓰기)
		// --띄어쓰기 : 코드영역{}을 구분짓고, 가독성을 높혀서 본인 코드
		// 보기 편하게 수정할 것
		// --조건절, 반복문의 위치를 전체적으로 볼 수 있도록 코드 정렬
		// 2.컴퓨터(시스템) 관점: 리소스 관리(컴퓨터 성능 최적화)
		// --컴퓨터가 개발자가 쓴 코드를 해석하고 실행하는 횟수를 줄이는 작업
		// 시간적 튜닝(알고리즘 개선(빅오표기법))
		// 공간적 튜닝(메모리 공간 개선(변수의 갯수를 줄이는 작업)
		// <3>.사용자 관점: (일반 유저) > 문제해결능력
	};
	
	// 짝수와 홀수
	public static double examEvenAndOddCustom(int num) {
		//long nanoTime : long이라는 타입으로 nanoTime 변수이름 선언
		//=(대입연산자) 우측의 System이라는 객체의 nanoTime() 메서드를 사용하여
		//현재 시각을 정확히 받아서 좌측 nanoTime이라는 변수에 할당(저장)
		long nanoTime = System.nanoTime();
		//여러분이 만든 메서드(알고리즘)이 컴퓨터는 몇 초만에 처리를 하는가?
		//nanoTime(); = 현재 시간을 명확히 알려줌
		//시작점과 끝나는 시점의 시간을 서로 빼면 알고리즘 동작시간
		//nanoTime() java5버전 이후 가장 정확하게 시각을 알려주는 메서드
		
		double count = 0;
		double count2multiple = 0;
		double count3multiple = 0;
		double count4multiple = 0;
		double count5multiple = 0;
		
		// (i가)1부터 30까지 1씩 증가하면서 그 숫자가
		// 2,3,4,5의 배수인지 확인하는 for문
		for (int i = 1; i <= num; i++) {
			// i의 숫자가 2의 배수인지 확인 (2로 나누어서 나머지가 0이면 2의 배수)
			if (i % 2 == 0) { 
				count++;
				count2multiple++;
				if (i % 4 == 0) {
					count++;
					count4multiple++;
				}
			}
			if (i % 3 == 0) {
				count++;
				count3multiple++;
			}
			
			if (i % 5 == 0) {
				count++;
				count5multiple++;
			}
		}
		
		System.out.println(count);
		//1) 2,3,4,5의 배수의 개수 중 비교해서 많은 배수의 수를 갖고 있는 변수 만들기
		//?의 배수의 값이 많다 라는 결과
		
		//1. 요구사항이 무엇인가? (정답에 필요한 데이터가 무엇이냐?)
		//(2번째로 많은 배수는 무엇인가 = 2번째로 많은 배수의 갯수 + 배수 전부 확인)
		//2. 확인하게 출력할 수 있는 것이 무엇이냐?
		
		//2번째로 많은 배수의 갯수를 가진/ 개수를 저장하는 변수
		//저장된 변수의 개수를 모두 ==으로 비교해서 2번째로 많은 배수를 모두 찾기
		double resultRank2 = 0;
		
		//정복분할법 (4개의 배수 중 2개씩 나눠서 우위 확인)
		double resultGroup1Rank1 = 0;
		double resultGroup1Rank2 = 0;
		double resultGroup2Rank1 = 0;
		double resultGroup2Rank2 = 0;
	
		
		//1그룹의 1등과 2등
		if(count2multiple >= count3multiple) {
			resultGroup1Rank1 = count2multiple;
			resultGroup1Rank2 = count3multiple;
		}else {
			resultGroup1Rank1 = count3multiple;
			resultGroup1Rank2 = count2multiple;
		}
		//2그룹의 1등과 2등
		if(count4multiple >= count5multiple) {
			resultGroup2Rank1 = count4multiple;
			resultGroup2Rank2 = count5multiple;
		}else {
			resultGroup2Rank1 = count4multiple;
			resultGroup2Rank2 = count5multiple;
		}
		//1그룹의 1등과 2그룹의 1등 비교
		if(resultGroup1Rank1 >= resultGroup2Rank1) {
			//EX)1그룹의 2등이 2그룹의 1등보다 배수의 개수가 많을 경우?
			if(resultGroup2Rank1 >= resultGroup1Rank2 ) {
				resultRank2 = resultGroup2Rank1;
			} else {
				resultRank2 = resultGroup1Rank2;
			}
		}else {
			if(resultGroup1Rank1 >= resultGroup2Rank2 ) {
				resultRank2 = resultGroup1Rank1;
			} else {
				resultRank2 = resultGroup2Rank2;
			}
		}
		
		String resultMessage = "2등은 ";
		
		//2등은 누구인가?
		if(resultRank2 == count2multiple) {
			resultMessage = resultMessage + "2의 배수 ";
		}
		if(resultRank2 == count3multiple) {
			resultMessage = resultMessage + "3의 배수 ";
		}
		if(resultRank2 == count4multiple) {
			resultMessage = resultMessage + "4의 배수 ";
		}
		if(resultRank2 == count5multiple) {
			resultMessage = resultMessage + "5의 배수 ";
		}
		
		System.out.println(resultMessage + "입니다. " 
						+ resultRank2 + " 개의 배수가 있습니다");
		
		long endNanoTime = System.nanoTime();
		//소수점 표기 형변환을 위해 1000000000.0 소수점으로 나눈다고 코드에 명시
		System.out.println("연산속도는 "+ (endNanoTime - nanoTime)/1000000000.0);

		// (1)
		// 1부터 매개변수 num까지 범위 내에서 = for문 쓰기
		// 2의 배수, 3의 배수, 4의 배수, 5의 배수의 경우
		// 2의 배수 : 2,4,6,8,10,12...
		// 3의 배수 : 3,6,9,12,15...
		// 4의 배수 : 4,8,12,16...
		// 5의 배수 : 5,10,15,20...
		// >>?의 배수는 ?으로 나누어서 나머지가 0인 수
		// 각각
		// System.out.println(i+"의 값은 ?배수 입니다!")
		// 문구를 출력하고, main메서드에서
		// (2)
		// examEvenAndOddCustom return값인 [2의 배수,] 3의 배수, 4의 배수, 5의배수의
		// 개수를 double타입의 숫자로 출력하시오
		// (3)
		// 2,3,4,5의 배수의 갯수 중에 2번 째로 많은 배수의 갯수를 가진
		// ?배수의 이름을 출력하시오 (단, 지금까지 배웠던 내용을 활용하여 작성하세요)

		// int num은 double로 자동형변환(casting)이 가능함
		// () 강제형변환 가능
		return count;
	}

	// 나머지가 1이 되는 수 찾기
	public static void examRemainderOneCustom(int num) {
		//num-1
		//매개변수 n을 받아서 i로 나눈 나머지가 1인 
		//가장 큰 자연수 i를 리턴하도록 구현하시오.
		//(단, 컴퓨터 입장에서 최소한의 연산으로 구현 해 보세요)
		int result = 0;
		int i = num;
		for(;num==2;num--) {
			if(i%num == 1) {
				result = i;
				break;
			}
		}
		
		
		
		//나머지가 1이 되는 가장 작은 수 int1과
				//나머지가 1이 되는 가장 많은 수 int2의 
				//차이 만큼 num의 숫자를 후위 증감연산자 num++을 하되,
				//차이나는 횟수(n)의 값이 절반보다 커지면 종료하는 구문을 만드시오
				//(단, 코드를 가장 적게 쓰도록 노력해보세요)
		
	}

	// 두 정수 사이의 합
	public static void examSumBetweenTwoIntegerCustom() {

	}

	// 부족한 금액 계산하기
	public static void examInsufficientAmountCalcCustom() {

	}

	// 2016년
	public static void exam2016yearCustom() {

	}

}
