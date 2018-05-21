package Enemy_Spell_Tests;

import Enemies.Enemy_Magic_Users.Spells.Drain;
import Players.Player;
import Players.Warriors.Barbarian;
import Players.Warriors.Weapons.IWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Drain_Test {

    Drain drain;
    Player barbarian;
    IWeapon greatSword;

    @Before
    public void before() {
        drain = new Drain();
        barbarian = new Barbarian("Conan", 600, 80, 10, 50, 60, 20, false, greatSword, 100);
    }

    @Test
    public void canDamage() {
        drain.cast(barbarian);
        assertEquals(500, barbarian.getHealthValue());
    }

    @Test
    public void canDamageDefence() {
        drain.cast(barbarian);
        assertEquals(25, barbarian.getDefence());
    }

    @Test
    public void canDamageVitality() {
        drain.cast(barbarian);
        assertEquals(35, barbarian.getVitality());
    }

    @Test
    public void PlayerHasName() {
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void PlayerHasHealthValue() {
        assertEquals(600, barbarian.getHealthValue());
    }

}
