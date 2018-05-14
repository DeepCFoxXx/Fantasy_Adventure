package Player_Weapon_Tests;

import Enemies.Enemy;
import Enemies.Fighters.Orc;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Players.Warriors.Weapons.BroadSword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BroadSword_Test {

    BroadSword broadSword;
    Enemy enemy;
    IWeaponEnemy warhammer;

    @Before
    public void before() {
        broadSword = new BroadSword();
        enemy = new Orc("Uzul", 1000, 100, 100, warhammer);
    }

    @Test
    public void canAttack() {
        broadSword.attack(enemy);
        assertEquals(875, enemy.getHealthValue());
    }

    @Test
    public void canReducePhysical() {
        broadSword.attack(enemy);
        assertEquals(80, enemy.getPhysicalResistance());
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
    public void enemyHasPhysicalResistance() {
        assertEquals(100, enemy.getPhysicalResistance());
    }

}
