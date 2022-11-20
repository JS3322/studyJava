

import java.util.Arrays;
import java.util.Collections;

public class java05_0005_studentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] listStudentName = new String[25]; 
		
		listStudentName[0] = "권지혜";
		listStudentName[1] = "김건희";
		listStudentName[2] = "김민기";
		listStudentName[3] = "김정환";
		listStudentName[4] = "김지희";
		listStudentName[5] = "김현중";
		listStudentName[6] = "박경환";
		listStudentName[7] = "박송헌";
		listStudentName[8] = "박유진";
		listStudentName[9] = "박주성";
		listStudentName[10] = "성진현";
		listStudentName[11] = "심규태";
		listStudentName[12] = "양희수";
		listStudentName[13] = "이도연";
		listStudentName[14] = "이우창";
		listStudentName[15] = "이재형";
		listStudentName[16] = "이준배";
		listStudentName[17] = "이지훈";
		listStudentName[18] = "이진수";
		listStudentName[19] = "장민욱";
		listStudentName[20] = "정윤호";
		listStudentName[21] = "정하륜";
		listStudentName[22] = "조은빈";
		listStudentName[23] = "최수현";
		listStudentName[24] = "허영주";
		
//		for(int i = 0; i<listStudentName.length; i++) {
//			System.out.println(listStudentName[i]);
//		}
		
		//1. 자기 이름이 몇 번째 배열[i]인지 출력하시오
		boolean check = false;
		for(int i = 0; i<listStudentName.length; i++) {
			if(listStudentName[i].equals("장민욱1")) {
				System.out.println(i+"번째 입니다!");
				//문자열이 숫자보다 더 우선순위이기 때문에 자동형변환
				//문자+숫자 = 문자로 인식!
				//1.번호는+19 > 문자열로 변환
				//2.번호는 19+1 > (문자열+숫자) 문자열로 변환
				System.out.println("번호는 "+(i+1));
				check = true;
				break;
			}
			
		}
		if(!check) {
			System.out.println("해당되는 학생이 없습니다");
		}
		
		//2. 가나다라 순으로 배열을 정렬하여 출력하시오
		//String 문자열은 각 문자를 하나씩 더한 값
		//ex)김+준+석 = 김준석
		//각 문자를 char타입 ex)김
//		String temp = "";
//		String name = "나가";
//		//String문자를 char타입으로 하나씩 저장
//		//char[]배열 타입으로 test변수 선언
//		//String문자인 name변수를 가져와서
//		//toCharArray() 메서드를 사용하여
//		//String문자열을 하나씩 분해한 뒤에 
//		//test변수에 저장
//		char[] test = name.toCharArray();
////		for(int i =0; i<test.length; i++) {
////			System.out.println(test[i]);
////		}
//		//char 문자열 마다 비교
//		if(test[0]>test[1]) {
//			System.out.println("큰 문자는 "+test[0]);
//		}else {
//			System.out.println("큰 문자는 "+test[1]);
//		}
//
		//학생 이름을 비교
//		String testA = "가가가";
//		String testB = "가가나";
//		System.out.println("---------");
//		//A.compareTo(B) 메서드를 사용하여 A와 B를 비교한 뒤 크면 true
//		//작으면 false
//		//A>B 문자열로 비교하여 아스키코드(indexNumber)가 크면 A가 출력
//		if(testA.compareTo(testB)>0) {
//			System.out.println(testA);
//		}else {
//			System.out.println(testB);
//		}
		//학생 목록을 자동 정렬
//		for(int i = 0; i<listStudentName.length; i++) {
//			System.out.println(listStudentName[i]);
//		}
//		//Arrays객체 있는 sort()메서드를 사용하면
//		//안에 있는 인자값(배열)이 자동 정렬
//		//sort(배열이름, 정렬방식);
//		Arrays.sort(listStudentName, Collections.reverseOrder());
//		System.out.println("---------");
//		for(int i = 0; i<listStudentName.length; i++) {
//			System.out.println(listStudentName[i]);
//		}
//		
		//3. 랜덤으로 자리를 0~24개를 배치한 학생 이름을 출력하시오
		//1)0~24까지 숫자를 랜덤으로(중복없이) 배열에 저장하기
		int[] saveNumList = new int[25];
		for(int i=0; i<saveNumList.length; i++) {
			saveNumList[i] = random_count0_24();
			for(int k=0; k<i; k++) {
				if(saveNumList[i] == saveNumList[k]) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0; i<saveNumList.length; i++) {
			System.out.println(saveNumList[i]);
		}
		
		System.out.println("-------------");
		//2) 교실 자리 배치를 console창에 출력하시오
		//1/ 2/ 3/ 4/ 5
		//6/ 7/ 8/ 9/ 10
		//11/ 12 /13 /14 /15
		//16/ 17/ 18/ 19
		//20/ 21/ 22/ 23
		//24/ 25
		
		//변수j는 1줄 당 몇 명씩 자리를 배치하는가를 위한 변수
		int j = 1;
		for(int i=0; i<saveNumList.length; i++) {
			//활용 개념 : %(나머지), for, if
			//기타 : break 등등
			//0~14(즉, 15명까지는 한 줄에 5명씩)
			if(i<15) {
				//한 줄 당 5명이면 한 줄 띄기
				if(j%5 == 0 ) {
					//1) saveNumList[i] i값이 index이므로
					//index를 통해 안에 있는 random숫자 하나를 뽑음
					//2) 뽑은 랜덤 숫자는 int이므로
					//이 숫자를 사용하여 listStudentName배열의 i값으로 사용하여
					//학생 이름을 출력
					System.out.print(listStudentName[saveNumList[i]]+"/");
					System.out.println();
				// 그외에는 1명씩 자리 차지하기                                                         
				}else {
					System.out.print(listStudentName[saveNumList[i]]+"/");
				}
				if(i == 14) {
					j = 0;
				}
			//15~24까지
			}else {
				if (j % 4 == 0) {
					System.out.printf(listStudentName[saveNumList[i]]+"/");
					System.out.println();
				} else {
					System.out.printf(listStudentName[saveNumList[i]]+"/");
				}
			}
			j++;
		}
		
		
	}
	
	private static int random_count0_24() {
		return (int) (Math.random() * 25);
	}

}
