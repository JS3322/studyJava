public class startJava0002 {

    //
    public static void main(String[] args) {
//        System.out.println("hello world");
//        int[] numArray = {1, 3, 5, 7, 9};
//        String[] stringArray = {"김준석", "이준석", "박준석"};
//        System.out.println(numArray[0]);
//        System.out.println(stringArray[1]);
//
//        stringArray[1] = "나준석";
//        numArray[0] = numArray[0]+10;
//        System.out.println(stringArray[1]);
//        System.out.println(numArray[0]);

        //고정배열 크기 할당 : 배열의 크기가 지정
        //배열의 영역(메모리 영역)이 할당되어 있으므로
        //메모리 읽고 쓰는데 속도가 빠름
        String[] studentName = {};
        String[] studentName_array = new String[4];

        //HTML, CSS, python, pandas 4가지 과목을 배운 내용에
        //자기 숙련도 5점 만점에 점수를 작성하고 자유롭게 출력하시오
        //예) 3, 4, 5, 2점의 점수를 할당하고 평균 점수를 출력
        int[] gradeArray = new int[4];
        String[] gradeName = new String[4];

        gradeName[0] = "HTML";
        gradeName[1] = "CSS";
        gradeName[2] = "Python";
        gradeName[3] = "Pandas";
        gradeArray[0] = 3; //..
        gradeArray[1] = 5;
        gradeArray[2] = 4;
        gradeArray[3] = 4;
        //평균점수 출력
        System.out.println(
                (gradeArray[0] + gradeArray[1] +
                gradeArray[2] + gradeArray[3]) / 4
                //...)/4
                );

    }
}
