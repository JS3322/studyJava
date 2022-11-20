package code00000010;

public class java90_0091_studentQuestion1 {

	public static void main(String[] args) {

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


		int[] numList = new int[25];
		for (int x = 0; x < numList.length; x++) {
			numList[x] = (int) (Math.random() * 25) + 1; // o
			for (int k = 0; k < x; k++) {
				if (numList[x] == numList[k]) {
					x--;
				}
			}
		}
		for (int a = 0; a < numList.length; a++) {
			//listStudentName[numList[a]-1])
			//1. numList[a]의 값이 랜덤으로 1~25의 값을 갖고 있습니다
			//((Math.random() * 25) + 1; 1~25랜덤으로 뽑음)
			//2. listStudentName[]배열의 길이는 25이지만, 
			//카운팅은 0부터 시작해서 24이므로 25라는 숫자가 들어가면
			//에러(Index 25 out of bounds for length 25)
			//출력 됩니다
			System.out.println(numList[a] + listStudentName[numList[a]]);
		}

	}

}
