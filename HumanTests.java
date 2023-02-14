import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HumanTests {

    private Human human1;

    @Before
    public void beforeTests(){
        human1=new Human("Pedro Santos", 100);
    }

    @Test
    public void testHuman(){
        Human human=new Human("Pedro Santos", 100);
        assertEquals("Pedro Santos", human.getName());
        assertEquals(100, human.getMaxHealth());
        assertEquals(100, human.getHealth());
        assertEquals("Sword", human.getWeapon().getName());
    }
}
