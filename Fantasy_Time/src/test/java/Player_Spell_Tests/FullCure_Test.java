package Player_Spell_Tests;

import Players.MagicalUsers.Healing_Spells.Cure;
import Players.MagicalUsers.Healing_Spells.FullCure;
import Players.Player;
import Players.Warriors.Barbarian;
import Players.Warriors.Weapons.GreatSword;
import Players.Warriors.Weapons.IWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FullCure_Test {

    FullCure fullCure;
    Player barbarian;
    IWeapon greatSword;

    @Before
    public void before() {
        fullCure = new FullCure();
        barbarian = new Barbarian("Conan", 600, 80, 10, 50, 60, 20, false, greatSword, 100);
        greatSword = new GreatSword();
    }

    @Test
    public void canIncreaseHealth() {
        barbarian.takeDamage(599);
        fullCure.heal(barbarian);
        assertEquals(501, barbarian.getHealthValue());
    }

    @Test
    public void canIncreaseDefence() {
        barbarian.takeDefenceDamage(30);
        fullCure.heal(barbarian);
        assertEquals(70, barbarian.getDefence());
    }

    @Test
    public void canIncreaseVitality() {
        barbarian.takeVitalityDamage(59);
        fullCure.heal(barbarian);
        assertEquals(51, barbarian.getVitality());
    }

}
