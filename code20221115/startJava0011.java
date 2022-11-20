public class startJava0011 {

    // todo 20221115
    // 1. for/if
    // 2. scanner와 버퍼 흐름
    // 3. 객체지향 프로그래밍 구성과 유지보수 방식
    // 4. 전역변수와 지역변수(매개변수)

    // Q.0001
    // 숫자 1부터 30까지 순회(반복)하면서
    // 2로 나누어서 나머지가 없는 숫자(나머지가 0)를 출력하시오
    public static void q0001() {
        for(int i=1; i<=30; i++) {
            //if문에 조건절을 쓰시오
            if(i%2 == 0) {
                System.out.println(i+" 의 값은 나머지가 0입니다");
            }
        }
    }

    // Q.0002
    // 1048을 지속적으로 1/2로 줄인다면 몇 번에 걸쳐서 줄여야
    // 2 이하가 되는지 코드를 작성하시오
    public static void q0002() {
        //for문 변형식 (증감식 변형)
        int count = 0;
        //0.5는 int에서 0으로 소수점 버림
        for(int i = 1048; i>=1 ;i=i/2) {
            //if(조건문) : 특정조건이 만족하면 실행하는 코드블록{}
            if(i <= 2) {
                System.out.println("1048을 "+count+" 회 1/2로 줄였습니다");
            }
            count = count + 1;
        }
    }
    


    public static void main(String[] args) {
        System.out.println("hello world");
        q0002();

        //반복문
        //int num = 0; : 초기식 : 반복문이 처음 시작하는 변수설정
        //num<10; 조건식 : 반복문이 계속 실행하는 조건
        //num++; 증감식 : 반복문이 1회 돌아간 후 초기 변수가 변동하는 값을 설정
//        int i = 4;
//        for (;i<10;i=i+2) {
//            System.out.println(i);
//        }
        
        //조건문
        //조건식이 true이면 {}중괄호 실행하고,
        //false이면 실행 안하는 조건분기문
//        if(2%2 == 0) {
//            System.out.println("i는 0입니다");
//        }

//        if(i == 0) {
//            System.out.println("i는 0이 아닙니다");
//            //if조건절에 들어가지 않는 상황에서 else if조건문에 들어감
//        }else if (i == 1) {
//            System.out.println("else if");
//            //위 if문의 조건절에 들어가지 않으면 모두 else문에 들어감
//        } else {
//            System.out.println("else");
//        }

        //+,-,*,/,%(나머지 출력)
        // 3/2 = 1...1
        // 5/3 = 1...2
    }
}
