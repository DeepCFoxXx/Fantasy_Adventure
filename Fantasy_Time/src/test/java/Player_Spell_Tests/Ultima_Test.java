package Player_Spell_Tests;

import Enemies.Enemy;
import Enemies.Fighters.Orc;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Enemies.Fighters.Weapons.WarHammer;
import Players.MagicalUsers.Spells.Ultima;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ultima_Test {

    Ultima ultima;
    Enemy enemy;
    IWeaponEnemy warHammer;

    @Before
    public void before() {
        ultima = new Ultima();
        enemy = new Orc("Uzul", 1000, 100, 100, warHammer);
        warHammer = new WarHammer();
    }

    @Test
    public void canDamage() {
        ultima.cast(enemy);
        assertEquals(700, enemy.getHealthValue());
    }

    @Test
    public void canDamageMagical() {
        ultima.cast(enemy);
        assertEquals(50, enemy.getMagicalResistance());
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
