import Parent.Dad;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DadTest {

    private Dad dad;

    @Before
    public void before(){
        dad = new Dad("Jamie", "Reader");
    }

    @Test
    public void canExplode(){
        assertEquals("What excellent Children you both are.", dad.explode());
    }

    @Test
    public void canExplode__seven(){
        dad.setPatience(7);
        assertEquals("Right - just behave yourself.. or else!", dad.explode());
    }

    @Test
    public void canExplode__0(){
        dad.setPatience(0);
        assertEquals("GET UPSTAIRS NOW!", dad.explode());
    }

    @Test
    public void canReferee(){
        dad.refereeFight();
        assertEquals(5, dad.getPatience());
    }
}
