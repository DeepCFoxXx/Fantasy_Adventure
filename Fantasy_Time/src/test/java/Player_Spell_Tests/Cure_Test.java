package Player_Spell_Tests;

import Players.MagicalUsers.Healing_Spells.Cure;
import Players.Player;
import Players.Warriors.Barbarian;
import Players.Warriors.Weapons.GreatSword;
import Players.Warriors.Weapons.IWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Cure_Test {

    Cure cure;
    Player barbarian;
    IWeapon greatSword;

    @Before
    public void before() {
        cure = new Cure();
        barbarian = new Barbarian("Conan", 600, 80, 10, 50, 60, 20, false, greatSword, 100);
        greatSword = new GreatSword();
    }

    @Test
    public void canIncreaseHealth() {
        barbarian.takeDamage(500);
        cure.heal(barbarian);
        assertEquals(300, barbarian.getHealthValue());
    }

    @Test
    public void canIncreaseDefence() {
        barbarian.takeDefenceDamage(40);
        cure.heal(barbarian);
        assertEquals(20, barbarian.getDefence());
    }

}
