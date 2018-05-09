package Player_Tests;

import Enemies.Enemy;
import Enemies.Fighters.Orc;
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

    @Before
    public void before() {
        barbarian = new Barbarian("Conan", 600, greatSword);
        enemy = new Orc("Uzul", 1000);
        greatSword = new GreatSword();
        warAxe = new WarAxe();
    }

    @Test
    public void hasName() {
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(600, barbarian.getHealthValue());
    }

    @Test
    public void canAttack() {
        barbarian.attack(enemy, greatSword);
        assertEquals(820, enemy.getHealthValue());
    }

}
