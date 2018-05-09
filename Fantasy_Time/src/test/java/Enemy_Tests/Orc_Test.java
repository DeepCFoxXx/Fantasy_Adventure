package Enemy_Tests;

import Enemies.Fighters.Orc;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Orc_Test {

    Orc orc;
    IWeaponEnemy warhammer;

    @Before
    public void before() {
        orc = new Orc("Uzul", 1000, warhammer);
    }

    @Test
    public void hasName() {
        assertEquals("Uzul", orc.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(1000, orc.getHealthValue());
    }

}
