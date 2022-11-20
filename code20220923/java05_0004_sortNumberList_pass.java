

import java.util.Scanner;

public class java05_0004_sortNumberList_pass {

	public static void main(String[] args) {
		// 저장한 배열을 내림차순으로 정렬하는 프로그램을 만드시오

		Scanner scan = new Scanner(System.in);

		int[] a = new int[10];
		int i;
		int j = 0;
		int index = 0;
		int value = 0;
		for (i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		for (i = 0; i < a.length - 1; i++) {
			value = a[i];
			for (j = i + 1; j < a.length; j++) {
				if (value < a[j]) {
					index = j;
					value = a[j];
				}
			}

			if (value != a[i]) {
				a[index] = a[i];
				a[i] = value;
			}

		}
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
