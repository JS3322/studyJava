

import java.util.ArrayList;
import java.util.Scanner;

public class java05_0007_racingGame {
	
	
	static int[] raceLine = new int[3];

	static int bet = 0;
	
	public static void main(String[] args) {
		
		System.out.println("몇 번 말에게 배팅하시겠습니까?");
		Scanner scan = new Scanner(System.in);
		
		bet = scan.nextInt();
		
		System.out.println("시작합니다");
		
		for(;;) {
			System.out.println("1번 말 = "+raceLine[0]);
			System.out.println("2번 말 = "+raceLine[1]);
			System.out.println("3번 말 = "+raceLine[2]);
			
			raceLine[0] += (int)(Math.random() * 5);
			raceLine[1] += (int)(Math.random() * 5);
			raceLine[2] += (int)(Math.random() * 5);
			
			if(raceLine[0]>100 || 
					raceLine[1]>100 ||
					raceLine[2]>100
					) {
				break;
			}
		}
		System.out.println("당신은 "+bet+" 말에게 배팅했습니다");
		for(int i = 0; i<raceLine.length; i++) {
			System.out.println(i+"번 말 = "+raceLine[i]);
		}
		
	}

}
