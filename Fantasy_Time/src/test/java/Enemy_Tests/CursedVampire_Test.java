package Enemy_Tests;

import Enemies.Fighters.CursedVampire;
import Enemies.Fighters.Weapons.BattleAxe;
import Enemies.Fighters.Weapons.BloodDagger;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Players.Player;
import Players.Warriors.Barbarian;
import Players.Warriors.Weapons.GreatSword;
import Players.Warriors.Weapons.IWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CursedVampire_Test {

    CursedVampire cursedVampire;
    IWeaponEnemy bloodDagger;
    IWeaponEnemy battleAxe;
    Player player;
    IWeapon greatsword;

    @Before
    public void before() {
        cursedVampire = new CursedVampire("Bella", 500, bloodDagger, 100);
        battleAxe = new BattleAxe();
        bloodDagger = new BloodDagger();
        player = new Barbarian("Conan", 600, greatsword, 80);
        greatsword = new GreatSword();
    }

    @Test
    public void hasName() {
        assertEquals("Bella", cursedVampire.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(500, cursedVampire.getHealthValue());
    }

}
