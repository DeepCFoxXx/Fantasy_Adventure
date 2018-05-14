package Player_Spell_Tests;

import Enemies.Enemy;
import Enemies.Fighters.Orc;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Enemies.Fighters.Weapons.WarHammer;
import Players.MagicalUsers.Spells.Flame;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Flame_Test {

    Flame flame;
    Enemy enemy;
    IWeaponEnemy warHammer;

    @Before
    public void before() {
        flame = new Flame();
        enemy = new Orc("Uzul", 1000, 100, 100, warHammer);
        warHammer = new WarHammer();
    }

    @Test
    public void canDamage() {
        flame.cast(enemy);
        assertEquals(850, enemy.getHealthValue());
    }

    @Test
    public void canDamagePhysical() {
        flame.cast(enemy);
        assertEquals(70, enemy.getMagicalResistance());
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
