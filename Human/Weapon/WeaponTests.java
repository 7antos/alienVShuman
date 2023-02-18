package Human.Weapon;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import Human.Human;

public class WeaponTests {

    private Weapon weapon1;
    private Human human2;
    private Human weakHuman;
    
    @Before
    public void beforeTests(){
        human2=new Human("Andre Mendes", 100, null);
        weakHuman=new Human("Andre Mendes", 1, null);
        weapon1=new Weapon("Sword", 25);
    }

    @Test
    public void testWeapon(){
        Weapon weapon=new Weapon("Sword", 25);
        assertEquals("Sword", weapon.getName());
        assertEquals(25, weapon.getValue());
    }

    @Test
    public void testUse(){
        weapon1.use(human2);
        assertEquals(75, human2.getHealth());
        weapon1.use(weakHuman);
        assertEquals(0, weakHuman.getHealth());
    }
}
