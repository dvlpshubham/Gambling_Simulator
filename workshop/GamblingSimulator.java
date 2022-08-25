package workshop;

import java.util.Random;

public class GamblingSimulator {
    public static void winCheck() {
        int stakePerDay = 100;
        int betPerGame = 1;
        int win = 1;
        int stake = 0;
        Random random = new Random();
        int betReturns = random.nextInt(2);
        if (betReturns == win) {
            stake++;
            System.out.println("win");
        } else {
            stake--;
            System.out.println("loss");
        }
        System.out.println("stake = " + stake);

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulation");
        winCheck();
    }

}