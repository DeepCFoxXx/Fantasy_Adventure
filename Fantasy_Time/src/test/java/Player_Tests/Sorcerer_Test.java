package Player_Tests;

import Enemies.Enemy;
import Enemies.Fighters.Orc;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Players.MagicalUsers.Sorcerer;
import Players.MagicalUsers.Spells.Frost;
import Players.MagicalUsers.Spells.ISpell;
import Players.MagicalUsers.Spells.Ultima;
import Players.MagicalUsers.Summons.Bahamut;
import Players.MagicalUsers.Summons.ISummon;
import Players.MagicalUsers.Summons.Leviathan;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Sorcerer_Test {

    Sorcerer sorcerer;
    ISpell frost;
    ISpell ultima;
    ISummon bahamut;
    ISummon leviathan;
    Enemy enemy;
    IWeaponEnemy warhammer;

    @Before
    public void before() {
        sorcerer = new Sorcerer("Lyanna", 400, 10, 80, 30, 30, 45, false, frost, 100);
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

    @Test
    public void poisonStatusStartsFalse() {
        assertEquals(false, sorcerer.getPoisonStatus());
    }

    @Test
    public void poisonStatusCanBeTrue() {
        sorcerer.getsPoisoned();
        assertEquals(true, sorcerer.getPoisonStatus());
    }

    //Reduce Stat Tests
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
    public void canAttack() {
        sorcerer.cast(enemy, frost);
        assertEquals(870, enemy.getHealthValue());
    }

    @Test
    public void canDamageMagical() {
        sorcerer.cast(enemy, frost);
        assertEquals(80, enemy.getMagicalResistance());
    }

    @Test
    public void canSwapWeapon() {
        sorcerer.setSpell(ultima);
        sorcerer.cast(enemy);
        assertEquals(700, enemy.getHealthValue());
    }

}
