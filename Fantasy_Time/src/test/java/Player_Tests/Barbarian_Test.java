package Player_Tests;

import Enemies.Enemy;
import Enemies.Fighters.Orc;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Players.Warriors.Barbarian;
import Players.Warriors.Weapons.GreatSword;
import Players.Warriors.Weapons.IWeapon;
import Players.Warriors.Weapons.WarAxe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Barbarian_Test {

    Barbarian barbarian;
    Enemy enemy;
    IWeapon greatSword;
    IWeapon warAxe;
    IWeaponEnemy warhammer;

    @Before
    public void before() {
        barbarian = new Barbarian("Conan", 600, greatSword, 80);
        enemy = new Orc("Uzul", 1000, warhammer);
        greatSword = new GreatSword();
        warAxe = new WarAxe();
    }

    @Test
    public void hasName() {
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(600, barbarian.getHealthValue());
    }

    @Test
    public void hasVitality() {
        assertEquals(80, barbarian.getVitality());
    }

    @Test
    public void canAttack() {
        barbarian.attack(enemy, greatSword);
        assertEquals(820, enemy.getHealthValue());
    }

    @Test
    public void canTakeDamage() {
        barbarian.takeDamage(150);
        assertEquals(450, barbarian.getHealthValue());
    }

    @Test
    public void canSwapWeapon() {
        barbarian.setWeapon(warAxe);
        barbarian.attack(enemy);
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
        barbarian.takeStatDamage(20);
        assertEquals(60, barbarian.getVitality());
    }

}
