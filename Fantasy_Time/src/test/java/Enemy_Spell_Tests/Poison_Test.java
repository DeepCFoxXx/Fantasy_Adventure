package Enemy_Spell_Tests;

import Enemies.Enemy_Magic_Users.Spells.Drain;
import Enemies.Enemy_Magic_Users.Spells.Poison;
import Players.Player;
import Players.Warriors.Barbarian;
import Players.Warriors.Weapons.IWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Poison_Test {

    Poison poison;
    Player barbarian;
    IWeapon greatSword;

    @Before
    public void before() {
        poison = new Poison();
        barbarian = new Barbarian("Conan", 600, 80, 10, 50, 60, 20, false, greatSword, 100);
    }

    @Test
    public void canDamage() {
        poison.cast(barbarian);
        assertEquals(450, barbarian.getHealthValue());
    }

    @Test
    public void canDamageDefence() {
        poison.cast(barbarian);
        assertEquals(20, barbarian.getDefence());
    }

    @Test
    public void canDamageVitality() {
        poison.cast(barbarian);
        assertEquals(30, barbarian.getVitality());
    }

    @Test
    public void canPoisonPlayer() {
        poison.cast(barbarian);
        assertEquals(true, barbarian.getPoisonStatus());
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
