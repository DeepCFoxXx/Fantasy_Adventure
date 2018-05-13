package Enemy_Tests;

import Enemies.Fighters.HellKnight;
import Enemies.Fighters.Weapons.BattleAxe;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Enemies.Fighters.Weapons.OrcishSword;
import Players.Player;
import Players.Warriors.Barbarian;
import Players.Warriors.Weapons.GreatSword;
import Players.Warriors.Weapons.IWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HellKnight_Test {

    HellKnight hellKnight;
    IWeaponEnemy battleAxe;
    IWeaponEnemy orcishSword;
    Player player;
    IWeapon greatSword;

    @Before
    public void before() {
        hellKnight = new HellKnight("Dante", 1200, 100, 100, battleAxe);
        battleAxe = new BattleAxe();
        orcishSword = new OrcishSword();
        player = new Barbarian("Conan", 600, 80, 10, 50, 60, 20, false, greatSword, 100);
        greatSword = new GreatSword();
    }

    //Enemy Stat Tests
    @Test
    public void hasName() {
        assertEquals("Dante", hellKnight.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(1200, hellKnight.getHealthValue());
    }

    @Test
    public void hasPhysicalResistance() {
        assertEquals(100, hellKnight.getPhysicalResistance());
    }

    @Test
    public void hasMagicalResistance() {
        assertEquals(100, hellKnight.getMagicalResistance());
    }

    @Test
    public void canReducePhysicalResistance() {
        hellKnight.takePhysicalStatDamage(25);
        assertEquals(75, hellKnight.getPhysicalResistance());
    }

    @Test
    public void canReduceMagicalResistance() {
        hellKnight.takeMagicalStatDamage(25);
        assertEquals(75, hellKnight.getMagicalResistance());
    }

    //Fighter Tests
    @Test
    public void canTakeDamage() {
        hellKnight.takeDamage(400);
        assertEquals(800, hellKnight.getHealthValue());
    }

}
