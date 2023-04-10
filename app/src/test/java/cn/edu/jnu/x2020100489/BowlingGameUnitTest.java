package cn.edu.jnu.x2020100489;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest {
    @Test
    public void FirstTest() {
        BowlingGame g=new BowlingGame();
        for(int i=0;i<10;i++){
            g.roll(3);
        }
        for(int i=0;i<(20-10);i++){
            g.roll(0);
        }
        assertEquals(30,g.score());
    }
    @Test
    public void AFrame(){
        BowlingGame g=new BowlingGame();
        for (int i=0;i<16;i++){
            g.roll(0);
        }
        g.roll(3);
        g.roll(1);
        g.roll(0);
        g.roll(0);
        assertEquals(4,g.score());
    }

}