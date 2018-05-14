package Player_Summon_Tests;

import Enemies.Enemy;
import Enemies.Fighters.Orc;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Enemies.Fighters.Weapons.WarHammer;
import Players.MagicalUsers.Summons.Leviathan;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Leviathan_Test {

    Leviathan leviathan;
    Enemy enemy;
    IWeaponEnemy warHammer;

    @Before
    public void before() {
        leviathan = new Leviathan();
        enemy = new Orc("Uzul", 1000, 100, 100, warHammer);
        warHammer = new WarHammer();
    }

    @Test
    public void canDamage() {
        leviathan.summon(enemy);
        assertEquals(550, enemy.getHealthValue());
    }

    @Test
    public void canDamageMagical() {
        leviathan.summon(enemy);
        assertEquals(60, enemy.getMagicalResistance());
    }

    @Test
    public void canDamagePhysical() {
        leviathan.summon(enemy);
        assertEquals(30, enemy.getPhysicalResistance());
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
