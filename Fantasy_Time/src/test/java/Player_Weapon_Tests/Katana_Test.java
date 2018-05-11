package Player_Weapon_Tests;

import Enemies.Enemy;
import Enemies.Fighters.Orc;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Players.Warriors.Weapons.Katana;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Katana_Test {

    Katana katana;
    Enemy enemy;
    IWeaponEnemy warhammer;

    @Before
    public void before() {
        katana = new Katana();
        enemy = new Orc("Uzul", 1000, warhammer);
    }

    @Test
    public void canDamage() {
        katana.attack(enemy);
        assertEquals(790, enemy.getHealthValue());
    }

    @Test
    public void EnemyHasName() {
        assertEquals("Uzul", enemy.getName());
    }

    @Test
    public void EnemyHasHealthValue() {
        assertEquals(1000, enemy.getHealthValue());
    }

}
