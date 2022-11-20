package code00000010;

import java.util.Scanner;

public class java09_0091_questionTest {

//	   private static final int A = 0;

	   // main(); 자 프로그램의 가장 처음 시작되는 메서드(시작점이자 끝)
	   public static void main(String[] args) {

	      // 사칙연산 계산기 method ver
	      // +, -, *, / 연산을 하는 메서드를 만드시오
	      // 단, 하나의 기능하는 메서드를 다수 만들어서
	      // 복합적으로 구성하시오
	      int intA = 20;
	      Scanner scan = new Scanner(System.in);

	      view_welcome();

	      view_numberPlz();
	      int temp_num = scan.nextInt();
	      scan.nextLine();

	      view_stringPlz();
	      String temp_oper = scan.nextLine();

	      view_numberPlz();
	      int temp_num_second = scan.nextInt();
	      scan.nextLine();

////	      view_numberPlz1();
//	      int temp_num_third = scan.nextInt();
//	      scan.nextLine();
	//
////	      view_stringPlz2();
//	      int temp_num_four = scan.nextInt();
//	      scan.nextLine();

	      temp_num = calc_plus1(temp_num, temp_num_second);
	      
	      System.out.println(temp_num);
	      
	      //temp_num값이 temp_num과 temp_num_second 합산 상태에서
	      //calc_start에 인자값으로 전달 되어진 상황
	      temp_num = calc_start(temp_num, temp_oper, temp_num_second);

	      System.out.println(temp_num);
//	            //int intA : int타입으로 intA 변수명을 메모리에 선언
//	            //=(대입연산자) 우측 항의 20이라는 숫자를
//	            //좌측 항 intA변수에 할당 (저장)
//	            int intA = 20;
//	            Scanner scan = new Scanner(System.in);
//	            //하단에 있는 view()메서드를 호출하여 실행
//	            view();
	      // scan이라는 변수를 메모리에서 불러옴
	      // scan이 갖고 있는 nextInt();메서드를 실행
	      // 실행하면 키보드에서 입력받은 숫자를 intA에 할당(저장)
//	            intA = scan.nextInt();
//	            scan.nextLine();
//	            String oper = scan.nextLine();
//	            
//	            if(oper.equals("*20")) {
//	               intA = calcA20(intA);
//	            }else if(oper.equals("-10")) {
//	               intA = calcB10(intA);
//	            }

	      // calc(intA); intA 변수를 메모리에서 받아오고,
	      // calc(); 메서드의 인자값으로 넣음,
	      // calc(intA); 메서드 실행
	      // 실행 결과 값(retrun)을
	      // =(대입연산자) 좌측 항의 intA 변수에 할당(저장)

//	            System.out.println(intA);

	   }

	   private static void view_welcome() {
	      System.out.println("안녕하세요");
	      System.out.println("계산기입니다");
	      System.out.println("----------------");
	      System.out.println("첫 번째 숫자를 입력하고 ");
	      System.out.println("연산자를 입력하고 ");
	      System.out.println("두 번째 숫자를 입력하면 ");
	      System.out.println("계산결과가 출력됩니다");
	      System.out.println("----------------");
	   }

	   private static void view_numberPlz() {
	      System.out.println("숫자를 입력하시오");
	   }

	   private static void view_stringPlz() {
	      System.out.println("문자를 입력하시오");
	   }

	   

	   private static int calc_start
	   (int A, 
	   String B, 
	   int C) {
	      int result = 0;

	      if (B.equals("+")) {
	         result = calc_plus1(A,C);
	      } else if (B.equals("-")) {
	         result = calc_minus(A,C);
	      } else if (B.equals("*")) {
	         result = calc_multi(A,C);
	      } else if (B.equals("/")) {
	         result = calc_div(A,C);
	      }

	      return result;
	   }

	   private static int calc_plus1(int A, int B) {
	      return A + B;
	   }

	   private static int calc_minus(int A, int B) {
	      return A - B;
	   }

	   private static int calc_multi(int C, int D) {
	      return C * D;
	   }

	   private static int calc_div(int C, int D) {
	      return C / D;
	   }

	   public static int calcA20(int intABCDE) {
	      return intABCDE * 20;
	   }

	   public static int calcB10(int intABCDE) {
	      return intABCDE - 10;
	      
	   }
	   // cacl(); 실행을 하면 아래 메서드가 실행
	   // (int intA) 인자값으로 받은 데이터를 intA라는 이름으로 설정
	   // return은 메서드 실행이 종료되면 반환해주는 값

}
