package Player_Weapon_Tests;

import Enemies.Enemy;
import Enemies.Fighters.Orc;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Players.Warriors.Weapons.GreatSword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreatSword_Test {

    GreatSword greatSword;
    Enemy enemy;
    IWeaponEnemy warhammer;

    @Before
    public void before() {
        greatSword = new GreatSword();
        enemy = new Orc("Uzul", 1000, 100, 100, warhammer);
    }

    @Test
    public void canAttack() {
        greatSword.attack(enemy);
        assertEquals(820, enemy.getHealthValue());
    }

    @Test
    public void canReducePhysical() {
        greatSword.attack(enemy);
        assertEquals(60, enemy.getPhysicalResistance());
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
    public void enemyHasPhysicalResistance() {
        assertEquals(100, enemy.getPhysicalResistance());
    }

}
