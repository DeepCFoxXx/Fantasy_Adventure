package Player_Spell_Tests;

import Players.MagicalUsers.Healing_Spells.Cure;
import Players.MagicalUsers.Healing_Spells.Heal;
import Players.MagicalUsers.Healing_Spells.IAddHealth;
import Players.Player;
import Players.Warriors.Barbarian;
import Players.Warriors.Weapons.GreatSword;
import Players.Warriors.Weapons.IWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Cure_Test {

    IAddHealth iHeal;
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
    public void hasHealValue() {
        assertEquals(250, cure.getHealValue());
    }

}
