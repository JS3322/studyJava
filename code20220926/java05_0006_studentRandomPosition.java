

import java.util.ArrayList;

public class java05_0006_studentRandomPosition {
	
	//필드 : 클래스 바로 아래있는 변수	
	//초기화 변수
	//static 메모리에 한 개만 있는 변수 선언 <> 인스턴스
	static boolean returnInit = false;
	//자리 배치 횟수
	static int countLoop = 0;
	
	static ArrayList<String> studentNumArray = new ArrayList<>();
	//출력할 자리 위치 가변배열
	static ArrayList<String> positionArray = new ArrayList<>();
	
	int[] intList = new int[5];
	
	//아래 값을 할당(저장)은 행위이기 때문에 필드영역에서 실행 불가능
//	intList[0] = "김준석";	
//	positionArray.add("김준석");
	
	//초기화 값이라 실행가능
	//선언하고 바로 =(대입연산자)로 값을 설정
	static String num01 = "권지혜";
	static String num02 = "김건희";
	static String num03 = "김민기";
	static String num04 = "김정환";
	static String num05 = "김지희";
	static String num06 = "김현중";
	static String num07 = "박경환";
	static String num08 = "박송헌";
	static String num09 = "박유진";
	static String num10 = "박주성";
	static String num11 = "성진현";
	static String num12 = "심규태";
	static String num13 = "양희수";
	static String num14 = "이도연";
	static String num15 = "이우창";
	static String num16 = "이재형";
	static String num17 = "이준배";
	static String num18 = "이지훈";
	static String num19 = "이진수";
	static String num20 = "장민욱";
	static String num21 = "정윤호";
	static String num22 = "정하륜";
	static String num23 = "조은빈";
	static String num24 = "최수현";
	static String num25 = "허영주";
	
	private static void init() {
		for(int i = 0; i<25; i++) {
			positionArray.add("-");
		}
		studentNumArray.add(num01);
		studentNumArray.add(num02);
		studentNumArray.add(num03);
		studentNumArray.add(num04);
		studentNumArray.add(num05);
		studentNumArray.add(num06);
		studentNumArray.add(num07);
		studentNumArray.add(num08);
		studentNumArray.add(num09);
		studentNumArray.add(num10);
		studentNumArray.add(num11);
		studentNumArray.add(num12);
		studentNumArray.add(num13);
		studentNumArray.add(num14);
		studentNumArray.add(num15);
		studentNumArray.add(num16);
		studentNumArray.add(num17);
		studentNumArray.add(num18);
		studentNumArray.add(num19);
		studentNumArray.add(num20);
		studentNumArray.add(num21);
		studentNumArray.add(num22);
		studentNumArray.add(num23);
		studentNumArray.add(num24);
		studentNumArray.add(num25);

	}
	
	private static void fixArray() {
		initFixedPositionArray();
		initFixedStudentNumArray();
	}
	
	private static void initFixedPositionArray() {
		for(int i = 0; i<25; i++) {
			positionArray.set(i, "-");
		}
	}
	
	private static void initFixedStudentNumArray() {
		
		studentNumArray.set(0, num01);
		studentNumArray.set(1, num02);
		studentNumArray.set(2, num03);
		studentNumArray.set(3, num04);
		studentNumArray.set(4, num05);
		studentNumArray.set(5, num06);
		studentNumArray.set(6, num07);
		studentNumArray.set(7, num08);
		studentNumArray.set(8, num09);
		studentNumArray.set(9, num10);
		studentNumArray.set(10, num11);
		studentNumArray.set(11, num12);
		studentNumArray.set(12, num13);
		studentNumArray.set(13, num14);
		studentNumArray.set(14, num15);
		studentNumArray.set(15, num16);
		studentNumArray.set(16, num17);
		studentNumArray.set(17, num18);
		studentNumArray.set(18, num19);
		studentNumArray.set(19, num20);
		studentNumArray.set(20, num21);
		studentNumArray.set(21, num22);
		studentNumArray.set(22, num23);
		studentNumArray.set(23, num24);
		studentNumArray.set(24, num25);
		
	}

	public static void main(String[] args) {
		// 20220926 history
		//1. 고정배열과 가변배열(arrayList)
		//2. 조건과 메서드
		
		// *고정배열과 arrayList(가변)
//		int[] intArray3 = new int[3];
//		intArray3[0] = 10;
//		intArray3[1] = 20;
//		intArray3[2] = 30;
//		
//		System.out.println(intArray3[2]);
//		
////		intArray3[3] = 40;
////		System.out.println(intArray3[3]);
//		
//		int[] intArray4 = new int[4];
//		intArray4[0] = intArray3[0];
//		intArray4[1] = intArray3[1];
//		intArray4[2] = intArray3[2];
//		intArray4[3] = 40;
//		
//		System.out.println(intArray4[3]);
		
		//가변배열 (arrayList)
		//값을 넣을 때마다 배열의 길이가 계속 증가하는 배열
		//처음에는 배열의 칸이 없음 > 값을 넣으면(=) 배열의 칸이 생기고
		//값을 저장
		
		//Integer 정수 참조타입 (int와 비슷)
		//int[] : 고정배열 선언
		//ArrayList : 가변배열 선언
		//가변배열 안에 값은 숫자만 들어갈 수 있다 = <Integer>
		//가변배열 안에 값은 문자열만 들어갈 수 있다 = <String>
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		
//		arr.add(40);
//		
//		System.out.println(arr.get(0));
		
		//1. 지난 주에 했던 랜덤 자리 뽑기를 고정배열 > 가변배열로 코드 바꾸세요 (출력)

		//학생명단을 넣을 studentNumArray 선언
		init();
		
		//배열에 랜덤으로 학생이름 넣기
		//positionArray : 자리 위치
		//studentNumArray : 학생이름목록 (1~25)
		
		String testName = "";
		//랜덤으로 출력된 숫자(0~24)를 저장하기 위한 변수
		int randomCount = 0;

		
		//positionArray.size(); : arraylist의 칸 크기를 출력하는 메서드
		//초기식 : int i = 0;
		//조건식 : i<positionArray.size(); : i의 값이 
		//positionArray의 길이보다 작을 때까지 반복문 실행
		//증감식 : 반복문 1번 돌 때마다 i의 값이 1씩 증가
		for(int i = 0; i<positionArray.size(); i++) {
			//positionArray 배열의 초기값은 "-"로 모두 구성있기 때문에
			//학생이름을 들어가 있지 않는 배열의 칸을 찾기 위해서 
			//equals()메서드로 비교
			if(positionArray.get(i).equals("-")) {
				for(;;) {
					//random_count0_24(); 랜덤으로 0~24숫자를 뽑는 
					//메서드 실행하여 randomCount변수에 저장(=)
					randomCount = random_count0_24();
					//studentNumArray.get(randomCount);
					//random으로 뽑은 숫자의 index로 
					//studentNumArray 배열의 학생 이름을 뽑는다
					//testName 변수에 저장
					testName = studentNumArray.get(randomCount);
					//studentNumArray 배열에 "-"값이 있는 이유는
					//positionArray 배열에 학생 이름을 저장한 뒤에
					//studentNumArray 학생목록을 담당하는 배열에
					//학생이름을 삭제("-")하기 때문에 검증하기 위한 if문
					if(!testName.equals("-")) {
						if(countLoop > 500) {
							countLoop = 0;
							i = -1;
							fixArray();
							view_position(positionArray);
							break;
						}
						if(conditionTotalCheck(testName, i)) {
							//초기화 확인
							positionArray.set(i, testName);
							studentNumArray.set(randomCount, "-");
							break;
						}
						countLoop++;
					}
				}
			}
		}
		view_position(positionArray);
	}

	// 학생목록출력
	private static void view_studentList(ArrayList<String> studentList) {
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}
	}

	// 랜덤(1~25)사이의 숫자 뽑기
	private static int random_count0_24() {
		return (int) (Math.random() * 25);
	}

	private static void view_position(ArrayList<String> positionArray) {
		System.out.println("[문]--------------------------");
		int j = 1;
		for (int i = 1; i <= positionArray.size(); i++) {
			if (i <= 15) {
				if (j % 5 == 0) {
					//positionArray.get(i - 1)
					//i는 1부터 시작했으므로, 
					//배열은 0부터 시작하는 것과 맞추기 위해 i-1 숫자를 넣어서
					//학생 이름을 출력
					System.out.printf(positionArray.get(i - 1) + "/ ");
					System.out.println();
				} else {
					System.out.printf(positionArray.get(i - 1) + "/ ");
				}
				if (i == 15) {
					j = 0;
				}
			} else {
				if (j % 4 == 0) {
					System.out.printf(positionArray.get(i - 1) + "/ ");
					System.out.println();
				} else {
					System.out.printf(positionArray.get(i - 1) + "/ ");
				}
			}
			j++;
		}
		System.out.println();
	}
	
	//2. 아래 조건 method를 완성하여 149~170번째 for문에 적용하시오
	//ex) conditionPreferFrontSeat();
	//conditionPreferEdgeSeat();
	
	//3. 특정 지인과 옆 자리에서 자리를 배치 받을 수 있도록
	//조건 method를 작성하여 적용하시오
	
	//extra. 전역변수를 사용하여 특정 조건이 성립되면
	//랜덤으로 자리 뽑기를 처음부터 다시 시작하시오
	
	//4. A && B 경우 A조건과 B조건 중 어느 범위가 넓어야 효율적인가?
	//ex) A 조건은 1~30숫자 중에 15보다 크다
	//B조건은 짝수만 찾는다
	//A조건이 더 넓습니다. > &&에 앞에다가 쓰는 게 좋을지
	//뒤에다가 쓰는 게 좋을지 고민해 보세요 (hint 컴퓨터 연산 범위)
	
	//모든 조건 boolean 확인
	public static boolean conditionTotalCheck(String studentName, int position) {
		if(studentName.equals("이준배")) {
			//초기화 코드 returnInit
			return conditionPreferFrontSeat(position) 
					&& conditionPreferEdgeSeat(position);
		}
		return true;
	}
	
	//뽑힌 positionArray의 순번이 앞자리인 경우 boolean
	public static boolean conditionPreferFrontSeat(int position) {
		if(position<16) {
			return true;
		}else {
			return false;
		}
	}
	
	//뽑힌 positionArray의 순번이 가장자리인 경우 boolean
	public static boolean conditionPreferEdgeSeat(int position) {
		if(position % 5 == 0 && position < 15) {
			return true;
		}else if (position % 4 == 0 && position >= 15) {
			return true;
		} else {
			return false;
		}
	}

}
