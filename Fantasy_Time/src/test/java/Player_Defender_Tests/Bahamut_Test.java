package Player_Defender_Tests;

import Enemies.Enemy;
import Enemies.Fighters.Orc;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Enemies.Fighters.Weapons.WarHammer;
import Players.MagicalUsers.Defenders.Bahamut;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bahamut_Test {

    Bahamut bahamut;
    Enemy enemy;
    IWeaponEnemy warHammer;

    @Before
    public void before() {
        bahamut = new Bahamut();
        enemy = new Orc("Uzul", 1000, 100, 100, warHammer);
        warHammer = new WarHammer();
    }

    @Test
    public void canDamage() {
        bahamut.summon(enemy);
        assertEquals(500, enemy.getHealthValue());
    }

    @Test
    public void canDamageMagical() {
        bahamut.summon(enemy);
        assertEquals(50, enemy.getMagicalResistance());
    }

    @Test
    public void canDamagePhysical() {
        bahamut.summon(enemy);
        assertEquals(50, enemy.getPhysicalResistance());
    }

    @Test
    public void enemyHasName() {
        assertEquals("Uzul", enemy.getName());
    }

    @Test
    public void enemyHasHealthValue() {
        assertEquals(1000, enemy.getHealthValue());
    }

    @Test
    public void enemyHasMagicalResistance() {
        assertEquals(100, enemy.getMagicalResistance());
    }

    @Test
    public void enemyHasPhysicalResistance() {
        assertEquals(100, enemy.getPhysicalResistance());
    }

}
