package Player_Weapon_Tests;

import Enemies.Enemy;
import Enemies.Fighters.Orc;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Players.Warriors.Weapons.GreatSword;
import Players.Warriors.Weapons.IWeapon;
import Players.Warriors.Weapons.Trident;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Trident_Test {

    Trident trident;
    Enemy enemy;
    IWeaponEnemy warhammer;

    @Before
    public void before() {
        trident = new Trident();
        enemy = new Orc("Uzul", 1000, 100, 100, warhammer);
    }

    @Test
    public void canAttack() {
        trident.attack(enemy);
        assertEquals(860, enemy.getHealthValue());
    }

    @Test
    public void canReducePhysical() {
        trident.attack(enemy);
        assertEquals(70, enemy.getPhysicalResistance());
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
