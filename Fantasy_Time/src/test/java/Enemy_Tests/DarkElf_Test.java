package Enemy_Tests;

import Enemies.Fighters.DarkElf;
import Enemies.Fighters.Orc;
import Enemies.Fighters.Weapons.*;
import Players.Player;
import Players.Warriors.Barbarian;
import Players.Warriors.Weapons.GreatSword;
import Players.Warriors.Weapons.IWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DarkElf_Test {

    DarkElf darkElf;
    IWeaponEnemy warMace;
    IWeaponEnemy bloodDagger;
    Player player;
    IWeapon greatSword;

    @Before
    public void before() {
        darkElf = new DarkElf("Llarayna", 700, 100, 100, warMace);
        warMace = new WarMace();
        bloodDagger = new BloodDagger();
        player = new Barbarian("Conan", 600, 80, 10, 50, 60, 20, false, greatSword, 100);
        greatSword = new GreatSword();
    }

    //Enemy Stat Tests
    @Test
    public void hasName() {
        assertEquals("Llarayna", darkElf.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(700, darkElf.getHealthValue());
    }

    @Test
    public void hasPhysicalResistance() {
        assertEquals(100, darkElf.getPhysicalResistance());
    }

    @Test
    public void hasMagicalResistance() {
        assertEquals(100, darkElf.getMagicalResistance());
    }

    @Test
    public void canReducePhysicalResistance() {
        darkElf.takePhysicalStatDamage(25);
        assertEquals(75, darkElf.getPhysicalResistance());
    }

    //Fighter Tests
    @Test
    public void canTakeDamage() {
        darkElf.takeDamage(150);
        assertEquals(550, darkElf.getHealthValue());
    }

    @Test
    public void canAttack() {
        darkElf.attack(player, warMace);
        assertEquals(470, player.getHealthValue());
    }

    @Test
    public void canSwapWeapon() {
        darkElf.setWeapon(bloodDagger);
        darkElf.attack(player);
        assertEquals(500, player.getHealthValue());
    }

    //Player Tests
    @Test
    public void playerHasName() {
        assertEquals("Conan", player.getName());
    }

    @Test
    public void playerHasHealthValue() {
        assertEquals(600, player.getHealthValue());
    }

}
