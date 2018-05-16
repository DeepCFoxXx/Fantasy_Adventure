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
        enemy = new Orc("Uzul", 1000, 100, 100, warhammer);
        broadSword = new BroadSword();
        trident = new Trident();
    }

    //Player Stat Tests
    @Test
    public void hasName() {
        assertEquals("Bruce", darkKnight.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(500, darkKnight.getHealthValue());
    }

    @Test
    public void hasStrength() {
        assertEquals(60, darkKnight.getStrength());
    }

    @Test
    public void hasMagic() {
        assertEquals(30, darkKnight.getMagic());
    }

    @Test
    public void hasDefence() {
        assertEquals(70, darkKnight.getDefence());
    }

    @Test
    public void hasVitality() {
        assertEquals(40, darkKnight.getVitality());
    }

    @Test
    public void hasLuck() {
        assertEquals(25, darkKnight.getLuck());
    }

    //Poison Tests
    @Test
    public void poisonStatusStartsFalse() {
        assertEquals(false, darkKnight.getPoisonStatus());
    }

    @Test
    public void poisonStatusCanBeTrue() {
        darkKnight.getsPoisoned();
        assertEquals(true, darkKnight.getPoisonStatus());
    }

    @Test
    public void healthCanBePoisoned() {
        darkKnight.poisonedEffects();
        assertEquals(480, darkKnight.getHealthValue());
    }

    @Test
    public void vitalityCanBePoisoned() {
        darkKnight.poisonedEffects();
        assertEquals(30, darkKnight.getVitality());
    }

    @Test
    public void defenceCanBePoisoned() {
        darkKnight.poisonedEffects();
        assertEquals(65, darkKnight.getDefence());
    }

    //Reduce Stat Tests
    @Test
    public void canReduceDefence() {
        darkKnight.takeDefenceDamage(10);
        assertEquals(60, darkKnight.getDefence());
    }

    @Test
    public void canReduceVitality() {
        darkKnight.takeVitalityDamage(10);
        assertEquals(30, darkKnight.getVitality());
    }

    //DarkKnight Tests
    @Test
    public void hasArmourValue() {
        assertEquals(100, darkKnight.getArmourValue());
    }

    @Test
    public void canTakeArmourDamage() {
        darkKnight.takeArmourDamage(50);
        assertEquals(50, darkKnight.getArmourValue());
    }


    //Warrior Tests
    @Test
    public void canTakeDamage() {
        darkKnight.takeDamage(100);
        assertEquals(400, darkKnight.getHealthValue());
    }

    @Test
    public void canAttack() {
        darkKnight.attack(enemy, broadSword);
        assertEquals(875, enemy.getHealthValue());
    }

    @Test
    public void canSwapWeapon() {
        darkKnight.setWeapon(trident);
        darkKnight.attack(enemy);
        assertEquals(860, enemy.getHealthValue());
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
