import Child.PreSchool;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PreSchoolTest {

    PreSchool kid1;

    @Before
    public  void before(){
        kid1 = new PreSchool("Alice", "Pink Floyd the Rabbit");
    }

    @Test
    public void canGetName(){
        assertEquals("Alice", kid1.getName());
    }

    @Test
    public void canGethunger(){
        assertEquals(0, kid1.getHunger());
    }

    @Test
    public void canSetHungerLevel(){
        kid1.setHunger(5);
        assertEquals(5, kid1.getHunger());
    }

    @Test
    public void canFight(){
        assertEquals("WaaaaWaaaaa",kid1.fight());
        assertEquals(5, kid1.getTiredness());
        assertEquals(3, kid1.getHunger());
    }

}
