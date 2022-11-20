import java.util.ArrayList;

public class startJava0031 {

    //todo 20221117
    //1. 비교알고리즘과 순서도 : 숫자비교(가장 큰 값, 정렬), 삼항연산자 : 교안(책)
    //2. 회원가입정보 기능 추가 : 수정, 삭제
    //3. 가위바위보 게임 만들기와 컴퓨터끼리 가위바위보하기
    //4. Integer.parsInt()와 Map 컬렉션 프레임워크

    //4. 가위바위보 게임 통계분석하고 예측하기

    // Q0031
    // 1. 랜덤으로 숫자 3개를 뽑아서, 가장 큰 값을 찾는 메서드 만들기
    // 2. 랜덤으로 숫자 4개를 뽑아서, 1번째로 가장 큰값, 두 번째로 큰값, 세 번째로 큰값 찾기



    //랜덤으로 저장되는 배열
    static int[] numList = new int[4];

    //크기 순으로 정렬된 배열
    static ArrayList<Integer> result = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("hello world");

        // 1. 랜덤으로 배열에 값 저장
        randomArrayInit();

        //2. 배열의 값 출력
        randomArrayView();

        //1,2,3등 큰 값 출력하기
        sortOutputNumber();

        System.out.println("정렬된 큰수들의 값을 출력");
        //정렬된 큰수들의 값을 출력
        randomSortView();


        //변수 = (조건식) ? TRUE값 : FALSE값
//        int result = (10>5) ? 20 : 10;
//        boolean result1 = (20>10) ? true : false;
//        String result2 = (50<20) ? "김준석" : "박준석";
//        System.out.println(result2);
    }

    private static void randomSortView() {
        for (int i = 0; i<result.size(); i++) {
            System.out.println((i+1)+"번째 값 : "+result.get(i));
        }
    }

    private static void randomArrayView() {
        for (int i = 0; i<numList.length; i++) {
            System.out.println(numList[i]);
            //가장 큰 값을 찾는 알고리즘 만들기
        }
        //가장 큰 값 출력
        System.out.println("가장 큰 값 : "+biggerNumberSearch(numList));
    }

    private static void randomArrayInit() {
        for(int i = 0; i<numList.length; i++) {
            numList[i] = random();
        }
    }

    private static void sortOutputNumber() {

        int temp1_1 = numList[0];
        int temp1_2 = 0;
        int temp2_1 = numList[numList.length-1];
        int temp2_2 = 0;

        for(int i=1;i<numList.length/2 ;i++) {
            int output = numList[i];
            //0,1번째 배열의 값을 비교하여 temp1(1등), temp2(2등)값을 할당
            if(temp1_1 < output) {
                temp1_2 = temp1_1;
                temp1_1 = output;
            }else if(temp1_1 > output) {
                temp1_2 = output;
            }
        }

        for(int i=numList.length-2; i>=numList.length/2; i--) {
            int output = numList[i];
            if(temp2_1 < output) {
                temp2_2 = temp2_1;
                temp2_1 = output;
            } else if (temp2_1 > output) {
                temp2_2 = output;
            }
        }

        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        if(temp1_1 > temp2_1) {
            result1 = temp1_1;
            result2 = temp2_1;
            //if(2등인 temp2_1과 1등그룹의 2등 temp1_2와 비교)
            if(result2 > temp1_2) {
                result3 = temp1_2;
            }else {
                result3 = result2;
                result2 = temp1_2;
            }
        } else if (temp1_1 <= temp2_1) {
            result1 = temp2_1;
            result2 = temp1_1;
            //if(2등인 temp1_1과 1등그룹의 2등 temp2_2와 비교)
            if(result2 > temp2_2) {
                result3 = temp2_2;
            }else {
                result3 = result2;
                result2 = temp2_2;
            }
        }

        //Integer는 int와 동일한 정수의 값이나,
        //heap영역에 저장되는 참조타입으로 null값 구분짓는 정수타입이다
        result.add(result1);
        result.add(result2);
        result.add(result3);


        //*분할정복정 렬
        //0,1,2,3 중에 0,1비교하고, 2,3비교하고
        //0,1의 큰 값과 2,3의 큰 값 비교
        //0,1의 작은 값과 2,3의 작은 값
        //단, 예외적으로
        // 10, 9 비교 후 10이 큰 값
        // 8, 7 비교 후 8이 큰 값으로 인식하여
        // 10, 8비교해서 2등이 8로 인식되는 오류(예외상황)을 처리 할 필요 있음
    }

    private static int biggerNumberSearch(int[] numList) {
        //가장 처음 값 가져오기 (=가장 큰 값을 저장하는 temp변수)
        int temp = numList[0];
        for (int i = 1; i<numList.length;i++) {
            // 1. 배열에 있는 값을 꺼내기
            int output = numList[i];
            // 2. 꺼낸 값 temp와 비교하기?
            //변수 = (조건식) ? TRUE값 : FALSE값
            temp = (temp < output) ? output : temp;
//            if (temp < output) {
//                temp = output;
//            }
        }
        // 3. 비교한 값 중에 큰 값을 출력하기 = temp
        return temp;
    }

    //랜덤으로 1~10숫자 출력
    public static int random() {
        return (int)(Math.random()*10)+1;
    }
}
