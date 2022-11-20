

import java.util.ArrayList;

public class startJava0052_liteVersion_log {
    static int WinRockCount = 0;
    static int WinPaperCount = 0;
    static int WinScissorsCount = 0;

    static void setLog() {
        for(int item : startJava0052_liteVersion.winRPS) {
            if(item == 0) {
                WinScissorsCount++;
            } else if (item == 1) {
                WinRockCount++;
            } else if (item == 2) {
                WinPaperCount++;
            }
        }
    }

    static void getLog() {
        System.out.println(WinPaperCount);
        System.out.println(WinRockCount);
        System.out.println(WinScissorsCount);
    }
}
