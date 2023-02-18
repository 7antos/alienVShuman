package Human;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import Human.Weapon.Weapon;

public class HumanTests {

    @Test
    public void testHuman(){
        Human human=new Human("Pedro Santos", 100, null);
        assertEquals("Pedro Santos", human.getName());
        assertEquals(100, human.getMaxHealth());
        assertEquals(100, human.getHealth());
        assertEquals("Sword", ((Weapon)(human.getWeapons()[0])).getName());
    }
}
