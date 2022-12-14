package workshop;

import java.util.Random;

public class GamblingSimulator {
    public static final int stakePerDay = 100;
    public static final int betPerGame = 1;
    public static final int win = 1;
    public static int stake = 0;
    static int daysWonCount = 0;
    static int daysLostCount = 0;
    public static void winCheck() {
        Random random = new Random();
        int betReturns = random.nextInt(2);
        if (betReturns == win) {
            stake++;
        } else {
            stake--;
        }
        System.out.println("stake = " + stake);

    }

    public static void resignDayCheck() {
        int totalStake = 0;
        while (stake != 50 && stake != -50) {
            winCheck();
        }
        totalStake = stake + stake;
        System.out.println("Total stake for resign for a day is  " + totalStake);

    }

    public static void monthlyWinOrLossCheck() {
        int day;
        for (day = 1; day <= 20; day++) {
            System.out.println("day " + day);
            resignDayCheck();
            if (stake == 50) {
                daysWonCount++;
            } else if (stake == -50) {
                daysLostCount++;
            }
        }
        System.out.printf("days won for a month = " +daysWonCount+ "\ndays lost for a month = " +daysLostCount);

    }


    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulation");
        monthlyWinOrLossCheck();
    }

}
