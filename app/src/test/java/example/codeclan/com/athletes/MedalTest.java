package example.codeclan.com.athletes;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by user on 27/06/2017.
 */

public class MedalTest {

    private Boxer boxer;
    private Gymnast gymnast;
    private Medalcalc medalCalc;

    @Before
    public void before(){
        medalCalc = new Medalcalc();
        boxer = new Boxer(20, 7, "Graham");
        gymnast = new Gymnast(10, 9, "Crawford");
    }

    @Test
    public void testgetMedal(){
        assertEquals("Silver!", medalCalc.giveMedal(boxer));
        assertEquals("Gold!", medalCalc.giveMedal(gymnast));
    }

    @Test
    public void testgetRunLogSize(){
        assertEquals(0, boxer.getRunLogSize());
    }

}
