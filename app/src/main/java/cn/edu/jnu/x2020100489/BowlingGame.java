package cn.edu.jnu.x2020100489;

public class BowlingGame {
    private int []everyrollPin=new int[21];
    private int currentRoll=0;

    public void roll(int pin) {
        everyrollPin[currentRoll]=pin;
        currentRoll++;
    }

    public int score() {
        int rollIndex=0;
        int score=0;
        for (int frame=0;frame<10;frame++){
            if(everyrollPin[rollIndex]==10){
                score+=10+everyrollPin[rollIndex+1]+
                        everyrollPin[rollIndex+2];
                rollIndex+=1;
            }
            else if ((everyrollPin[rollIndex]+everyrollPin[rollIndex+1])==10){
                score+=10+everyrollPin[rollIndex+2];
                rollIndex+=2;
            }
            else {
                score+=everyrollPin[rollIndex]+everyrollPin[rollIndex+1];
                rollIndex+=2;
            }
        }
        return score;
    }

}
