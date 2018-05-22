package Boss_Weapons_Tests;

import Enemies.Boss_Enemies.Boss_Weapons.DeathScythe;
import Players.Player;
import Players.Warriors.Barbarian;
import Players.Warriors.Weapons.IWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeathScythe_Test {

    DeathScythe deathScythe;
    Player barbarian;
    IWeapon greatSword;

    @Before
    public void before() {
        deathScythe = new DeathScythe();
        barbarian = new Barbarian("Conan", 600, 80, 10, 50, 60, 20, false, greatSword, 100);
    }

    @Test
    public void canDamage() {
        deathScythe.attack(barbarian);
        assertEquals(200, barbarian.getHealthValue());
    }

    @Test
    public void canReducePlayerStrength() {
        deathScythe.attack(barbarian);
        assertEquals(50, barbarian.getStrength());
    }

    @Test
    public void canReducePlayerMagic() {
        deathScythe.attack(barbarian);
        assertEquals(-20, barbarian.getMagic());
    }

    @Test
    public void canReducePlayerDefence() {
        deathScythe.attack(barbarian);
        assertEquals(20, barbarian.getDefence());
    }

    @Test
    public void canReducePlayerVitality() {
        deathScythe.attack(barbarian);
        assertEquals(30, barbarian.getVitality());
    }

    @Test
    public void canReducePlayerLuck() {
        deathScythe.attack(barbarian);
        assertEquals(0, barbarian.getLuck());
    }

    @Test
    public void canPoisonPlayer() {
        deathScythe.attack(barbarian);
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
