package Enemy_Weapon_Tests;

import Enemies.Fighters.Weapons.IWeaponEnemy;
import Enemies.Fighters.Weapons.WarHammer;
import Players.Player;
import Players.Warriors.Barbarian;
import Players.Warriors.Weapons.IWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Warhammer_Test {

    WarHammer warHammer;
    Player barbarian;
    IWeapon greatSword;

    @Before
    public void before() {
        warHammer = new WarHammer();
        barbarian = new Barbarian("Conan", 600, greatSword, 80);
    }

    @Test
    public void canDamage() {
        warHammer.attack(barbarian);
        assertEquals(400, barbarian.getHealthValue());
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
