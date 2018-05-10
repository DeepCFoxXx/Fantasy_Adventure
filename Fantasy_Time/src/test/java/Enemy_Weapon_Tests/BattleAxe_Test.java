package Enemy_Weapon_Tests;

import Enemies.Fighters.Weapons.BattleAxe;
import Enemies.Fighters.Weapons.OrcishSword;
import Players.Player;
import Players.Warriors.Barbarian;
import Players.Warriors.Weapons.IWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BattleAxe_Test {

    BattleAxe battleAxe;
    Player barbarian;
    IWeapon greatSword;

    @Before
    public void before() {
        battleAxe = new BattleAxe();
        barbarian = new Barbarian("Conan", 600, greatSword, 80);
    }

    @Test
    public void canDamage() {
        battleAxe.attack(barbarian);
        assertEquals(420, barbarian.getHealthValue());
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
