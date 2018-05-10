package Enemy_Weapon_Tests;

import Enemies.Fighters.Weapons.OrcishSword;
import Enemies.Fighters.Weapons.WarMace;
import Players.Player;
import Players.Warriors.Barbarian;
import Players.Warriors.Weapons.IWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcishSword_Test {

    OrcishSword orcishSword;
    Player barbarian;
    IWeapon greatSword;

    @Before
    public void before() {
        orcishSword = new OrcishSword();
        barbarian = new Barbarian("Conan", 600, greatSword, 80);
    }

    @Test
    public void canDamage() {
        orcishSword.attack(barbarian);
        assertEquals(475, barbarian.getHealthValue());
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
