package Player_Spell_Tests;

import Enemies.Enemy;
import Enemies.Fighters.Orc;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Enemies.Fighters.Weapons.WarHammer;
import Players.MagicalUsers.Spells.Frost;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Frost_Test {

    Frost frost;
    Enemy enemy;
    IWeaponEnemy warHammer;

    @Before
    public void before() {
        frost = new Frost();
        enemy = new Orc("Uzul", 1000, 100, 100, warHammer);
        warHammer = new WarHammer();
    }

    @Test
    public void canDamage() {
        frost.cast(enemy);
        assertEquals(870, enemy.getHealthValue());
    }

    @Test
    public void canDamagePhysical() {
        frost.cast(enemy);
        assertEquals(80, enemy.getMagicalResistance());
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
    public void EnemyHasMagicalResistance() {
        assertEquals(100, enemy.getMagicalResistance());
    }

}
