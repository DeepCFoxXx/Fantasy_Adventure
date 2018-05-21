package Enemy_Tests;

import Enemies.Enemy_Magic_Users.BloodCultist;
import Enemies.Enemy_Magic_Users.Lich;
import Enemies.Enemy_Magic_Users.Spells.Drain;
import Enemies.Enemy_Magic_Users.Spells.ISpellEnemy;
import Enemies.Enemy_Magic_Users.Spells.Poison;
import Players.Player;
import Players.Warriors.Barbarian;
import Players.Warriors.Weapons.GreatSword;
import Players.Warriors.Weapons.IWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BloodCultist_Test {

    BloodCultist bloodCultist;
    ISpellEnemy drain;
    ISpellEnemy poison;
    Player player;
    IWeapon greatSword;

    @Before
    public void before() {
        bloodCultist = new BloodCultist("Serana", 450, 100, 100, poison);
        drain = new Drain();
        poison = new Poison();
        player = new Barbarian("Conan", 600, 80, 10, 50, 60, 20, false, greatSword, 100);
        greatSword = new GreatSword();
    }

    //Enemy Stat Tests
    @Test
    public void hasName() {
        assertEquals("Serana", bloodCultist.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(450, bloodCultist.getHealthValue());
    }

    @Test
    public void hasPhysicalResistance() {
        assertEquals(100, bloodCultist.getPhysicalResistance());
    }

    @Test
    public void hasMagicalResistance() {
        assertEquals(100, bloodCultist.getMagicalResistance());
    }

    @Test
    public void canReducePhysicalResistance() {
        bloodCultist.takePhysicalStatDamage(25);
        assertEquals(75, bloodCultist.getPhysicalResistance());
    }

    @Test
    public void canReduceMagicalResistance() {
        bloodCultist.takeMagicalStatDamage(25);
        assertEquals(75, bloodCultist.getMagicalResistance());
    }

    @Test
    public void canTakeDamage() {
        bloodCultist.takeDamage(200);
        assertEquals(250, bloodCultist.getHealthValue());
    }

    //Magical User Tests
    @Test
    public void canCast() {
        bloodCultist.cast(player, poison);
        assertEquals(450, player.getHealthValue());
    }

    @Test
    public void canCastDamageDefence() {
        bloodCultist.cast(player, poison);
        assertEquals(20, player.getDefence());
    }

    @Test
    public void canCastDamageVitality() {
        bloodCultist.cast(player, poison);
        assertEquals(30, player.getVitality());
    }

    @Test
    public void canSwapSpell() {
        bloodCultist.setSpell(drain);
        bloodCultist.cast(player, drain);
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
