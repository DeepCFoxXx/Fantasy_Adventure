package Enemy_Tests;

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

public class Lich_Test {

    Lich lich;
    ISpellEnemy drain;
    ISpellEnemy poison;
    Player player;
    IWeapon greatSword;

    @Before
    public void before() {
        lich = new Lich("Zhengyi", 650, 100, 100, drain);
        drain = new Drain();
        poison = new Poison();
        player = new Barbarian("Conan", 600, 80, 10, 50, 60, 20, false, greatSword, 100);
        greatSword = new GreatSword();
    }

    //Enemy Stat Tests
    @Test
    public void hasName() {
        assertEquals("Zhengyi", lich.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(650, lich.getHealthValue());
    }

    @Test
    public void hasPhysicalResistance() {
        assertEquals(100, lich.getPhysicalResistance());
    }

    @Test
    public void hasMagicalResistance() {
        assertEquals(100, lich.getMagicalResistance());
    }

    @Test
    public void canReducePhysicalResistance() {
        lich.takePhysicalStatDamage(25);
        assertEquals(75, lich.getPhysicalResistance());
    }

    @Test
    public void canReduceMagicalResistance() {
        lich.takeMagicalStatDamage(25);
        assertEquals(75, lich.getMagicalResistance());
    }


}
