import Child.PrimaryKid;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PrimaryTest {

    PrimaryKid primaryKid;

    @Before
    public void before(){
        primaryKid = new PrimaryKid("Dylan", "Football");
    }

    @Test
    public void canGetFavGame(){
        assertEquals("Football", primaryKid.getFavouriteGame());
    }

    @Test
    public void canGetTiredness(){
        assertEquals(0, primaryKid.getTiredness());
    }

    @Test
    public void canSetTiredness(){
        primaryKid.setTiredness(6);
        assertEquals(6, primaryKid.getTiredness());
    }

    @Test
    public void canCry(){
        assertEquals("IT'S NOT FAIR!! *slams door*", primaryKid.cry());
    }

    @Test
    public void canPlay(){
        primaryKid.play(30);
        primaryKid.play(20);
        assertEquals(5, primaryKid.getTiredness());
        assertEquals(2, primaryKid.getHunger());
    }

    @Test
    public void canSleep(){
        primaryKid.play(60);
        primaryKid.sleep(5);
        assertEquals(0, primaryKid.getTiredness());
        assertEquals(6, primaryKid.getHunger());

    }

    @Test
    public void canEat(){
        primaryKid.play(60);
        primaryKid.sleep(5);
        primaryKid.feed();
        assertEquals(0, primaryKid.getTiredness());
        assertEquals(0, primaryKid.getHunger());

    }

}
