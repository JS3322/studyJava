package code20220921;

public class java04_0006_randomExample {

	public static void main(String[] args) {
		//랜덤 숫자 1~10까지 중에 3개의 숫자를 뽑습니다
		//그 숫자 중에 가장 큰 수를 출력하시오
		
		//랜덤으로 숫자 3개를 넣겠다
		int randomResultValue_1 = 0;
		int randomResultValue_2 = 0;
		int randomResultValue_3 = 0;
		
		//랜덤함수의 값을 저장하는 변수
		int randomNum = 0;
		
		for(int i =0; i<3; i++) {
			//=(대입연산자) 우측에 연산내용
			//Math.random(); jvm에서 제공하는 내장 메서드로
			//실행을 하면 0.0~0.99999..숫자가 랜덤으로 출력
			//Math.random()*10; 
			//0.0 * 10 ~ 0.9999.. * 10 : 
			//(int) 0 ~ 9까지 출력 (랜덤)
			//0.0*10 = 0 (0하고 곱하면 무조건 0)
			//0.999.. * 10 = 9.9999
			//(int)강제형변환으로 소수점 자르기
			//0~9까지 랜덤 출력
			//+1을 하면 1~10까지 숫자 중에 랜덤으로 출력
			randomNum = (int)(Math.random()*10)+1;
			if(randomResultValue_1 == 0) {
				randomResultValue_1 = randomNum;
			}else if(randomResultValue_2 == 0) {
				randomResultValue_2 = randomNum;
			}else if(randomResultValue_3 == 0) {
				randomResultValue_3 = randomNum;
			}
		}
		
		//randomResultValue_? 변수에 각각 랜덤 값을 할당(저장)
		randomResultValue_1 = (int)(Math.random()*10)+1;
		randomResultValue_2 = (int)(Math.random()*10)+1;
		randomResultValue_3 = (int)(Math.random()*10)+1;
		
		//각 randomResultValue_? 변수 2개씩 비교하여 큰 숫자를 확인하면
		//나머지 변수와 비교하여 최종적으로 어떤 수가 큰지를 알 수 있다
		//randomResultValue_1과 randomResultValue_2비교
		if(randomResultValue_1 > randomResultValue_2) {
			//randomResultValue_1과 randomResultValue_3비교
			if(randomResultValue_1 > randomResultValue_3) {
				//randomResultValue_1은 2와 3과 비교를 다 하여
				//최종적으로 randomResultValue_1이 크다는 결론 도출
				System.out.println("Value_1이 크다!");
			}else {
				System.out.println("Value_3이 크다!");
			}
		}else {
			if(randomResultValue_2 > randomResultValue_3) {
				System.out.println("Value_2이 크다!");
			}else {
				System.out.println("Value_3이 크다!");
			}
		}

		System.out.println(randomResultValue_1);
		System.out.println(randomResultValue_2);
		System.out.println(randomResultValue_3);

	}

}
