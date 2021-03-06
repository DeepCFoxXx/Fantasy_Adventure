package Player_Weapon_Tests;

import Enemies.Enemy;
import Enemies.Fighters.Orc;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Players.Warriors.Weapons.WarAxe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarAxe_Test {

    WarAxe warAxe;
    Enemy enemy;
    IWeaponEnemy warhammer;

    @Before
    public void before() {
        warAxe = new WarAxe();
        enemy = new Orc("Uzul", 1000, 100, 100, warhammer);
    }

    @Test
    public void canDamage() {
        warAxe.attack(enemy);
        assertEquals(800, enemy.getHealthValue());
    }

    @Test
    public void canReducePhysical() {
        warAxe.attack(enemy);
        assertEquals(50, enemy.getPhysicalResistance());
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
