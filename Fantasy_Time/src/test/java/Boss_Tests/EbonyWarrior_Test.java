package Boss_Tests;

import Enemies.Boss_Enemies.Boss_Weapons.AbyssalSpear;
import Enemies.Boss_Enemies.Boss_Weapons.DeathScythe;
import Enemies.Boss_Enemies.Boss_Weapons.IBossWeapon;
import Enemies.Boss_Enemies.EbonyWarrior;
import Enemies.Enemy_Magic_Users.BloodCultist;
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

public class EbonyWarrior_Test {

    EbonyWarrior ebonyWarrior;
    IBossWeapon deathScythe;
    IBossWeapon abyssalSpear;
    Player player;
    IWeapon greatSword;

    @Before
    public void before() {
        ebonyWarrior = new EbonyWarrior("Reymon", 2000, 200, 200, deathScythe);
        deathScythe = new DeathScythe();
        abyssalSpear = new AbyssalSpear();
        player = new Barbarian("Conan", 600, 80, 10, 50, 60, 20, false, greatSword, 100);
        greatSword = new GreatSword();
    }

    //Enemy Stat Tests
    @Test
    public void hasName() {
        assertEquals("Reymon", ebonyWarrior.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(2000, ebonyWarrior.getHealthValue());
    }

    @Test
    public void hasPhysicalResistance() {
        assertEquals(200, ebonyWarrior.getPhysicalResistance());
    }

    @Test
    public void hasMagicalResistance() {
        assertEquals(200, ebonyWarrior.getMagicalResistance());
    }

    @Test
    public void canReducePhysicalResistance() {
        ebonyWarrior.takePhysicalStatDamage(50);
        assertEquals(150, ebonyWarrior.getPhysicalResistance());
    }

    @Test
    public void canReduceMagicalResistance() {
        ebonyWarrior.takeMagicalStatDamage(50);
        assertEquals(150, ebonyWarrior.getMagicalResistance());
    }

    @Test
    public void canTakeDamage() {
        ebonyWarrior.takeDamage(1000);
        assertEquals(1000, ebonyWarrior.getHealthValue());
    }

}
