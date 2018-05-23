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
        enemy = new Orc("Uzul", 1000, 100, 100, warhammer);
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
    public void hasStrength() {
        assertEquals(30, shadowRogue.getStrength());
    }

    @Test
    public void hasMagic() {
        assertEquals(30, shadowRogue.getMagic());
    }

    @Test
    public void hasDefence() {
        assertEquals(40, shadowRogue.getDefence());
    }

    @Test
    public void hasVitality() {
        assertEquals(60, shadowRogue.getVitality());
    }

    @Test
    public void hasLuck() {
        assertEquals(70, shadowRogue.getLuck());
    }

    //Poison Tests
    @Test
    public void poisonStatusStartsFalse() {
        assertEquals(false, shadowRogue.getPoisonStatus());
    }

    @Test
    public void poisonStatusCanBeTrue() {
        shadowRogue.getsPoisoned();
        assertEquals(true, shadowRogue.getPoisonStatus());
    }

    @Test
    public void healthCanBePoisoned() {
        shadowRogue.poisonedEffects();
        assertEquals(480, shadowRogue.getHealthValue());
    }

    @Test
    public void vitalityCanBePoisoned() {
        shadowRogue.poisonedEffects();
        assertEquals(50, shadowRogue.getVitality());
    }

    @Test
    public void defenceCanBePoisoned() {
        shadowRogue.poisonedEffects();
        assertEquals(35, shadowRogue.getDefence());
    }

    //Reduce Stat Tests
    @Test
    public void canReduceStrength() {
        shadowRogue.takeStrengthDamage(20);
        assertEquals(10, shadowRogue.getStrength());
    }

    @Test
    public void canReduceMagic() {
        shadowRogue.takeMagicDamage(30);
        assertEquals(0, shadowRogue.getMagic());
    }

    @Test
    public void canReduceDefence() {
        shadowRogue.takeDefenceDamage(10);
        assertEquals(30, shadowRogue.getDefence());
    }

    @Test
    public void canReduceVitality() {
        shadowRogue.takeVitalityDamage(10);
        assertEquals(50, shadowRogue.getVitality());
    }

    @Test
    public void canReduceLuck() {
        shadowRogue.takeLuckDamage(20);
        assertEquals(50, shadowRogue.getLuck());
    }

    //ShadowRogue Tests
    @Test
    public void hasStealthValue() {
        assertEquals(100, shadowRogue.getStealthValue());
    }

    @Test
    public void canReduceStealthValue() {
        shadowRogue.reduceStealthValue(50);
        assertEquals(50, shadowRogue.getStealthValue());
    }

    //Warrior Tests
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
