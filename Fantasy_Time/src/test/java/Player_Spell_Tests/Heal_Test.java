package Player_Spell_Tests;

import Players.MagicalUsers.Healing_Spells.Heal;
import Players.MagicalUsers.Healing_Spells.IHeal;
import Players.Player;
import Players.Warriors.Barbarian;
import Players.Warriors.Weapons.GreatSword;
import Players.Warriors.Weapons.IWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Heal_Test {

    IHeal iHeal;
    Heal heal;
    Player barbarian;
    IWeapon greatSword;

    @Before
    public void before() {
        heal = new Heal();
        barbarian = new Barbarian("Conan", 600, 80, 10, 50, 60, 20, false, greatSword, 100);
        greatSword = new GreatSword();
    }

    @Test
    public void hasHealValue() {
        assertEquals(100, heal.getHealValue());
    }

}