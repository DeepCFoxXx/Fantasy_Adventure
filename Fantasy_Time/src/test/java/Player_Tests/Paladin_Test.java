package Player_Tests;

import Enemies.Enemy;
import Enemies.Fighters.Orc;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Players.Warriors.Paladin;
import Players.Warriors.Weapons.BroadSword;
import Players.Warriors.Weapons.IWeapon;
import Players.Warriors.Weapons.WarAxe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Paladin_Test {

    Paladin paladin;
    Enemy enemy;
    IWeapon broadSword;
    IWeapon warAxe;
    IWeaponEnemy warhammer;

    @Before
    public void before() {
        paladin = new Paladin("Duncan", 550, broadSword, 100);
        enemy = new Orc("Uzul", 1000, warhammer, 100);
        broadSword = new BroadSword();
        warAxe = new WarAxe();
    }

    @Test
    public void hasName() {
        assertEquals("Duncan", paladin.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(550, paladin.getHealthValue());
    }

    @Test
    public void hasShieldValue() {
        assertEquals(100, paladin.getShieldValue());
    }

    @Test
    public void canAttack() {
        paladin.attack(enemy, broadSword);
        assertEquals(875, enemy.getHealthValue());
    }

    @Test
    public void canTakeDamage() {
        paladin.takeDamage(100);
        assertEquals(450, paladin.getHealthValue());
    }

    @Test
    public void canSwapWeapon() {
        paladin.setWeapon(warAxe);
        paladin.attack(enemy);
        assertEquals(800, enemy.getHealthValue());
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
    public void catTakeStatDamage() {
        paladin.takeStatDamage(25);
        assertEquals(75, paladin.getShieldValue());
    }

}
