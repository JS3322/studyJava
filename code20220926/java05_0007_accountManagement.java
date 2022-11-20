

import java.util.ArrayList;

public class java05_0007_accountManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//*2중 배열
		ArrayList<ArrayList<String>> arrOutLine = new ArrayList<>();
		ArrayList<String> arrInLine = new ArrayList<>();
		arrInLine.add("김준석");
		arrInLine.add("이준석");
		arrInLine.add("박준석");
		arrOutLine.add(arrInLine);
		System.out.println(arrOutLine.get(0).get(2));

		//회원가입 시스템
		//초기메뉴 1. 회원가입 2.회원목록출력 있습니다
		//1번을 누르면 회원ID와 비밀번호를 입력받습니다
		//단, 회원ID는 중복되지 말아야 합니다
		//2번 회원목록출력을 누르면 전체 회원ID가 출력됩니다
		
		//*3. 로그인 메뉴가 있습니다
		//가입한 회원ID와 비밀번호가 동일 할 경우 
		//로그인이 되었다고 출력됩니다
		//*4. 비밀번호변경 메뉴가 있습니다
		//회원ID가 동일 할 경우 비밀번호를 바꿀 수 있습니다 
	}

}
