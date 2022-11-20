

import java.util.Scanner;

public class java05_0002_saveNumverSumAndAvg {

	public static void main(String[] args) {
		// 입력받은 값을 총점과 평균을 구하는 프로그램 작성

		String[] subjectList = new String[5];
		subjectList[0] = "국어";
		subjectList[1] = "수학";
		subjectList[2] = "영어";
		subjectList[3] = "한국사";
		subjectList[4] = "세계사";
		Scanner scan = new Scanner(System.in);

		int[] score = new int[5];
		int i, sum = 0, cnt = 0;
		for (i = 0; i < score.length; i++){
			System.out.println(subjectList[i]+" 성적을 입력 해 주세요");
			score[i] = scan.nextInt();
			sum += score[i];
			cnt++;
		}
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : "+ (double) sum / cnt);

	}

}
