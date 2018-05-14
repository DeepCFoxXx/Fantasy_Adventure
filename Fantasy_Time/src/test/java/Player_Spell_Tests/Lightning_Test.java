package Player_Spell_Tests;

import Enemies.Enemy;
import Enemies.Fighters.Orc;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Enemies.Fighters.Weapons.WarHammer;
import Players.MagicalUsers.Spells.Lightning;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lightning_Test {

    Lightning lightning;
    Enemy enemy;
    IWeaponEnemy warHammer;

    @Before
    public void before() {
        lightning = new Lightning();
        enemy = new Orc("Uzul", 1000, 100, 100, warHammer);
        warHammer = new WarHammer();
    }

    @Test
    public void canDamage() {
        lightning.cast(enemy);
        assertEquals(820, enemy.getHealthValue());
    }

    @Test
    public void canDamagePhysical() {
        lightning.cast(enemy);
        assertEquals(60, enemy.getMagicalResistance());
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
