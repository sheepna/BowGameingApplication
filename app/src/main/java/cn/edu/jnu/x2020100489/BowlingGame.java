package cn.edu.jnu.x2020100489;

public class BowlingGame {

    private int score=0;
    public void roll(int pin) {
        score+=pin;
    }
    public int score() {

        return score;
    }
}
