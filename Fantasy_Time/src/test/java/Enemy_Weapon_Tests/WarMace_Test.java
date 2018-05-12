package Enemy_Weapon_Tests;

import Enemies.Fighters.Weapons.WarMace;
import Players.Player;
import Players.Warriors.Barbarian;
import Players.Warriors.Weapons.IWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarMace_Test {

    WarMace warMace;
    Player barbarian;
    IWeapon greatSword;

    @Before
    public void before() {
        warMace = new WarMace();
        barbarian = new Barbarian("Conan", 600, 80, 10, 50, 60, 20, false, greatSword, 100);
    }

    @Test
    public void canDamage() {
        warMace.attack(barbarian);
        assertEquals(470, barbarian.getHealthValue());
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
