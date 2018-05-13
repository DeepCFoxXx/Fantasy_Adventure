package Enemy_Tests;

import Enemies.Fighters.CursedVampire;
import Enemies.Fighters.Weapons.BattleAxe;
import Enemies.Fighters.Weapons.BloodDagger;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Players.Player;
import Players.Warriors.Barbarian;
import Players.Warriors.Weapons.GreatSword;
import Players.Warriors.Weapons.IWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CursedVampire_Test {

    CursedVampire cursedVampire;
    IWeaponEnemy bloodDagger;
    IWeaponEnemy battleAxe;
    Player player;
    IWeapon greatSword;

    @Before
    public void before() {
        cursedVampire = new CursedVampire("Bella", 500, 100, 100, bloodDagger);
        battleAxe = new BattleAxe();
        bloodDagger = new BloodDagger();
        player = new Barbarian("Conan", 600, 80, 10, 50, 60, 20, false, greatSword, 100);
        greatSword = new GreatSword();
    }

    //Enemy Stat Tests
    @Test
    public void hasName() {
        assertEquals("Bella", cursedVampire.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(500, cursedVampire.getHealthValue());
    }

    @Test
    public void hasPhysicalResistance() {
        assertEquals(100, cursedVampire.getPhysicalResistance());
    }

    @Test
    public void hasMagicalResistance() {
        assertEquals(100, cursedVampire.getMagicalResistance());
    }

    @Test
    public void canReducePhysicalResistance() {
        cursedVampire.takePhysicalStatDamage(25);
        assertEquals(75, cursedVampire.getPhysicalResistance());
    }

    @Test
    public void canReduceMagicalResistance() {
        cursedVampire.takeMagicalStatDamage(25);
        assertEquals(75, cursedVampire.getMagicalResistance());
    }

    //Fighter Tests
    @Test
    public void canTakeDamage() {
        cursedVampire.takeDamage(200);
        assertEquals(300, cursedVampire.getHealthValue());
    }

    @Test
    public void canAttack() {
        cursedVampire.attack(player, bloodDagger);
        assertEquals(500, player.getHealthValue());
    }

    @Test
    public void canSwapWeapon() {
        cursedVampire.setWeapon(battleAxe);
        cursedVampire.attack(player);
        assertEquals(420, player.getHealthValue());
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
