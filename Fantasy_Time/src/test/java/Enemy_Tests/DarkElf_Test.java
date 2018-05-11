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
    IWeapon greatsword;

    @Before
    public void before() {
        darkElf = new DarkElf("Llarayna", 700, warMace, 60);
        warMace = new WarMace();
        bloodDagger = new BloodDagger();
        player = new Barbarian("Conan", 600, greatsword, 80);
        greatsword = new GreatSword();
    }

    @Test
    public void hasName() {
        assertEquals("Llarayna", darkElf.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(700, darkElf.getHealthValue());
    }

    @Test
    public void hasMagicalResistance() {
        assertEquals(60, darkElf.getMagicalResistance());
    }

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

}
