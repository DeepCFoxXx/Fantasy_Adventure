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
        paladin = new Paladin("Duncan", 550, 40, 40, 50, 60, 40,  false, broadSword, 100);
        enemy = new Orc("Uzul", 1000, 100, 100, warhammer);
        broadSword = new BroadSword();
        warAxe = new WarAxe();
    }

    //Player Stat Tests
    @Test
    public void hasName() {
        assertEquals("Duncan", paladin.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(550, paladin.getHealthValue());
    }

    @Test
    public void hasStrength() {
        assertEquals(40, paladin.getStrength());
    }

    @Test
    public void hasMagic() {
        assertEquals(40, paladin.getMagic());
    }

    @Test
    public void hasDefence() {
        assertEquals(50, paladin.getDefence());
    }

    @Test
    public void hasVitality() {
        assertEquals(60, paladin.getVitality());
    }

    @Test
    public void hasLuck() {
        assertEquals(40, paladin.getLuck());
    }

    @Test
    public void poisonStatusStartsFalse() {
        assertEquals(false, paladin.getPoisonStatus());
    }

    @Test
    public void poisonStatusCanBeTrue() {
        paladin.getsPoisoned();
        assertEquals(true, paladin.getPoisonStatus());
    }

    //Reduce Stat Tests
    @Test
    public void canReduceDefence() {
        paladin.takeDefenceDamage(10);
        assertEquals(40, paladin.getDefence());
    }

    @Test
    public void canReduceVitality() {
        paladin.takeVitalityDamage(10);
        assertEquals(50, paladin.getVitality());
    }

    //Paladin Tests
    @Test
    public void hasShieldValue() {
        assertEquals(100, paladin.getShieldValue());
    }

    @Test
    public void canTakeShieldDamage() {
        paladin.takeShieldDamage(25);
        assertEquals(75, paladin.getShieldValue());
    }

    //Warrior Tests
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

    //Enemy Tests
    @Test
    public void EnemyHasName() {
        assertEquals("Uzul", enemy.getName());
    }

    @Test
    public void EnemyHasHealthValue() {
        assertEquals(1000, enemy.getHealthValue());
    }

    @Test
    public void enemyHasPhysicalResistance() {
        assertEquals(100, enemy.getPhysicalResistance());
    }

    @Test
    public void enemyHasMagicalResistance() {
        assertEquals(100, enemy.getMagicalResistance());
    }

}
