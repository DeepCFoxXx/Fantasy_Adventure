package Player_Tests;

import Enemies.Enemy;
import Enemies.Fighters.Orc;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Players.MagicalUsers.Defenders.Bahamut;
import Players.MagicalUsers.Defenders.IDefend;
import Players.MagicalUsers.Defenders.Leviathan;
import Players.MagicalUsers.Enchantress;
import Players.MagicalUsers.Spells.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Enchantress_Test {

    Enchantress enchantress;
    ISpell flame;
    ISpell lightning;
    IDefend leviathan;
    IDefend bahamut;
    Enemy enemy;
    IWeaponEnemy warhammer;

    @Before
    public void before() {
        enchantress = new Enchantress("Sabrina", 550, 25, 70, 40, 20, 25, false, flame, leviathan, 100 );
        enemy = new Orc("Uzul", 1000, 100, 100, warhammer);
        flame = new Flame();
        lightning = new Lightning();
        leviathan = new Leviathan();
        bahamut = new Bahamut();
    }

    //Player Stat Tests
    @Test
    public void hasName() {
        assertEquals("Sabrina", enchantress.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(550, enchantress.getHealthValue());
    }

    @Test
    public void hasStrength() {
        assertEquals(25, enchantress.getStrength());
    }

    @Test
    public void hasMagic() {
        assertEquals(70, enchantress.getMagic());
    }

    @Test
    public void hasDefence() {
        assertEquals(40, enchantress.getDefence());
    }

    @Test
    public void hasVitality() {
        assertEquals(20, enchantress.getVitality());
    }

    @Test
    public void hasLuck() {
        assertEquals(25, enchantress.getLuck());
    }

    //Poison Tests
    @Test
    public void poisonStatusStartsFalse() {
        assertEquals(false, enchantress.getPoisonStatus());
    }

    @Test
    public void poisonStatusCanBeTrue() {
        enchantress.getsPoisoned();
        assertEquals(true, enchantress.getPoisonStatus());
    }

    @Test
    public void healthCanBePoisoned() {
        enchantress.poisonedEffects();
        assertEquals(530, enchantress.getHealthValue());
    }

    @Test
    public void vitalityCanBePoisoned() {
        enchantress.poisonedEffects();
        assertEquals(10, enchantress.getVitality());
    }

    @Test
    public void defenceCanBePoisoned() {
        enchantress.poisonedEffects();
        assertEquals(35, enchantress.getDefence());
    }

    //Reduce Stat Tests
    @Test
    public void canReduceDefence() {
        enchantress.takeDefenceDamage(10);
        assertEquals(30, enchantress.getDefence());
    }

    @Test
    public void canReduceVitality() {
        enchantress.takeVitalityDamage(10);
        assertEquals(10, enchantress.getVitality());
    }

    //Enchantress Tests
    @Test
    public void hasMystificationValue() {
        assertEquals(100, enchantress.getMystificationValue());
    }

    @Test
    public void canReduceMystification() {
        enchantress.takeMystificationDamage(50);
        assertEquals(50, enchantress.getMystificationValue());
    }

    //Magical Users Tests
    @Test
    public void canTakeDamage() {
        enchantress.takeDamage(150);
        assertEquals(400, enchantress.getHealthValue());
    }

    @Test
    public void canCast() {
        enchantress.cast(enemy, flame);
        assertEquals(850, enemy.getHealthValue());
    }

    @Test
    public void canDamageMagical() {
        enchantress.cast(enemy, flame);
        assertEquals(70, enemy.getMagicalResistance());
    }

    @Test
    public void canSwapSpell() {
        enchantress.setSpell(lightning);
        enchantress.cast(enemy);
        assertEquals(820, enemy.getHealthValue());
    }

    @Test
    public void canSummon() {
        enchantress.summon(enemy, leviathan);
        assertEquals(550, enemy.getHealthValue());
    }

    @Test
    public void canSwapSummon() {
        enchantress.setSummon(bahamut);
        enchantress.summon(enemy);
        assertEquals(500, enemy.getHealthValue());
    }

    @Test
    public void canReducePhysicalWithSummon() {
        enchantress.summon(enemy, leviathan);
        assertEquals(30, enemy.getPhysicalResistance());
    }

    @Test
    public void canReduceMagicalWithSummon() {
        enchantress.summon(enemy, leviathan);
        assertEquals(60, enemy.getMagicalResistance());
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
