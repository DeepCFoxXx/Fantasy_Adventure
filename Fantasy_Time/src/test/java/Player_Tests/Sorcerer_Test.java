package Player_Tests;

import Enemies.Enemy;
import Enemies.Fighters.Orc;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Players.MagicalUsers.Defenders.IDefend;
import Players.MagicalUsers.Sorcerer;
import Players.MagicalUsers.Spells.Frost;
import Players.MagicalUsers.Spells.ISpell;
import Players.MagicalUsers.Spells.Ultima;
import Players.MagicalUsers.Defenders.Bahamut;
import Players.MagicalUsers.Defenders.Leviathan;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Sorcerer_Test {

    Sorcerer sorcerer;
    ISpell frost;
    ISpell ultima;
    IDefend bahamut;
    IDefend leviathan;
    Enemy enemy;
    IWeaponEnemy warhammer;

    @Before
    public void before() {
        sorcerer = new Sorcerer("Lyanna", 400, 10, 80, 30, 30, 45, false, frost, bahamut, 100 );
        enemy = new Orc("Uzul", 1000, 100, 100, warhammer);
        frost = new Frost();
        ultima = new Ultima();
        bahamut = new Bahamut();
        leviathan = new Leviathan();
    }

    //Player Stat Tests
    @Test
    public void hasName() {
        assertEquals("Lyanna", sorcerer.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(400, sorcerer.getHealthValue());
    }

    @Test
    public void hasStrength() {
        assertEquals(10, sorcerer.getStrength());
    }

    @Test
    public void hasMagic() {
        assertEquals(80, sorcerer.getMagic());
    }

    @Test
    public void hasDefence() {
        assertEquals(30, sorcerer.getDefence());
    }

    @Test
    public void hasVitality() {
        assertEquals(30, sorcerer.getVitality());
    }

    @Test
    public void hasLuck() {
        assertEquals(45, sorcerer.getLuck());
    }

    //Poison Tests
    @Test
    public void poisonStatusStartsFalse() {
        assertEquals(false, sorcerer.getPoisonStatus());
    }

    @Test
    public void poisonStatusCanBeTrue() {
        sorcerer.getsPoisoned();
        assertEquals(true, sorcerer.getPoisonStatus());
    }

    @Test
    public void healthCanBePoisoned() {
        sorcerer.poisonedEffects();
        assertEquals(380, sorcerer.getHealthValue());
    }

    @Test
    public void vitalityCanBePoisoned() {
        sorcerer.poisonedEffects();
        assertEquals(20, sorcerer.getVitality());
    }

    @Test
    public void defenceCanBePoisoned() {
        sorcerer.poisonedEffects();
        assertEquals(25, sorcerer.getDefence());
    }

    //Reduce Stat Tests
    @Test
    public void canReduceStrength() {
        sorcerer.takeStrengthDamage(10);
        assertEquals(0, sorcerer.getStrength());
    }

    @Test
    public void canReduceMagic() {
        sorcerer.takeMagicDamage(40);
        assertEquals(40, sorcerer.getMagic());
    }

    @Test
    public void canReduceDefence() {
        sorcerer.takeDefenceDamage(10);
        assertEquals(20, sorcerer.getDefence());
    }

    @Test
    public void canReduceVitality() {
        sorcerer.takeVitalityDamage(10);
        assertEquals(20, sorcerer.getVitality());
    }

    @Test
    public void canReduceLuck() {
        sorcerer.takeLuckDamage(20);
        assertEquals(25, sorcerer.getLuck());
    }

    //Sorcerer Tests
    @Test
    public void hasIllusionValue() {
        assertEquals(100, sorcerer.getIllusionValue());
    }

    @Test
    public void canReduceIllusion() {
        sorcerer.takeIllusionDamage(50);
        assertEquals(50, sorcerer.getIllusionValue());
    }

    //Magical Users Tests
    @Test
    public void canTakeDamage() {
        sorcerer.takeDamage(100);
        assertEquals(300, sorcerer.getHealthValue());
    }

    @Test
    public void canCast() {
        sorcerer.cast(enemy, frost);
        assertEquals(870, enemy.getHealthValue());
    }

    @Test
    public void canDamageMagical() {
        sorcerer.cast(enemy, frost);
        assertEquals(80, enemy.getMagicalResistance());
    }

    @Test
    public void canSwapSpell() {
        sorcerer.setSpell(ultima);
        sorcerer.cast(enemy);
        assertEquals(700, enemy.getHealthValue());
    }

    @Test
    public void canSummon() {
        sorcerer.summon(enemy, bahamut);
        assertEquals(500, enemy.getHealthValue());
    }

    @Test
    public void canSwapSummon() {
        sorcerer.setSummon(leviathan);
        sorcerer.summon(enemy);
        assertEquals(550, enemy.getHealthValue());
    }

    @Test
    public void canReducePhysicalWithSummon() {
        sorcerer.summon(enemy, bahamut);
        assertEquals(50, enemy.getPhysicalResistance());
    }

    @Test
    public void canReduceMagicalWithSummon() {
        sorcerer.summon(enemy, bahamut);
        assertEquals(50, enemy.getMagicalResistance());
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
