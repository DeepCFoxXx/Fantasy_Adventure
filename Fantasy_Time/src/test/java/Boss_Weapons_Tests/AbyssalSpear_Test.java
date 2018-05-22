package Boss_Weapons_Tests;

import Enemies.Boss_Enemies.Boss_Weapons.AbyssalSpear;
import Players.Player;
import Players.Warriors.Barbarian;
import Players.Warriors.Weapons.IWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbyssalSpear_Test {

    AbyssalSpear abyssalSpear;
    Player barbarian;
    IWeapon greatSword;

    @Before
    public void before() {
        abyssalSpear = new AbyssalSpear();
        barbarian = new Barbarian("Conan", 600, 80, 10, 50, 60, 20, false, greatSword, 100);
    }

    @Test
    public void canDamage() {
        abyssalSpear.attack(barbarian);
        assertEquals(300, barbarian.getHealthValue());
    }

    @Test
    public void canReducePlayerStrength() {
        abyssalSpear.attack(barbarian);
        assertEquals(60, barbarian.getStrength());
    }

    @Test
    public void canReducePlayerMagic() {
        abyssalSpear.attack(barbarian);
        assertEquals(-10, barbarian.getMagic());
    }

    @Test
    public void canReducePlayerDefence() {
        abyssalSpear.attack(barbarian);
        assertEquals(10, barbarian.getDefence());
    }

    @Test
    public void canReducePlayerVitality() {
        abyssalSpear.attack(barbarian);
        assertEquals(-40, barbarian.getVitality());
    }

    @Test
    public void canReducePlayerLuck() {
        abyssalSpear.attack(barbarian);
        assertEquals(10, barbarian.getLuck());
    }

    @Test
    public void canPoisonPlayer() {
        abyssalSpear.attack(barbarian);
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
