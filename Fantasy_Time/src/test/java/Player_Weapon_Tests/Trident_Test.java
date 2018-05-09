package Player_Weapon_Tests;

import Enemies.Enemy;
import Enemies.Fighters.Orc;
import Players.Warriors.Weapons.GreatSword;
import Players.Warriors.Weapons.Trident;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Trident_Test {

    Trident trident;
    Enemy enemy;

    @Before
    public void before() {
        trident = new Trident();
        enemy = new Orc("Uzul", 1000);
    }

    @Test
    public void canAttack() {
        trident.attack(enemy);
        assertEquals(860, enemy.getHealthValue());
    }

}
