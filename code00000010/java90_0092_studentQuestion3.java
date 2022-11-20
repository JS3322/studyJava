package code00000010;

import java.util.ArrayList;
import java.util.Scanner;

public class java90_0092_studentQuestion3 {

	static Scanner input = new Scanner(System.in);

	static ArrayList<String> nameListSize = new ArrayList<>();
	static ArrayList<Integer> positionChooser = new ArrayList<>();

	static String[] nameList = new String[25];

	public static void main(String[] args) {
		nameList();
//		System.out.println("명단이 확정되었습니다.\n자리를 배치하려면 Enter키 입력");​
		input.nextLine();
		for (int i = 0; i < nameListSize.size(); i++) {
			positionChooser.add((int) (Math.random() * nameListSize.size()) + 1);

			for (int x = 0; x < i; x++) {

				if (positionChooser.get(i) == positionChooser.get(x)) {


					break;

				}

			}

		}

		for (int i = 0; i < nameListSize.size(); i++) {

			System.out.println(positionChooser.get(i));

		}

	}

	private static void nameList() {

		System.out.println("자리배치 프로그램에 오신걸 환영합니다.\n\n");

		nameList[0] = "권지혜";

		nameList[1] = "김건희";

		nameList[2] = "김민기";

		nameList[3] = "김정환";

		nameList[4] = "김지희";

		nameList[5] = "김현중";

		nameList[6] = "박경환";

		nameList[7] = "박송헌";

		nameList[8] = "박유진";

		nameList[9] = "박주성";

		nameList[10] = "성진현";

		nameList[11] = "심규태";

		nameList[12] = "양희수";

		nameList[13] = "이도연";

		nameList[14] = "이우창";

		nameList[15] = "이재형";

		nameList[16] = "이준배";

		nameList[17] = "이지훈";

		nameList[18] = "이진수";

		nameList[19] = "장민욱";

		nameList[20] = "정윤호";

		nameList[21] = "정하륜";

		nameList[22] = "조은빈";

		nameList[23] = "최수현";

		nameList[24] = "허영주";

		System.out.println("기존 수강생의 명단은 이미 추가되었습니다.\n");

		for (int i = 0; i <= 50; i++) {

			nameListSize.add(nameList[i]);

			System.out.println("더 추가하실 이름이 있으시다면 입력하시오.\n나가려면 0 입력");

			String inputName = input.nextLine();

			if (inputName.equals("0")) {

				break;

			} else {

				nameListSize.add(inputName);

			}

		}
	}
}
