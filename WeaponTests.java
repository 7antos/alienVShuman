import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class WeaponTests {

    private Weapon weapon1;
    
    @Before
    public void beforeTests(){
        weapon1=new Weapon("Sword", 25);
    }

    @Test
    public void testWeapon(){
        Weapon weapon=new Weapon("Sword", 25);
        assertEquals("Sword", weapon.getName());
        assertEquals(25, weapon.getValue());
    }
}
