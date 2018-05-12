package Player_Tests;

import Enemies.Enemy;
import Enemies.Fighters.Orc;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Players.Warriors.DarkKnight;
import Players.Warriors.Weapons.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DarkKnight_Test {

    DarkKnight darkKnight;
    Enemy enemy;
    IWeapon broadSword;
    IWeapon trident;
    IWeaponEnemy warhammer;

    @Before
    public void before() {
        darkKnight = new DarkKnight("Bruce", 500, 60, 30, 70, 40, 25, false, broadSword, 100);
        enemy = new Orc("Uzul", 1000, warhammer, 100);
        broadSword = new BroadSword();
        trident = new Trident();
    }

    @Test
    public void hasName() {
        assertEquals("Bruce", darkKnight.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(500, darkKnight.getHealthValue());
    }

    @Test
    public void hasArmourValue() {
        assertEquals(100, darkKnight.getArmourValue());
    }

    @Test
    public void canAttack() {
        darkKnight.attack(enemy, broadSword);
        assertEquals(875, enemy.getHealthValue());
    }

    @Test
    public void canTakeDamage() {
        darkKnight.takeDamage(100);
        assertEquals(400, darkKnight.getHealthValue());
    }

    @Test
    public void canSwapWeapon() {
        darkKnight.setWeapon(trident);
        darkKnight.attack(enemy);
        assertEquals(860, enemy.getHealthValue());
    }

    @Test
    public void EnemyHasName() {
        assertEquals("Uzul", enemy.getName());
    }

    @Test
    public void EnemyHasHealthValue() {
        assertEquals(1000, enemy.getHealthValue());
    }

    @Test
    public void canTakeArmourDamage() {
        darkKnight.takeArmourDamage(50);
        assertEquals(50, darkKnight.getArmourValue());
    }

}
