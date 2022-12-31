import java.util.ArrayList;

public class main {

    //1개만 존재하는 변수
    static ArrayList<String> group1 = new ArrayList<>();
    static ArrayList<String> group2 = new ArrayList<>();
    static ArrayList<String> group3 = new ArrayList<>();

    static String[] wantBackend = {"조예찬","성하늘","이지현","장영훈","윤승원","김지혁"};

    public static int random() {
        return (int) ((Math.random()*11)+1);
    }

    public static boolean check() {

        return false;
    }

    public static void main(String[] args) {
        for (int i = 0; i<wantBackend.length; i++) {
            System.out.println(random());
            System.out.println(wantBackend[i]);
            System.out.println("----------");
        }


//        group1.add("강수희");
//        group1.add("이수지");
//        group1.add("송지선");
//
//        group2.add("박태식"); 성하늘, 조예찬, 윤승원
//        group3.add("박성현"); 이지현, 김지혁, 장영훈

        //각 학생분들의 이름에 맞춰서 랜덤 숫자 뽑아서 작은 순서대로 정렬 > 2그룹 넣기

    }
}
