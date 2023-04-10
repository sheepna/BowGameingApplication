package cn.edu.jnu.x2020100489;

public class BowlingGame {
    private int []everyRollPin=new int[21];
    private int currentRoll=0;

    public void roll(int pin) {
        everyRollPin[currentRoll]=pin;
        currentRoll++;
    }

    public int score() {
        int score=0;
        for (int rollIndex=0;rollIndex<everyRollPin.length;rollIndex++){
            score+=everyRollPin[rollIndex];
            if(rollIndex<19){
                if(10==everyRollPin[rollIndex]+everyRollPin[rollIndex+1]){
                    score+=everyRollPin[rollIndex+2];
                }
            }
        }
        return score;
    }
}
