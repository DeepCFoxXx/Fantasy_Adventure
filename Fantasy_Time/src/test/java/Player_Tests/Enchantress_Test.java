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

    @Test
    public void poisonStatusStartsFalse() {
        assertEquals(false, enchantress.getPoisonStatus());
    }

    @Test
    public void poisonStatusCanBeTrue() {
        enchantress.getsPoisoned();
        assertEquals(true, enchantress.getPoisonStatus());
    }

}
