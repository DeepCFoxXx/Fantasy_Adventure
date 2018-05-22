package Boss_Tests;

import Enemies.Boss_Enemies.Boss_Weapons.AbyssalSpear;
import Enemies.Boss_Enemies.Boss_Weapons.DeathScythe;
import Enemies.Boss_Enemies.Boss_Weapons.IBossWeapon;
import Enemies.Boss_Enemies.EbonyWarrior;
import Enemies.Boss_Enemies.MasterVampire;
import Players.Player;
import Players.Warriors.Barbarian;
import Players.Warriors.Weapons.GreatSword;
import Players.Warriors.Weapons.IWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MasterVampire_Test {

    MasterVampire masterVampire;
    IBossWeapon deathScythe;
    IBossWeapon abyssalSpear;
    Player player;
    IWeapon greatSword;

    @Before
    public void before() {
        masterVampire = new MasterVampire("Constantia", 1200, 200, 500, abyssalSpear);
        deathScythe = new DeathScythe();
        abyssalSpear = new AbyssalSpear();
        player = new Barbarian("Conan", 600, 80, 10, 50, 60, 20, false, greatSword, 100);
        greatSword = new GreatSword();
    }

    //Enemy Stat Tests
    @Test
    public void hasName() {
        assertEquals("Constantia", masterVampire.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(1200, masterVampire.getHealthValue());
    }

    @Test
    public void hasPhysicalResistance() {
        assertEquals(200, masterVampire.getPhysicalResistance());
    }

    @Test
    public void hasMagicalResistance() {
        assertEquals(500, masterVampire.getMagicalResistance());
    }

    @Test
    public void canReducePhysicalResistance() {
        masterVampire.takePhysicalStatDamage(50);
        assertEquals(150, masterVampire.getPhysicalResistance());
    }

    @Test
    public void canReduceMagicalResistance() {
        masterVampire.takeMagicalStatDamage(250);
        assertEquals(250, masterVampire.getMagicalResistance());
    }

    @Test
    public void canTakeDamage() {
        masterVampire.takeDamage(1000);
        assertEquals(200, masterVampire.getHealthValue());
    }

    //Boss Tests
    @Test
    public void canAttack() {
        masterVampire.setWeapon(abyssalSpear);
        masterVampire.attack(player);
        assertEquals(300, player.getHealthValue());
    }

    @Test
    public void canReducePlayerStrength() {
        masterVampire.setWeapon(abyssalSpear);
        masterVampire.attack(player);
        assertEquals(60, player.getStrength());
    }

    @Test
    public void canReducePlayerMagic() {
        masterVampire.setWeapon(abyssalSpear);
        masterVampire.attack(player);
        assertEquals(-10, player.getMagic());
    }

    @Test
    public void canReducePlayerDefence() {
        masterVampire.setWeapon(abyssalSpear);
        masterVampire.attack(player);
        assertEquals(10, player.getDefence());
    }

    @Test
    public void canReducePlayerVitality() {
        masterVampire.setWeapon(abyssalSpear);
        masterVampire.attack(player);
        assertEquals(-40, player.getVitality());
    }

    @Test
    public void canReducePlayerLuck() {
        masterVampire.setWeapon(abyssalSpear);
        masterVampire.attack(player);
        assertEquals(10, player.getLuck());
    }

    @Test
    public void canPoisonPlayer() {
        masterVampire.setWeapon(abyssalSpear);
        deathScythe.attack(player);
        assertEquals(true, player.getPoisonStatus());
    }

    @Test
    public void canSwapWeapons() {
        masterVampire.setWeapon(deathScythe);
        masterVampire.attack(player);
        assertEquals(200, player.getHealthValue());
    }

    //Player Tests
    @Test
    public void playerHasName() {
        assertEquals("Conan", player.getName());
    }

    @Test
    public void playerHasHealthValue() {
        assertEquals(600, player.getHealthValue());
    }



}
