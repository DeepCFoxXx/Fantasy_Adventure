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
        barbarian = new Barbarian("Conan", 600, 80, 10, 50, 60, 20, false, greatSword, 100);
        enemy = new Orc("Uzul", 1000, 100, 100, warhammer);
        greatSword = new GreatSword();
        warAxe = new WarAxe();
    }

    //Player Stat Tests
    @Test
    public void hasName() {
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(600, barbarian.getHealthValue());
    }

    @Test
    public void hasStrength() {
        assertEquals(80, barbarian.getStrength());
    }

    @Test
    public void hasMagic() {
        assertEquals(10, barbarian.getMagic());
    }

    @Test
    public void hasDefence() {
        assertEquals(50, barbarian.getDefence());
    }

    @Test
    public void hasVitality() {
        assertEquals(60, barbarian.getVitality());
    }

    @Test
    public void hasLuck() {
        assertEquals(20, barbarian.getLuck());
    }

    //Poison Tests
    @Test
    public void poisonStatusStartsFalse() {
        assertEquals(false, barbarian.getPoisonStatus());
    }

    @Test
    public void poisonStatusCanBeTrue() {
        barbarian.getsPoisoned();
        assertEquals(true, barbarian.getPoisonStatus());
    }

    @Test
    public void healthCanBePoisoned() {
        barbarian.poisonedEffects();
        assertEquals(580, barbarian.getHealthValue());
    }

    @Test
    public void vitalityCanBePoisoned() {
        barbarian.poisonedEffects();
        assertEquals(50, barbarian.getVitality());
    }

    @Test
    public void defenceCanBePoisoned() {
        barbarian.poisonedEffects();
        assertEquals(45, barbarian.getDefence());
    }

    //Reduce Stat Tests
    @Test
    public void canReduceStrength() {
        barbarian.takeStrengthDamage(20);
        assertEquals(60, barbarian.getStrength());
    }

    @Test
    public void canReduceMagic() {
        barbarian.takeMagicDamage(10);
        assertEquals(0, barbarian.getMagic());
    }

    @Test
    public void canReduceDefence() {
        barbarian.takeDefenceDamage(10);
        assertEquals(40, barbarian.getDefence());
    }

    @Test
    public void canReduceVitality() {
        barbarian.takeVitalityDamage(10);
        assertEquals(50, barbarian.getVitality());
    }

    @Test
    public void canReduceLuck() {
        barbarian.takeLuckDamage(5);
        assertEquals(15, barbarian.getLuck());
    }

    //Barbarian Tests
    @Test
    public void hasBerserkRage() {
        assertEquals(100, barbarian.getBerserkRage());
    }

    @Test
    public void canReduceBerserkRage() {
        barbarian.reduceBerserkRage(50);
        assertEquals(50, barbarian.getBerserkRage());
    }

    @Test
    public void canLimitBreakRage() {
        barbarian.reduceBerserkRage(99);
        barbarian.addToLimitBreak();
        assertEquals(101, barbarian.getBerserkRage());
    }

    @Test
    public void canLimitBreakHealth() {
        barbarian.reduceBerserkRage(99);
        barbarian.addToLimitBreak();
        assertEquals(1600, barbarian.getHealthValue());
    }

    @Test
    public void canLimitBreakDefence() {
        barbarian.reduceBerserkRage(99);
        barbarian.addToLimitBreak();
        assertEquals(150, barbarian.getDefence());
    }

    @Test
    public void canLimitBreakVitality() {
        barbarian.reduceBerserkRage(99);
        barbarian.addToLimitBreak();
        assertEquals(160, barbarian.getVitality());
    }

    @Test
    public void canGetLastChanceRage() {
        barbarian.takeDamage(599);
        barbarian.lastChance();
        assertEquals(150, barbarian.getBerserkRage());
    }

    @Test
    public void canGetLastChanceHealth() {
        barbarian.takeDamage(599);
        barbarian.lastChance();
        assertEquals(301, barbarian.getHealthValue());
    }

    @Test
    public void canGetLastChanceDefence() {
        barbarian.takeDamage(599);
        barbarian.lastChance();
        assertEquals(100, barbarian.getDefence());
    }

    @Test
    public void canGetLastChanceVitality() {
        barbarian.takeDamage(599);
        barbarian.lastChance();
        assertEquals(110, barbarian.getVitality());
    }

    @Test
    public void canTakeDamage() {
        barbarian.takeDamage(150);
        assertEquals(450, barbarian.getHealthValue());
    }

    //Warrior Tests
    @Test
    public void canAttack() {
        barbarian.attack(enemy, greatSword);
        assertEquals(820, enemy.getHealthValue());
    }

    @Test
    public void canSwapWeapon() {
        barbarian.setWeapon(warAxe);
        barbarian.attack(enemy);
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
