import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HumanTests {

    @Test
    public void testHuman(){
        Human human=new Human("Pedro Santos", 100);
        assertEquals("Pedro Santos", human.getName());
        assertEquals(100, human.getMaxHealth());
        assertEquals(100, human.getHealth());
        assertEquals("Sword", human.getWeapon().getName());
    }
}
