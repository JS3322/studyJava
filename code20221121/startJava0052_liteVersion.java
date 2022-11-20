

import java.util.ArrayList;

public class startJava0052_liteVersion {

    static ArrayList<Integer> winRPS = new ArrayList<>();

    public static void main(String[] args) {
        for(int i = 0; i<100; i++) {
            //randomRPS와 유사
            int play1 = random();
            int play2 = random();

            //matchPlayers와 유사
            if(play1<play2 | (play1 == 2 & play2 == 0)) {
                winRPS.add(play2);
                System.out.println("player1 = "+play1+" // player2 = "+play2);
                System.out.println("player2 승리");
            } else if (play1>play2 | (play1 == 0 & play2 == 2)) {
                winRPS.add(play1);
                System.out.println("player1 = "+play1+" // player2 = "+play2);
                System.out.println("player1 승리");
            }else {
                System.out.println("player1 = "+play1+" // player2 = "+play2);
                System.out.println("무승부");
            }
        }

        for(int i = 0; i<winRPS.size(); i++) {
            System.out.println(winRPS.get(i));
        }

        startJava0052_liteVersion_log.setLog();
        startJava0052_liteVersion_log.getLog();

    }
    static int random() {
        int result = (int)(Math.random()*3);
        return result;
    }
}
