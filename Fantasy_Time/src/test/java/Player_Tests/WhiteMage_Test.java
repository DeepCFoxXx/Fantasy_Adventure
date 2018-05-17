package Player_Tests;

import Enemies.Enemy;
import Enemies.Fighters.Orc;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Players.MagicalUsers.Defenders.IDefend;
import Players.MagicalUsers.Defenders.Leviathan;
import Players.MagicalUsers.Healing_Spells.Cure;
import Players.MagicalUsers.Healing_Spells.FullCure;
import Players.MagicalUsers.Healing_Spells.IHeal;
import Players.MagicalUsers.Spells.ISpell;
import Players.MagicalUsers.Spells.Lightning;
import Players.MagicalUsers.Spells.Ultima;
import Players.MagicalUsers.WhiteMage;
import Players.Player;
import Players.Warriors.Barbarian;
import Players.Warriors.Weapons.GreatSword;
import Players.Warriors.Weapons.IWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhiteMage_Test {

    WhiteMage whiteMage;
    ISpell lightning;
    ISpell ultima;
    IDefend leviathan;
    IHeal cure;
    IHeal fullCure;
    Player barbarian;
    IWeapon greatSword;
    Enemy enemy;
    IWeaponEnemy warhammer;

    @Before
    public void before() {
        whiteMage = new WhiteMage("Goro", 350, 15, 100, 20, 20, 80, false, lightning, leviathan, 100, cure);
        enemy = new Orc("Uzul", 1000, 100, 100, warhammer);
        lightning= new Lightning();
        ultima = new Ultima();
        leviathan = new Leviathan();
        cure = new Cure();
        fullCure = new FullCure();
        barbarian = new Barbarian("Conan", 600, 80, 10, 50, 60, 20, false, greatSword, 100);
        greatSword = new GreatSword();
    }

    //Player Stat Tests
    @Test
    public void hasName() {
        assertEquals("Goro", whiteMage.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(350, whiteMage.getHealthValue());
    }

    @Test
    public void hasStrength() {
        assertEquals(15, whiteMage.getStrength());
    }

    @Test
    public void hasMagic() {
        assertEquals(100, whiteMage.getMagic());
    }

    @Test
    public void hasDefence() {
        assertEquals(20, whiteMage.getDefence());
    }

    @Test
    public void hasVitality() {
        assertEquals(20, whiteMage.getVitality());
    }

    @Test
    public void hasLuck() {
        assertEquals(80, whiteMage.getLuck());
    }

    //Poison Tests
    @Test
    public void poisonStatusStartsFalse() {
        assertEquals(false, whiteMage.getPoisonStatus());
    }

    @Test
    public void poisonStatusCanBeTrue() {
        whiteMage.getsPoisoned();
        assertEquals(true, whiteMage.getPoisonStatus());
    }

    @Test
    public void healthCanBePoisoned() {
        whiteMage.poisonedEffects();
        assertEquals(330, whiteMage.getHealthValue());
    }

    @Test
    public void vitalityCanBePoisoned() {
        whiteMage.poisonedEffects();
        assertEquals(10, whiteMage.getVitality());
    }

    @Test
    public void defenceCanBePoisoned() {
        whiteMage.poisonedEffects();
        assertEquals(15, whiteMage.getDefence());
    }

    //Reduce Stat Tests
    @Test
    public void canReduceDefence() {
        whiteMage.takeDefenceDamage(10);
        assertEquals(10, whiteMage.getDefence());
    }

    @Test
    public void canReduceVitality() {
        whiteMage.takeVitalityDamage(10);
        assertEquals(10, whiteMage.getVitality());
    }

    //White Mage Tests
    @Test
    public void hasIllusionValue() {
        assertEquals(100, whiteMage.getFortificationValue());
    }

    @Test
    public void canReduceIllusion() {
        whiteMage.takeFortificationDamage(50);
        assertEquals(50, whiteMage.getFortificationValue());
    }

    //Magical Users Tests
    @Test
    public void canTakeDamage() {
        whiteMage.takeDamage(200);
        assertEquals(150, whiteMage.getHealthValue());
    }

    @Test
    public void canCast() {
        whiteMage.cast(enemy, lightning);
        assertEquals(820, enemy.getHealthValue());
    }

    @Test
    public void canDamageMagical() {
        whiteMage.cast(enemy, lightning);
        assertEquals(60, enemy.getMagicalResistance());
    }

    @Test
    public void canSwapSpell() {
        whiteMage.setSpell(ultima);
        whiteMage.cast(enemy);
        assertEquals(700, enemy.getHealthValue());
    }

    @Test
    public void canSummon() {
        whiteMage.summon(enemy, leviathan);
        assertEquals(550, enemy.getHealthValue());
    }

    @Test
    public void canReducePhysicalWithSummon() {
        whiteMage.summon(enemy, leviathan);
        assertEquals(30, enemy.getPhysicalResistance());
    }

    @Test
    public void canReduceMagicalWithSummon() {
        whiteMage.summon(enemy, leviathan);
        assertEquals(60, enemy.getMagicalResistance());
    }

    //White Mage Healing Spell Tests
    @Test
    public void canHealPlayer() {
        barbarian.takeDamage(599);
        whiteMage.heal(barbarian, cure);
        assertEquals(201, barbarian.getHealthValue());
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
