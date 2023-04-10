package cn.edu.jnu.x2020100489;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest {

    private BowlingGame g;

    @Before
    public void setUp() throws Exception {
        g = new BowlingGame();
    }

    @Test
    public void FirstTest() {
        rollMany(10, 3);
        rollMany((20 - 10), 0);
        assertEquals(30, g.score());
    }
    @Test
    public void AFrame(){
        rollMany(16, 0);
        g.roll(3);
        g.roll(1);
        g.roll(0);
        g.roll(0);
        assertEquals(4,g.score());
    }
    @Test
    public void ASpare(){
        rollMany(10,4);
        g.roll(1);
        g.roll(9);
        rollMany(8,3);
        assertEquals(77,g.score());
    }


    private void rollMany(int x, int pin) {
        for (int i = 0; i< x; i++){
            g.roll(pin);
        }
    }

}