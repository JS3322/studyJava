package code00000010;

import java.util.Scanner;

public class java90_0092_studentQuestion2 {

	static Scanner input = new Scanner(System.in);

	static String[] nameList = new String[25];
	
	public static void init() {
		nameList[0]="권지혜";
		nameList[1]="김건희";
		nameList[2]="김민기";
		nameList[3]="김정환";
		nameList[4]="김지희";
		nameList[5]="김현중";
		nameList[6]="박경환";
		nameList[7]="박송헌";
		nameList[8]="박유진";
		nameList[9]="박주성";
		nameList[10]="성진현";
		nameList[11]="심규태";
		nameList[12]="양희수";
		nameList[13]="이도연";
		nameList[14]="이우창";
		nameList[15]="이재형";
		nameList[16]="이준배";
		nameList[17]="이지훈";
		nameList[18]="이진수";
		nameList[19]="장민욱";
		nameList[20]="정윤호";
		nameList[21]="정하륜";
		nameList[22]="조은빈";
		nameList[23]="최수현";
		nameList[24]="허영주";
	}

	public static void main(String[] args) {
		init();
		System.out.println(nameList[0]);
		System.out.println("자리를 배치하려면 Enter키 입력");
		input.nextLine();
	};

}
