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

    @Test
    public void hasThirstValue() {
        assertEquals(100, cursedVampire.getThirstValue());
    }

    @Test
    public void canTakeDamage() {
        cursedVampire.takeDamage(200);
        assertEquals(300, cursedVampire.getHealthValue());
    }

    @Test
    public void canAttack() {
        cursedVampire.attack(player, bloodDagger);
        assertEquals(500, player.getHealthValue());
    }

    @Test
    public void canSwapWeapon() {
        cursedVampire.setWeapon(battleAxe);
        cursedVampire.attack(player);
        assertEquals(420, player.getHealthValue());
    }

    @Test
    public void playerHasName() {
        assertEquals("Conan", player.getName());
    }

    @Test
    public void playerHasHealthValue() {
        assertEquals(600, player.getHealthValue());
    }

    @Test
    public void canDamageStats() {
        cursedVampire.takeStatDamage(50);
        assertEquals(50, cursedVampire.getThirstValue());
    }

}
