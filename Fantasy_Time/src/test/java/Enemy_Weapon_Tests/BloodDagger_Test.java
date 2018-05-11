package Enemy_Weapon_Tests;

import Enemies.Fighters.Weapons.BloodDagger;
import Enemies.Fighters.Weapons.WarHammer;
import Players.Player;
import Players.Warriors.Barbarian;
import Players.Warriors.Weapons.IWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BloodDagger_Test {

    BloodDagger bloodDagger;
    Player barbarian;
    IWeapon greatSword;

    @Before
    public void before() {
        bloodDagger = new BloodDagger();
        barbarian = new Barbarian("Conan", 600, greatSword, 80);
    }

    @Test
    public void canDamage() {
        bloodDagger.attack(barbarian);
        assertEquals(500, barbarian.getHealthValue());
    }

    @Test
    public void PlayerHasName() {
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void PlayerHasHealthValue() {
        assertEquals(600, barbarian.getHealthValue());
    }

}


