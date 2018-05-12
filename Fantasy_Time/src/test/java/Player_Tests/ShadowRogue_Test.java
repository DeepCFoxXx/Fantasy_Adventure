package Player_Tests;

import Enemies.Enemy;
import Enemies.Fighters.Orc;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Players.Warriors.ShadowRogue;
import Players.Warriors.Weapons.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShadowRogue_Test {

    ShadowRogue shadowRogue;
    Enemy enemy;
    IWeapon katana;
    IWeapon trident;
    IWeaponEnemy warhammer;

    @Before
    public void before() {
        shadowRogue = new ShadowRogue("Kara", 500, 30, 30, 40, 60, 70,  false, katana, 100);
        enemy = new Orc("Uzul", 1000, warhammer, 100);
        katana = new Katana();
        trident = new Trident();
    }

    @Test
    public void hasName() {
        assertEquals("Kara", shadowRogue.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(500, shadowRogue.getHealthValue());
    }

    @Test
    public void hasStelthValue() {
        assertEquals(100, shadowRogue.getStealthValue());
    }

    @Test
    public void canAttack() {
        shadowRogue.attack(enemy, katana);
        assertEquals(790, enemy.getHealthValue());
    }

    @Test
    public void canTakeDamage() {
        shadowRogue.takeDamage(100);
        assertEquals(400, shadowRogue.getHealthValue());
    }

    @Test
    public void canSwapWeapon() {
        shadowRogue.setWeapon(trident);
        shadowRogue.attack(enemy);
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
    public void catReduceStealthValue() {
        shadowRogue.reduceStealthValue(50);
        assertEquals(50, shadowRogue.getStealthValue());
    }

}
